package com.frienddementor.obsidiantools.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	static float ITEM_TO_NUGGET_EXP = 3f;

	public static void init()
	{
		GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(ModItems.OBSIDIAN_INGOT), 1.5f);
		// Tools
		GameRegistry.addSmelting(ModItems.OBSIDIAN_AXE, new ItemStack(ModItems.OBSIDIAN_NUGGET), ITEM_TO_NUGGET_EXP);
		GameRegistry.addSmelting(ModItems.OBSIDIAN_PICKAXE, new ItemStack(ModItems.OBSIDIAN_NUGGET), ITEM_TO_NUGGET_EXP);
		GameRegistry.addSmelting(ModItems.OBSIDIAN_HOE, new ItemStack(ModItems.OBSIDIAN_NUGGET), ITEM_TO_NUGGET_EXP);
		GameRegistry.addSmelting(ModItems.OBSIDIAN_SHOVEL, new ItemStack(ModItems.OBSIDIAN_NUGGET), ITEM_TO_NUGGET_EXP);
		GameRegistry.addSmelting(ModItems.OBSIDIAN_SWORD, new ItemStack(ModItems.OBSIDIAN_NUGGET), ITEM_TO_NUGGET_EXP);
		// Armor
		GameRegistry.addSmelting(ModItems.OBSIDIAN_BOOTS, new ItemStack(ModItems.OBSIDIAN_NUGGET), ITEM_TO_NUGGET_EXP);
		GameRegistry.addSmelting(ModItems.OBSIDIAN_CHESTPLATE, new ItemStack(ModItems.OBSIDIAN_NUGGET), ITEM_TO_NUGGET_EXP);
		GameRegistry.addSmelting(ModItems.OBSIDIAN_HELMET, new ItemStack(ModItems.OBSIDIAN_NUGGET), ITEM_TO_NUGGET_EXP);
		GameRegistry.addSmelting(ModItems.OBSIDIAN_LEGGINGS, new ItemStack(ModItems.OBSIDIAN_NUGGET), ITEM_TO_NUGGET_EXP);
	}
}
