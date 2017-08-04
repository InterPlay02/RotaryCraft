/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2017
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 01/04/2017 2:51:28 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;
import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelSpillway extends RotaryModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape2a;
	LODModelPart Shape2;
	LODModelPart Shape3;
	LODModelPart Shape4;
	LODModelPart Shape5;
	LODModelPart Shape6;
	LODModelPart Shape4b;
	LODModelPart Shape2b;
	LODModelPart Shape2c;
	LODModelPart Shape2d;
	LODModelPart Shape2e;

	public ModelSpillway()
	{
		textureWidth = 128;
		textureHeight = 64;

		Shape1 = new LODModelPart(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape1.setRotationPoint(-8F, 23F, -8F);
		Shape1.setTextureSize(128, 64);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape2a = new LODModelPart(this, 98, 0);
		Shape2a.addBox(0F, 0F, 0F, 8, 13, 1);
		Shape2a.setRotationPoint(0F, 10F, 7F);
		Shape2a.setTextureSize(128, 64);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0F);
		Shape2 = new LODModelPart(this, 98, 16);
		Shape2.addBox(0F, 0F, 0F, 8, 15, 1);
		Shape2.setRotationPoint(-8F, 8F, 7F);
		Shape2.setTextureSize(128, 64);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new LODModelPart(this, 34, 36);
		Shape3.addBox(0F, 0F, 0F, 1, 13, 14);
		Shape3.setRotationPoint(7F, 10F, -7F);
		Shape3.setTextureSize(128, 64);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new LODModelPart(this, 66, 0);
		Shape4.addBox(0F, 0F, 0F, 1, 12, 14);
		Shape4.setRotationPoint(-2.9F, 11.4F, -7F);
		Shape4.setTextureSize(128, 64);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new LODModelPart(this, 0, 19);
		Shape5.addBox(0.3F, -0.5F, 0F, 5, 1, 14);
		Shape5.setRotationPoint(-6.5F, 8.8F, -7F);
		Shape5.setTextureSize(128, 64);
		Shape5.mirror = true;
		this.setRotation(Shape5, 0F, 0F, 0.6108652F);
		Shape6 = new LODModelPart(this, 0, 36);
		Shape6.addBox(0F, 0F, 0F, 2, 1, 14);
		Shape6.setRotationPoint(-8F, 8.5F, -7F);
		Shape6.setTextureSize(128, 64);
		Shape6.mirror = true;
		this.setRotation(Shape6, 0F, 0F, 0F);
		Shape4b = new LODModelPart(this, 66, 30);
		Shape4b.addBox(0F, 0F, 0F, 1, 14, 14);
		Shape4b.setRotationPoint(-8F, 9F, -7F);
		Shape4b.setTextureSize(128, 64);
		Shape4b.mirror = true;
		this.setRotation(Shape4b, 0F, 0F, 0F);
		Shape2b = new LODModelPart(this, 98, 16);
		Shape2b.addBox(0F, 0F, 0F, 8, 15, 1);
		Shape2b.setRotationPoint(-8F, 8F, -8F);
		Shape2b.setTextureSize(128, 64);
		Shape2b.mirror = true;
		this.setRotation(Shape2b, 0F, 0F, 0F);
		Shape2c = new LODModelPart(this, 0, 53);
		Shape2c.addBox(0F, 0F, 0F, 4, 1, 1);
		Shape2c.setRotationPoint(0F, 9F, 7F);
		Shape2c.setTextureSize(128, 64);
		Shape2c.mirror = true;
		this.setRotation(Shape2c, 0F, 0F, 0F);
		Shape2d = new LODModelPart(this, 98, 0);
		Shape2d.addBox(0F, 0F, 0F, 8, 13, 1);
		Shape2d.setRotationPoint(0F, 10F, -8F);
		Shape2d.setTextureSize(128, 64);
		Shape2d.mirror = true;
		this.setRotation(Shape2d, 0F, 0F, 0F);
		Shape2e = new LODModelPart(this, 0, 53);
		Shape2e.addBox(0F, 0F, 0F, 4, 1, 1);
		Shape2e.setRotationPoint(0F, 9F, -8F);
		Shape2e.setTextureSize(128, 64);
		Shape2e.mirror = true;
		this.setRotation(Shape2e, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta)
	{
		Shape1.render(f5);
		Shape2a.render(f5);
		Shape2.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape5.render(f5);
		Shape6.render(f5);
		Shape4b.render(f5);
		Shape2b.render(f5);
		Shape2c.render(f5);
		Shape2d.render(f5);
		Shape2e.render(f5);
	}

}