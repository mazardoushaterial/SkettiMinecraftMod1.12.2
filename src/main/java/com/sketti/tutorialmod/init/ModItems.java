package com.sketti.tutorialmod.init;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

import com.sketti.tutorialmod.items.ItemBase;
import com.sketti.tutorialmod.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class ModItems 
{

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby",3,250,8.0f,3.0f,10);

	//Items
	public static final Item RUBY = new ItemBase("ruby");
	
	//Tools
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	
	
}
