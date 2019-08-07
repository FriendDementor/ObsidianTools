package com.frienddementor.obsidiantools;

import com.frienddementor.obsidiantools.init.ModRecipes;
import com.frienddementor.obsidiantools.proxy.CommonProxy;
import com.frienddementor.obsidiantools.util.R;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = R.MOD_ID, name = R.NAME, version = R.VERSION)
public class Main {

	@Instance
	public static Main instance;

	@SidedProxy(clientSide = R.CLIENT_PROXY_CLASS, serverSide = R.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{

	}

	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModRecipes.init();
	}

	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{

	}
}
