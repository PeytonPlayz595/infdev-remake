package net.minecraft.src;

import net.lax1dude.eaglercraft.opengl.GlStateManager;

public class RenderHelper {
	private static final Vec3D_112 LIGHT0_POS = (new Vec3D_112(0.20000000298023224D, 1.0D, -0.699999988079071D)).normalize();
	private static final Vec3D_112 LIGHT1_POS = (new Vec3D_112(-0.20000000298023224D, 1.0D, 0.699999988079071D)).normalize();
	
	static boolean init = false;

	public static void disableStandardItemLighting() {
		GlStateManager.disableLighting();
		GlStateManager.disableMCLight(0);
		GlStateManager.disableMCLight(1);
		GlStateManager.disableColorMaterial();
	}

	public static void enableStandardItemLighting() {
		GlStateManager.enableLighting();
		GlStateManager.enableMCLight(0, 0.6f, LIGHT0_POS.xCoord, LIGHT0_POS.yCoord, LIGHT0_POS.zCoord, 0.0D);
		GlStateManager.enableMCLight(1, 0.6f, LIGHT1_POS.xCoord, LIGHT1_POS.yCoord, LIGHT1_POS.zCoord, 0.0D);
		GlStateManager.setMCLightAmbient(0.4f, 0.4f, 0.4f);
		GlStateManager.enableColorMaterial();
	}
}
