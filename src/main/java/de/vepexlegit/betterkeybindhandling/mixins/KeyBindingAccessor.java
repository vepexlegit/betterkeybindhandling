package de.vepexlegit.betterkeybindhandling.mixins;

import net.minecraft.client.settings.KeyBinding;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import java.util.List;

@Mixin(KeyBinding.class)
public interface KeyBindingAccessor {
    @Accessor
    static List<KeyBinding> getKeybindArray() {
        throw new UnsupportedOperationException("Mixin failed to inject!");
    }
}
