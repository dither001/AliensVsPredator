package org.avp.block.skulls;

import org.avp.AliensVsPredator;
import org.avp.block.BlockSkull;
import org.avp.client.model.tile.skulls.ModelBiomaskClassic;

import com.arisux.mdx.lib.client.render.OpenGL;
import com.arisux.mdx.lib.client.render.Texture;
import com.arisux.mdx.lib.client.render.model.MapModelTexture;

import net.minecraft.client.model.ModelRenderer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockBiomaskClassic extends BlockSkull
{
    @SideOnly(Side.CLIENT)
    private static class Resources
    {
        private static final MapModelTexture<ModelBiomaskClassic> model = AliensVsPredator.resources().models().BIOMASK_CLASSIC;
    }

    @Override
    public ModelRenderer[] getSkullModelRenderers()
    {
        ModelBiomaskClassic m = Resources.model.getModel();
        return new ModelRenderer[] { m.biomaskMouth };
    }

    @Override
    public void preRenderTransforms()
    {
        float scale = 1.9F;
        OpenGL.scale(scale, scale, scale);
        OpenGL.translate(0F, -1.3F, 0F);
    }

    @Override
    public Texture getSkullTexture()
    {
        return Resources.model.getTexture();
    }
}
