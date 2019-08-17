package com.frienddementor.obsidiantools.items.tools;

import com.frienddementor.obsidiantools.Main;
import com.frienddementor.obsidiantools.init.ModItems;
import com.frienddementor.obsidiantools.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel {

	public ToolAxe(String name, ToolMaterial material)
	{
		super(material, 8.0F, -3.1F);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this);
	}
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
}
