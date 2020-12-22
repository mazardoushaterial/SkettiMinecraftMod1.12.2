package com.sketti.tutorialmod.init;

import java.util.ArrayList;
import java.util.List;

import com.sketti.tutorialmod.blocks.BlockBase;
import com.sketti.tutorialmod.blocks.RubyBlock;
import com.sketti.tutorialmod.blocks.RubyOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
	public static final Block RUBY_ORE = new RubyOre("ruby_ore",Material.ROCK);
}
