package Noahcraft;

import java.util.EnumSet;
import java.util.Iterator;

import GUI.Client.GUIoptions;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;
import cpw.mods.fml.client.registry.KeyBindingRegistry.KeyHandler;
import cpw.mods.fml.common.TickType;
class Keybindings extends KeyHandler
{
     private EnumSet tickTypes = EnumSet.of(TickType.CLIENT);

     public Keybindings(KeyBinding[] keyBindings, boolean[] repeatings)
     {
         super(keyBindings, repeatings);
     }
     @Override
     public String getLabel()
     {
         return "TutorialKey";
     }
     @Override
     public void keyDown(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd, boolean isRepeat)
     {
         //what to do when key is pressed/down
    	 if (Minecraft.getMinecraft().currentScreen != null) {
    			 
    	 } else {
    	 Minecraft.getMinecraft().displayGuiScreen(new GUIoptions());
    	 }
     }
     @Override
     public void keyUp(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd)
     {
         //What to do when key is released/up
     }
     @Override
     public EnumSet<TickType> ticks()
     {
         return tickTypes;
     }
}

