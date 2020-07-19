package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ExampleMod implements ModInitializer {

	public static final NetherRod NETHER_ROD = new NetherRod(FabricBlockSettings.of(Material.METAL).hardness(4.0f));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Registry.register(Registry.BLOCK, new Identifier("tiny_pieces", "nether_rod"), NETHER_ROD);
		Registry.register(Registry.ITEM, new Identifier("tiny_pieces", "nether_rod"), new BlockItem(NETHER_ROD, new Item.Settings().group(ItemGroup.MISC)));
		System.out.println("This is printed by the tiny pieces mod by Expora08, Expora09 and cybercat5555 Thanks for downloading!");

	}
}
