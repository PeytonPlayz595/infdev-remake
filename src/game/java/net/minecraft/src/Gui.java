package net.minecraft.src;

import org.lwjgl.opengl.GL11;

import net.lax1dude.eaglercraft.opengl.BufferBuilder;
import net.lax1dude.eaglercraft.opengl.Tessellator;
import net.lax1dude.eaglercraft.opengl.VertexFormat;
import net.peyton.eagler.minecraft.FontRenderer;

public class Gui {
	protected float zLevel = 0.0F;

	protected void drawGradientRect(int var1, int var2, int var3, int var4, int var5, int var6) {
		float var7 = (float)(var5 >> 24 & 255) / 255.0F;
		float var8 = (float)(var5 >> 16 & 255) / 255.0F;
		float var9 = (float)(var5 >> 8 & 255) / 255.0F;
		float var10 = (float)(var5 & 255) / 255.0F;
		float var11 = (float)(var6 >> 24 & 255) / 255.0F;
		float var12 = (float)(var6 >> 16 & 255) / 255.0F;
		float var13 = (float)(var6 >> 8 & 255) / 255.0F;
		float var14 = (float)(var6 & 255) / 255.0F;
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glDisable(GL11.GL_ALPHA_TEST);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		Tessellator tess = Tessellator.getInstance();
		BufferBuilder var15 = tess.getWorldRenderer();
		var15.begin(7, VertexFormat.POSITION_COLOR);
		var15.pos((double)var3, (double)var2, 0.0D).setColorRGBA_F(var8, var9, var10, var7).endVertex();
		var15.pos((double)var1, (double)var2, 0.0D).setColorRGBA_F(var8, var9, var10, var7).endVertex();
		var15.pos((double)var1, (double)var4, 0.0D).setColorRGBA_F(var12, var13, var14, var11).endVertex();
		var15.pos((double)var3, (double)var4, 0.0D).setColorRGBA_F(var12, var13, var14, var11).endVertex();
		tess.draw();
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glEnable(GL11.GL_ALPHA_TEST);
		GL11.glEnable(GL11.GL_TEXTURE_2D);
	}

	public void drawCenteredString(FontRenderer var1, String var2, int var3, int var4, int var5) {
		var1.drawStringWithShadow(var2, var3 - var1.getStringWidth(var2) / 2, var4, var5);
	}

	public void drawString(FontRenderer var1, String var2, int var3, int var4, int var5) {
		var1.drawStringWithShadow(var2, var3, var4, var5);
	}

	public void drawTexturedModalRect(int var1, int var2, int var3, int var4, int var5, int var6) {
		float var7 = 0.00390625F;
		float var8 = 0.00390625F;
		Tessellator tess = Tessellator.getInstance();
		BufferBuilder var9 = tess.getWorldRenderer();
		var9.begin(7, VertexFormat.POSITION_TEX);
		var9.posUV((double)(var1 + 0), (double)(var2 + var6), (double)this.zLevel, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + var6) * var8)).endVertex();
		var9.posUV((double)(var1 + var5), (double)(var2 + var6), (double)this.zLevel, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + var6) * var8)).endVertex();
		var9.posUV((double)(var1 + var5), (double)(var2 + 0), (double)this.zLevel, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + 0) * var8)).endVertex();
		var9.posUV((double)(var1 + 0), (double)(var2 + 0), (double)this.zLevel, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + 0) * var8)).endVertex();
		tess.draw();
	}
}
