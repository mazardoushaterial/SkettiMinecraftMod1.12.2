package com.sketti.tutorialmod.blocks;

import java.util.Random;

import com.sketti.tutorialmod.Main;
import com.sketti.tutorialmod.init.ModBlocks;
import com.sketti.tutorialmod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class RubyOre extends BlockBase
{
	public RubyOre(String name, Material material)
	{
		super(name,material);
		
		setSoundType(SoundType.METAL); //sound when walking over
		setHardness(5.0f);
		setResistance(15.0f); 
		setHarvestLevel("pickaxe",2);
		setLightLevel(1.0f);
		//setLightLevel(1);
		//setBlockUnbreakable();
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		
		return ModItems.RUBY;
	}
	
	@Override 
	public int quantityDropped(Random rand)
	{
		int max = 4;
		int min = 1;
		return rand.nextInt(max) + min;
	}
	
}
