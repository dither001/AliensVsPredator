package org.avp.client.render.entities.living;

import org.avp.AliensVsPredator;
import org.avp.client.model.entities.living.ModelDracoburster;
import org.avp.entities.living.species.xenomorphs.EntityDracoburster;

import com.asx.mdx.lib.client.util.OpenGL;
import com.asx.mdx.lib.client.util.entity.RenderLivingWrapper;

import net.minecraft.client.renderer.entity.RenderManager;

public class RenderDracoburster extends RenderLivingWrapper<EntityDracoburster, ModelDracoburster>
{
    public RenderDracoburster(RenderManager m)
    {
        super(m, AliensVsPredator.resources().models().DRACOBURSTER);
    }
    
    @Override
    public void doRender(EntityDracoburster entity, double posX, double posY, double posZ, float yaw, float renderPartialTicks)
    {
        super.doRender(entity, posX, posY, posZ, yaw, renderPartialTicks);
    }

    @Override
    protected void preRenderCallback(EntityDracoburster entityliving, float renderPartialTicks)
    {
        float scale = 0.75F;
        OpenGL.scale(scale, scale, scale);
        super.preRenderCallback(entityliving, renderPartialTicks);
    }
}
