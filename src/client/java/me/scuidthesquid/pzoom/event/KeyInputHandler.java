package me.scuidthesquid.pzoom.event;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;

public class KeyInputHandler {
    public static final String KEY_ZOOM = "key.pzoom.zoom";
    public static final String KEY_CATEGORY_ZOOM = "key.category.pzoom.zoom";
    public static KeyBinding zoomKey;

    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if(zoomKey.isPressed()) {
                //zooooooom
                client.player.sendMessage(Text.of("Zoooooom"));
            }
        });
    }

    public static void register() {
        zoomKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_ZOOM,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_C,
                KEY_CATEGORY_ZOOM));

        registerKeyInputs();
    }

}
