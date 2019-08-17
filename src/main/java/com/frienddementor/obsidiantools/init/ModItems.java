package com.frienddementor.obsidiantools.init;

import java.util.ArrayList;
import java.util.List;

import com.frienddementor.obsidiantools.items.ItemBase;
import com.frienddementor.obsidiantools.items.armor.ArmorBase;
import com.frienddementor.obsidiantools.items.tools.ToolAxe;
import com.frienddementor.obsidiantools.items.tools.ToolHoe;
import com.frienddementor.obsidiantools.items.tools.ToolPickaxe;
import com.frienddementor.obsidiantools.items.tools.ToolSpade;
import com.frienddementor.obsidiantools.items.tools.ToolSword;
import com.frienddementor.obsidiantools.util.R;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// Materials
	public static final ToolMaterial MATERIAL_OBSIDIAN = EnumHelper.addToolMaterial(
			"material_obsidian",
			ToolMaterial.IRON.getHarvestLevel(),
			ToolMaterial.DIAMOND.getMaxUses() * 3,
			ToolMaterial.IRON.getEfficiency(),
			ToolMaterial.IRON.getAttackDamage(),
			ToolMaterial.IRON.getEnchantability()
	);
	public static final ArmorMaterial ARMOR_OBSIDIAN = EnumHelper.addArmorMaterial(
			"armor_material_obsidian",
			R.MOD_ID + ":obsidian",
			99, // Diamond durability * 3
			new int[]{2, 5, 6, 2},
			9,
			SoundEvents.ITEM_ARMOR_EQUIP_IRON, 
			0.0F
	);
	// Items
	public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");
	public static final Item OBSIDIAN_NUGGET = new ItemBase("obsidian_nugget");

	// Tools
	public static final ItemSword OBSIDIAN_SWORD = new ToolSword("obsidian_sword", MATERIAL_OBSIDIAN);
	public static final ItemSpade OBSIDIAN_SHOVEL = new ToolSpade("obsidian_shovel", MATERIAL_OBSIDIAN);
	public static final ItemPickaxe OBSIDIAN_PICKAXE = new ToolPickaxe("obsidian_pickaxe", MATERIAL_OBSIDIAN);
	public static final ItemAxe OBSIDIAN_AXE = new ToolAxe("obsidian_axe", MATERIAL_OBSIDIAN);
	public static final ItemHoe OBSIDIAN_HOE = new ToolHoe("obsidian_hoe", MATERIAL_OBSIDIAN);
	
	// ARMOR
	public static final Item OBSIDIAN_HELMET = new ArmorBase("obsidian_helmet", ARMOR_OBSIDIAN, 1, EntityEquipmentSlot.HEAD);
	public static final Item OBSIDIAN_CHESTPLATE = new ArmorBase("obsidian_chestplate", ARMOR_OBSIDIAN, 1, EntityEquipmentSlot.CHEST);
	public static final Item OBSIDIAN_LEGGINGS = new ArmorBase("obsidian_leggings", ARMOR_OBSIDIAN, 2, EntityEquipmentSlot.LEGS);
	public static final Item OBSIDIAN_BOOTS = new ArmorBase("obsidian_boots", ARMOR_OBSIDIAN, 1, EntityEquipmentSlot.FEET);

	
}
