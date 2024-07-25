package de.lemaik.chunkymap;

import net.minecraft.MinecraftVersion;

import java.io.File;

public class FabricPlatform extends Platform {
	@Override
	public File getDataFolder() {
		return new File("ChunkyMap");
	}
	
	@Override
	public File getDynmapDataFolder() {
		return new File("dynmap");
	}
	
	@Override
	public String getMinecraftVersion() {
		return MinecraftVersion.CURRENT.getName();
	}
}
