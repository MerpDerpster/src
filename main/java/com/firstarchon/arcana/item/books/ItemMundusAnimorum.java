package com.firstarchon.arcana.item.books;

import net.minecraft.item.ItemStack;

import com.firstarchon.arcana.creativetab.CreativeTabArcanaItems;
import com.firstarchon.arcana.item.ItemArcana;

public class ItemMundusAnimorum extends ItemArcana {

	public ItemMundusAnimorum() {
		super("itemMundusAnimorum");
	}

	@Override
	public boolean hasEffect(ItemStack par1ItemStack)
	{
		return true;
	}
	
}
