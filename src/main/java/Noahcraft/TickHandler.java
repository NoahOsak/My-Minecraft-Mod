package Noahcraft;

import java.util.EnumSet;

import GUI.Client.GUIoptions;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class TickHandler implements ITickHandler{
private final Minecraft mc;

public TickHandler() {
mc = Minecraft.getMinecraft();
}

@Override
public void tickStart(EnumSet<TickType> type, Object... tickData) {

	
}

@Override
public void tickEnd(EnumSet<TickType> type, Object... tickData) {
	if (mc.gameSettings.showDebugInfo == false) {
// setup render
GUIoptions guio = new GUIoptions ();
ScaledResolution res = new ScaledResolution(this.mc.gameSettings,
this.mc.displayWidth, this.mc.displayHeight);
FontRenderer fontRender = mc.fontRenderer;
int width = res.getScaledWidth();
int height = res.getScaledHeight();
mc.entityRenderer.setupOverlayRendering();

// draw
String text = guio.getGuiText();
int x = 2;
int y = 2;
int color = 0xFFFFFF;
fontRender.drawStringWithShadow(text, x, y, color);
	
}
}


@Override
public EnumSet<TickType> ticks() {
return EnumSet.of(TickType.RENDER);
}

@Override
public String getLabel() {
return "tickhandler";
}

}

