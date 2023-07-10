package me.jtech.evogen.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {
    public static final String KEY_CATEGORY_DEBUG = "key.category.evogen.debug";
    public static final String KEY_TOGGLE_LISTEN = "key.evogen.toggle_listen";

    public static final KeyMapping LISTEN_KEY = new KeyMapping(KEY_TOGGLE_LISTEN, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_Y, KEY_CATEGORY_DEBUG);
}
