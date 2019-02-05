package Noahcraft;

import GUI.Client.GUIoptions;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Item1 extends Item{

	public Item1(int par1) {
		super(par1);
		// TODO Auto-generated constructor stub
	}
@Override
public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
//	Minecraft.getMinecraft().displayGuiScreen(new GUIoptions());
	return super.onItemRightClick(item, world, player);
}
}
