package de.vepexlegit.betterkeybindhandling.mixins;

import de.vepexlegit.betterkeybindhandling.Config;
import de.vepexlegit.betterkeybindhandling.MinecraftHook;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class MixinMinecraft {
    @Inject(method = "setIngameFocus", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/MouseHelper;grabMouseCursor()V"))
    private void patcher$makeKeysReRegister(CallbackInfo ci) {
        if (Config.newKeybindHandling && !Minecraft.isRunningOnMac) {
            MinecraftHook.updateKeyBindState();
        }
    }
}
