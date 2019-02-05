package GUI.Client;



import java.awt.TextField;
import java.util.EnumSet;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap.Key;

import cpw.mods.fml.common.TickType;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.ResourceLocation;
import scala.reflect.internal.Trees.CaseDef;


public class GUIoptions extends GuiScreen {
	
	int GuiWidth = 176;
	int GuiHeight = 88;
	GuiTextField text;
	GuiButton doneButton;
	public static String haveText = "Noah's Minecraft Beta 1.5_05";
	int buttonID = 0;
	
	
	@Override
	public void initGui() {
		int GuiX = (width - 105) / 2; //gui width
		int GuiY = (height + 35) / 2; //gui height
		buttonList.clear();
		buttonList.add(doneButton = new GuiButton(buttonID, GuiX, GuiY, 100, 20, "Done"));
		text = new GuiTextField(this.fontRenderer, this.width / 2 - 68, this.height/2 - 30, 137, 20); // new textfield created
        text.setMaxStringLength(50);
        text.setFocused(false);
        text.setText(haveText);
        Keyboard.enableRepeatEvents(true);
		super.initGui();
	}
	
	protected void keyTyped(char par1, int par2)
    {
        super.keyTyped(par1, par2);
        text.textboxKeyTyped(par1, par2);
    }
	
	public void updateScreen()
    {
        super.updateScreen();
        text.updateCursorCounter();
    }
	
	@Override
	public void drawScreen(int x, int y, float ticks) {
		
			int GuiX = (width - GuiWidth) / 2; //gui width
			int GuiY = (height - GuiHeight) / 2; //gui height
			GL11.glColor4f(1, 1, 1, 1); //Colour of gui
			drawDefaultBackground();
			FontRenderer fontRender = mc.fontRenderer;
			mc.renderEngine.bindTexture(new ResourceLocation("modid", "textures/gui/basicGUI.png"));
			drawTexturedModalRect(GuiX, GuiY, 0, 0, GuiWidth, GuiHeight);
			text.drawTextBox();
			super.drawScreen(x, y, ticks);
		
		
	}

	@Override
	protected void actionPerformed(GuiButton button) { //This method will trigger when the button is pressed
		switch (buttonID) {
		case 0:
			mc.thePlayer.closeScreen();
		    haveText = text.getText();
		    break;
		case 1:
			break;
		}
			
		super.actionPerformed(button);
	}
	
	 protected void mouseClicked(int x, int y, int btn) {
	        super.mouseClicked(x, y, btn);
	        this.text.mouseClicked(x, y, btn);
	    }
	
	public String getGuiText() {
		return haveText;
	}
	
	}


