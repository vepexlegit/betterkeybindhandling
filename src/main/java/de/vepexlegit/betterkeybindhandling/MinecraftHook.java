package de.vepexlegit.betterkeybindhandling;

import de.vepexlegit.betterkeybindhandling.mixins.KeyBindingAccessor;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

public class MinecraftHook {
    public static void updateKeyBindState() {
        for (KeyBinding keybinding : KeyBindingAccessor.getKeybindArray()) {
            try {
                final int keyCode = keybinding.getKeyCode();
                KeyBinding.setKeyBindState(keyCode, keyCode < 256 && Keyboard.isKeyDown(keyCode));
            } catch (IndexOutOfBoundsException ignored) {
            }
        }
    }
}
