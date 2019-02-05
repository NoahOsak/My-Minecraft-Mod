package Noahcraft;

import org.lwjgl.input.Keyboard;

import Noahcraft.proxies.CommonProxy;
import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

//about mod information /*
@Mod(modid = "modid", name = "Noahcraft", version = "Alpha v0.1")
public class Main {
	
	//variables here
	public static Block block1; //defined the block as block1.
	public static Block block2;
	public static Item item1;
	
	
	
	@SidedProxy(clientSide="Noahcraft.proxies.ClientProxy",
			serverSide="Noahcraft.proxies.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//blocks and items init
		proxy.preInit(event);
		//##################################################
		//creates new block with id
//		block1 = new Block1(1525, Material.cloth)
//		.setUnlocalizedName("block1")
		
		//sets the block in the creative block tab
//		.setCreativeTab(CreativeTabs.tabBlock)
		//texture
//		.setTextureName("modid:block1525");
		
		
		//defines in-game block name
//		LanguageRegistry.addName(block1, "My 1st Block");
		
		//sets block harvest level
//		MinecraftForge.setBlockHarvestLevel(block1, "pickaxe", 3);
		
		
//		GameRegistry.registerBlock(block1, "block1");
		//##################################################
//		block2 = new Block1(1526, Material.cloth)
//		.setUnlocalizedName("block2")
//		.setCreativeTab(CreativeTabs.tabBlock)
//		.setTextureName("modid:block1526");
//		LanguageRegistry.addName(block2, "My 2nd Block");		
//		MinecraftForge.setBlockHarvestLevel(block1, "pickaxe", 2);		
//		GameRegistry.registerBlock(block2, "block2");
		//##################################################
//		item1 = new Item1(1527)
//		.setUnlocalizedName("item1")
//		.setCreativeTab(CreativeTabs.tabMaterials)
//		.setTextureName("modid:item1527");
//		LanguageRegistry.addName(item1, "My 1st item");			
//		GameRegistry.registerItem(item1, "item1");
		//##################################################
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		//init tiles, entity
		proxy.init(event);
		//adds new crafting recipe
//		GameRegistry.addRecipe(new ItemStack(block1),
//		"dd ",
//		"dd ",
//		"   ",
//		'd', Block.dirt);
		
//		GameRegistry.addRecipe(new ItemStack(item1),
//				"d  ",
//				" b ",
//				"  d",
//				'd', Block.dirt, 'b', block1);
//		
		//adds a furnace recipe
//		GameRegistry.addSmelting(item1.itemID, new ItemStack(Item.diamond), 0.1f);
		
			KeyBinding[] key = {new KeyBinding("Version Gui Menu", Keyboard.KEY_F4)};
			     boolean[] repeat = {false};
			     KeyBindingRegistry.registerKeyBinding(new Keybindings(key, repeat));
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
		
}
