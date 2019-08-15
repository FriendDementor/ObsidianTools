package com.frienddementor.obsidiantools.init;

import java.util.ArrayList;
import java.util.List;

import com.frienddementor.obsidiantools.items.ItemBase;
import com.frienddementor.obsidiantools.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// Materials
	public static final ToolMaterial MATERIAL_OBSIDIAN = EnumHelper.addToolMaterial(
			"material_obsidian",
			ToolMaterial.IRON.getHarvestLevel(),
			ToolMaterial.DIAMOND.getMaxUses(),
			ToolMaterial.IRON.getEfficiency(),
			ToolMaterial.IRON.getAttackDamage(),
			ToolMaterial.IRON.getEnchantability()
	);
	
	// Items
	public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");

	// Tools
	public static final ItemSword OBSIDIAN_SWORD = new ToolSword("obsidian_sword", MATERIAL_OBSIDIAN);
}
