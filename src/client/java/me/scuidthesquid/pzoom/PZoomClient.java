package me.scuidthesquid.pzoom;

import me.scuidthesquid.pzoom.event.KeyInputHandler;
import net.fabricmc.api.ClientModInitializer;

public class PZoomClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		KeyInputHandler.register();

	}
}