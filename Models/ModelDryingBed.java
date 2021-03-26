/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2017
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 13/09/2014 8:00:45 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;

import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelDryingBed extends RotaryModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape1a;
	LODModelPart Shape2;
	LODModelPart Shape3;
	LODModelPart Shape3a;
	LODModelPart Shape2a;
	LODModelPart Shape2b;
	LODModelPart Shape4;
	LODModelPart Shape4a;
	LODModelPart Shape4b;
	LODModelPart Shape4c;
	LODModelPart Shape2c;
	LODModelPart Shape2d;
	LODModelPart Shape4d;
	LODModelPart Shape4e;
	LODModelPart Shape4f;
	LODModelPart Shape4g;
	LODModelPart Shape4h;
	LODModelPart Shape4i;
	LODModelPart Shape4k;
	LODModelPart Shape4j;
	LODModelPart Shape4m;
	LODModelPart Shape4n;
	LODModelPart Shape4o;
	LODModelPart Shape4p;
	LODModelPart Shape2e;
	LODModelPart Shape2f;
	LODModelPart Shape5;
	LODModelPart Shape6;
	LODModelPart Shape6a;
	LODModelPart Shape6b;
	LODModelPart Shape6c;
	LODModelPart Shape6d;
	LODModelPart Shape6e;
	LODModelPart Shape6f;
	LODModelPart Shape6g;
	LODModelPart Shape6h;
	LODModelPart Shape6i;
	LODModelPart Shape6j;
	LODModelPart Shape6k;

	public ModelDryingBed()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new LODModelPart(this, 0, 61);
		Shape1.addBox(0F, 0F, 0F, 16, 2, 1);
		Shape1.setRotationPoint(-8F, 8F, 7F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape1a = new LODModelPart(this, 0, 56);
		Shape1a.addBox(0F, 0F, 0F, 16, 2, 1);
		Shape1a.setRotationPoint(-8F, 8F, -8F);
		Shape1a.setTextureSize(128, 128);
		Shape1a.mirror = true;
		this.setRotation(Shape1a, 0F, 0F, 0F);
		Shape2 = new LODModelPart(this, 0, 22);
		Shape2.addBox(0F, 0F, 0F, 16, 2, 2);
		Shape2.setRotationPoint(-8F, 10F, 6F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new LODModelPart(this, 0, 65);
		Shape3.addBox(0F, 0F, 0F, 1, 2, 14);
		Shape3.setRotationPoint(7F, 8F, -7F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape3a = new LODModelPart(this, 0, 0);
		Shape3a.addBox(0F, 0F, 0F, 1, 2, 14);
		Shape3a.setRotationPoint(-8F, 8F, -7F);
		Shape3a.setTextureSize(128, 128);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, 0F, 0F);
		Shape2a = new LODModelPart(this, 0, 27);
		Shape2a.addBox(0F, 0F, 0F, 16, 2, 2);
		Shape2a.setRotationPoint(-8F, 10F, -8F);
		Shape2a.setTextureSize(128, 128);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0F);
		Shape2b = new LODModelPart(this, 0, 44);
		Shape2b.addBox(0F, 0F, 0F, 16, 2, 1);
		Shape2b.setRotationPoint(-8F, 10F, 3F);
		Shape2b.setTextureSize(128, 128);
		Shape2b.mirror = true;
		this.setRotation(Shape2b, 0F, 0F, 0F);
		Shape4 = new LODModelPart(this, 19, 33);
		Shape4.addBox(0F, 0F, 0F, 2, 2, 2);
		Shape4.setRotationPoint(6F, 10F, 4F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape4a = new LODModelPart(this, 9, 33);
		Shape4a.addBox(0F, 0F, 0F, 2, 2, 2);
		Shape4a.setRotationPoint(1F, 10F, 4F);
		Shape4a.setTextureSize(128, 128);
		Shape4a.mirror = true;
		this.setRotation(Shape4a, 0F, 0F, 0F);
		Shape4b = new LODModelPart(this, 0, 33);
		Shape4b.addBox(0F, 0F, 0F, 2, 2, 2);
		Shape4b.setRotationPoint(-8F, 10F, 4F);
		Shape4b.setTextureSize(128, 128);
		Shape4b.mirror = true;
		this.setRotation(Shape4b, 0F, 0F, 0F);
		Shape4c = new LODModelPart(this, 9, 33);
		Shape4c.addBox(0F, 0F, 0F, 2, 2, 2);
		Shape4c.setRotationPoint(-3F, 10F, 4F);
		Shape4c.setTextureSize(128, 128);
		Shape4c.mirror = true;
		this.setRotation(Shape4c, 0F, 0F, 0F);
		Shape2c = new LODModelPart(this, 0, 38);
		Shape2c.addBox(0F, 0F, -1.5F, 14, 1, 4);
		Shape2c.setRotationPoint(-7F, 10.5F, 3F);
		Shape2c.setTextureSize(128, 128);
		Shape2c.mirror = true;
		this.setRotation(Shape2c, 0F, 0F, 0F);
		Shape2d = new LODModelPart(this, 0, 17);
		Shape2d.addBox(0F, 0F, 0F, 16, 2, 2);
		Shape2d.setRotationPoint(-8F, 10F, -1F);
		Shape2d.setTextureSize(128, 128);
		Shape2d.mirror = true;
		this.setRotation(Shape2d, 0F, 0F, 0F);
		Shape4d = new LODModelPart(this, 0, 33);
		Shape4d.addBox(0F, 0F, 0F, 2, 2, 2);
		Shape4d.setRotationPoint(-8F, 10F, -6F);
		Shape4d.setTextureSize(128, 128);
		Shape4d.mirror = true;
		this.setRotation(Shape4d, 0F, 0F, 0F);
		Shape4e = new LODModelPart(this, 0, 33);
		Shape4e.addBox(0F, 0F, 0F, 2, 2, 2);
		Shape4e.setRotationPoint(-8F, 10F, -3F);
		Shape4e.setTextureSize(128, 128);
		Shape4e.mirror = true;
		this.setRotation(Shape4e, 0F, 0F, 0F);
		Shape4f = new LODModelPart(this, 0, 33);
		Shape4f.addBox(0F, 0F, 0F, 2, 2, 2);
		Shape4f.setRotationPoint(-8F, 10F, 1F);
		Shape4f.setTextureSize(128, 128);
		Shape4f.mirror = true;
		this.setRotation(Shape4f, 0F, 0F, 0F);
		Shape4g = new LODModelPart(this, 19, 33);
		Shape4g.addBox(0F, 0F, 0F, 2, 2, 2);
		Shape4g.setRotationPoint(6F, 10F, -6F);
		Shape4g.setTextureSize(128, 128);
		Shape4g.mirror = true;
		this.setRotation(Shape4g, 0F, 0F, 0F);
		Shape4h = new LODModelPart(this, 19, 33);
		Shape4h.addBox(0F, 0F, 0F, 2, 2, 2);
		Shape4h.setRotationPoint(6F, 10F, -3F);
		Shape4h.setTextureSize(128, 128);
		Shape4h.mirror = true;
		this.setRotation(Shape4h, 0F, 0F, 0F);
		Shape4i = new LODModelPart(this, 19, 33);
		Shape4i.addBox(0F, 0F, 0F, 2, 2, 2);
		Shape4i.setRotationPoint(6F, 10F, 1F);
		Shape4i.setTextureSize(128, 128);
		Shape4i.mirror = true;
		this.setRotation(Shape4i, 0F, 0F, 0F);
		Shape4k = new LODModelPart(this, 9, 33);
		Shape4k.addBox(0F, 0F, 0F, 2, 2, 2);
		Shape4k.setRotationPoint(-3F, 10F, -6F);
		Shape4k.setTextureSize(128, 128);
		Shape4k.mirror = true;
		this.setRotation(Shape4k, 0F, 0F, 0F);
		Shape4j = new LODModelPart(this, 9, 33);
		Shape4j.addBox(0F, 0F, 0F, 2, 2, 2);
		Shape4j.setRotationPoint(-3F, 10F, -3F);
		Shape4j.setTextureSize(128, 128);
		Shape4j.mirror = true;
		this.setRotation(Shape4j, 0F, 0F, 0F);
		Shape4m = new LODModelPart(this, 9, 33);
		Shape4m.addBox(0F, 0F, 0F, 2, 2, 2);
		Shape4m.setRotationPoint(-3F, 10F, 1F);
		Shape4m.setTextureSize(128, 128);
		Shape4m.mirror = true;
		this.setRotation(Shape4m, 0F, 0F, 0F);
		Shape4n = new LODModelPart(this, 9, 33);
		Shape4n.addBox(0F, 0F, 0F, 2, 2, 2);
		Shape4n.setRotationPoint(1F, 10F, -6F);
		Shape4n.setTextureSize(128, 128);
		Shape4n.mirror = true;
		this.setRotation(Shape4n, 0F, 0F, 0F);
		Shape4o = new LODModelPart(this, 9, 33);
		Shape4o.addBox(0F, 0F, 0F, 2, 2, 2);
		Shape4o.setRotationPoint(1F, 10F, -3F);
		Shape4o.setTextureSize(128, 128);
		Shape4o.mirror = true;
		this.setRotation(Shape4o, 0F, 0F, 0F);
		Shape4p = new LODModelPart(this, 9, 33);
		Shape4p.addBox(0F, 0F, 0F, 2, 2, 2);
		Shape4p.setRotationPoint(1F, 10F, 1F);
		Shape4p.setTextureSize(128, 128);
		Shape4p.mirror = true;
		this.setRotation(Shape4p, 0F, 0F, 0F);
		Shape2e = new LODModelPart(this, 0, 44);
		Shape2e.addBox(0F, 0F, 0F, 16, 2, 1);
		Shape2e.setRotationPoint(-8F, 10F, -4F);
		Shape2e.setTextureSize(128, 128);
		Shape2e.mirror = true;
		this.setRotation(Shape2e, 0F, 0F, 0F);
		Shape2f = new LODModelPart(this, 0, 38);
		Shape2f.addBox(0F, 0F, -1.5F, 14, 1, 4);
		Shape2f.setRotationPoint(-7F, 10.5F, -4F);
		Shape2f.setTextureSize(128, 128);
		Shape2f.mirror = true;
		this.setRotation(Shape2f, 0F, 0F, 0F);
		Shape5 = new LODModelPart(this, 37, 0);
		Shape5.addBox(0F, 0F, 0F, 16, 8, 16);
		Shape5.setRotationPoint(-8F, 12F, -8F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		this.setRotation(Shape5, 0F, 0F, 0F);
		Shape6 = new LODModelPart(this, 0, 49);
		Shape6.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape6.setRotationPoint(6F, 20F, -8F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		this.setRotation(Shape6, 0F, 0F, 0F);
		Shape6a = new LODModelPart(this, 0, 49);
		Shape6a.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape6a.setRotationPoint(-8F, 20F, 6F);
		Shape6a.setTextureSize(128, 128);
		Shape6a.mirror = true;
		this.setRotation(Shape6a, 0F, 0F, 0F);
		Shape6b = new LODModelPart(this, 0, 49);
		Shape6b.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape6b.setRotationPoint(6F, 20F, 6F);
		Shape6b.setTextureSize(128, 128);
		Shape6b.mirror = true;
		this.setRotation(Shape6b, 0F, 0F, 0F);
		Shape6c = new LODModelPart(this, 0, 49);
		Shape6c.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape6c.setRotationPoint(2F, 20F, -8F);
		Shape6c.setTextureSize(128, 128);
		Shape6c.mirror = true;
		this.setRotation(Shape6c, 0F, 0F, 0F);
		Shape6d = new LODModelPart(this, 0, 49);
		Shape6d.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape6d.setRotationPoint(-8F, 20F, -8F);
		Shape6d.setTextureSize(128, 128);
		Shape6d.mirror = true;
		this.setRotation(Shape6d, 0F, 0F, 0F);
		Shape6e = new LODModelPart(this, 0, 49);
		Shape6e.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape6e.setRotationPoint(6F, 20F, -4F);
		Shape6e.setTextureSize(128, 128);
		Shape6e.mirror = true;
		this.setRotation(Shape6e, 0F, 0F, 0F);
		Shape6f = new LODModelPart(this, 0, 49);
		Shape6f.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape6f.setRotationPoint(6F, 20F, 2F);
		Shape6f.setTextureSize(128, 128);
		Shape6f.mirror = true;
		this.setRotation(Shape6f, 0F, 0F, 0F);
		Shape6g = new LODModelPart(this, 0, 49);
		Shape6g.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape6g.setRotationPoint(-4F, 20F, -8F);
		Shape6g.setTextureSize(128, 128);
		Shape6g.mirror = true;
		this.setRotation(Shape6g, 0F, 0F, 0F);
		Shape6h = new LODModelPart(this, 0, 49);
		Shape6h.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape6h.setRotationPoint(-4F, 20F, 6F);
		Shape6h.setTextureSize(128, 128);
		Shape6h.mirror = true;
		this.setRotation(Shape6h, 0F, 0F, 0F);
		Shape6i = new LODModelPart(this, 0, 49);
		Shape6i.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape6i.setRotationPoint(2F, 20F, 6F);
		Shape6i.setTextureSize(128, 128);
		Shape6i.mirror = true;
		this.setRotation(Shape6i, 0F, 0F, 0F);
		Shape6j = new LODModelPart(this, 0, 49);
		Shape6j.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape6j.setRotationPoint(-8F, 20F, -4F);
		Shape6j.setTextureSize(128, 128);
		Shape6j.mirror = true;
		this.setRotation(Shape6j, 0F, 0F, 0F);
		Shape6k = new LODModelPart(this, 0, 49);
		Shape6k.addBox(0F, 0F, 0F, 2, 4, 2);
		Shape6k.setRotationPoint(-8F, 20F, 2F);
		Shape6k.setTextureSize(128, 128);
		Shape6k.mirror = true;
		this.setRotation(Shape6k, 0F, 0F, 0F);
	}

	public void renderAll(TileEntity te, ArrayList li, float phi, float theta)
	{
		Shape1.render(te, f5);
		Shape1a.render(te, f5);
		Shape2.render(te, f5);
		Shape3.render(te, f5);
		Shape3a.render(te, f5);
		Shape2a.render(te, f5);
		Shape2b.render(te, f5);
		Shape4.render(te, f5);
		Shape4a.render(te, f5);
		Shape4b.render(te, f5);
		Shape4c.render(te, f5);
		Shape2c.render(te, f5);
		Shape2d.render(te, f5);
		Shape4d.render(te, f5);
		Shape4e.render(te, f5);
		Shape4f.render(te, f5);
		Shape4g.render(te, f5);
		Shape4h.render(te, f5);
		Shape4i.render(te, f5);
		Shape4k.render(te, f5);
		Shape4j.render(te, f5);
		Shape4m.render(te, f5);
		Shape4n.render(te, f5);
		Shape4o.render(te, f5);
		Shape4p.render(te, f5);
		Shape2e.render(te, f5);
		Shape2f.render(te, f5);
		Shape5.render(te, f5);
		Shape6.render(te, f5);
		Shape6a.render(te, f5);
		Shape6b.render(te, f5);
		Shape6c.render(te, f5);
		Shape6d.render(te, f5);
		Shape6e.render(te, f5);
		Shape6f.render(te, f5);
		Shape6g.render(te, f5);
		Shape6h.render(te, f5);
		Shape6i.render(te, f5);
		Shape6j.render(te, f5);
		Shape6k.render(te, f5);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}
