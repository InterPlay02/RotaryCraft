/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.RotaryCraft.API;

import net.minecraft.world.World;

public interface Screwdriverable {

	/** Return true to prevent further processing. */
	public boolean onShiftRightClick(World world, int x, int y, int z);

	/** Return true to prevent further processing. */
	public boolean onRightClick(World world, int x, int y, int z);

}