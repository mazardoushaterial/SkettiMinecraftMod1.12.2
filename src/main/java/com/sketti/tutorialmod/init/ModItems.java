package com.sketti.tutorialmod.init;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

import com.sketti.tutorialmod.items.ItemBase;
import com.sketti.tutorialmod.items.armor.ArmorBase;
import com.sketti.tutorialmod.items.tools.ToolSword;
import com.sketti.tutorialmod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSword;

public class ModItems 
{

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby",3,250,8.0f,3.0f,10);
	public static final ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial("armor material ruby", Reference.MOD_ID + ":ruby", 14, new int[] {2, 5, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f);
	
	//Items
	public static final Item RUBY = new ItemBase("ruby");
	
	//Tools
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	
	//Armor
	public static final Item RUBY_HELMET = new ArmorBase("ruby_helmet", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD);
	public static final Item RUBY_CHESTPLATE = new ArmorBase("ruby_chestplate", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST);
	public static final Item RUBY_LEGGINGS = new ArmorBase("ruby_leggings", ARMOR_MATERIAL_RUBY, 2, EntityEquipmentSlot.LEGS);
	public static final Item RUBY_BOOTS = new ArmorBase("ruby_boots", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET);
}
