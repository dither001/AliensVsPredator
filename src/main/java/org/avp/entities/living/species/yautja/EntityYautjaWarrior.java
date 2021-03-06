package org.avp.entities.living.species.yautja;

import org.avp.ItemHandler;
import org.avp.entities.living.species.SpeciesYautja;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityYautjaWarrior extends SpeciesYautja
{
    public EntityYautjaWarrior(World world)
    {
        super(world);
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
    }
    
    @Override
    public ItemStack getPickedResult(RayTraceResult target)
    {
        return new ItemStack(ItemHandler.summonerYautjaWarrior);
    }
}
