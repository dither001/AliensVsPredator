
package org.avp.client.model.entities;

import org.avp.entities.EntitySporePod;

import com.asx.mdx.lib.client.util.models.Model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;

public class ModelSporePod extends Model
{
    public ModelRenderer podBase01;
    public ModelRenderer podBase02;
    public ModelRenderer podBase03;
    public ModelRenderer podBase04;
    public ModelRenderer podBase05;
    public ModelRenderer podBase06;
    public ModelRenderer pod01a;
    public ModelRenderer pod01b;
    public ModelRenderer pod01c;
    public ModelRenderer pod01d;
    public ModelRenderer pod01e;
    public ModelRenderer pod01f;
    public ModelRenderer pod02a;
    public ModelRenderer pod02b;
    public ModelRenderer pod02c;
    public ModelRenderer pod02d;
    public ModelRenderer pod02e;
    public ModelRenderer pod02f;
    public ModelRenderer pod03a;
    public ModelRenderer pod03b;
    public ModelRenderer pod03c;
    public ModelRenderer pod03d;
    public ModelRenderer pod03e;
    public ModelRenderer pod03f;
    public ModelRenderer pod04a;
    public ModelRenderer pod04b;
    public ModelRenderer pod04c;
    public ModelRenderer pod04d;
    public ModelRenderer pod04e;
    public ModelRenderer pod04f;
    public ModelRenderer pod05a;
    public ModelRenderer pod05b;
    public ModelRenderer pod05c;
    public ModelRenderer pod05d;
    public ModelRenderer pod05e;
    public ModelRenderer pod05f;
    public ModelRenderer pod06a;
    public ModelRenderer pod06b;
    public ModelRenderer pod06c;
    public ModelRenderer pod06d;
    public ModelRenderer pod06e;
    public ModelRenderer pod06f;

    public ModelSporePod()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.pod06e = new ModelRenderer(this, 19, 8);
        this.pod06e.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pod06e.addBox(-2.0F, -5.6F, -2.0F, 4, 1, 4, 0.0F);
        this.podBase02 = new ModelRenderer(this, 0, 0);
        this.podBase02.setRotationPoint(4.8F, 23.5F, 4.3F);
        this.podBase02.addBox(-1.5F, -0.5F, -1.5F, 3, 1, 3, 0.0F);
        this.setRotation(podBase02, 0.0F, 0.0F, 0.18203784098300857F);
        this.podBase03 = new ModelRenderer(this, 0, 0);
        this.podBase03.setRotationPoint(-5.4F, 24.0F, 3.7F);
        this.podBase03.addBox(-1.5F, -0.5F, -1.5F, 3, 1, 3, 0.0F);
        this.setRotation(podBase03, -0.045553093477052F, -0.091106186954104F, -0.27314402793711257F);
        this.podBase04 = new ModelRenderer(this, 0, 0);
        this.podBase04.setRotationPoint(0.0F, 24.1F, -3.6F);
        this.podBase04.addBox(-1.5F, -0.5F, -1.5F, 3, 1, 3, 0.0F);
        this.setRotation(podBase04, 0.36425021489121656F, 0.0F, -0.18203784098300857F);
        this.pod04d = new ModelRenderer(this, 19, 0);
        this.pod04d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pod04d.addBox(-2.5F, -4.8F, -2.5F, 5, 2, 5, 0.0F);
        this.pod05e = new ModelRenderer(this, 19, 8);
        this.pod05e.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pod05e.addBox(-2.0F, -5.6F, -2.0F, 4, 1, 4, 0.0F);
        this.pod01c = new ModelRenderer(this, 0, 18);
        this.pod01c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pod01c.addBox(-3.0F, -3.9F, -3.0F, 6, 3, 6, 0.0F);
        this.pod06c = new ModelRenderer(this, 0, 18);
        this.pod06c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pod06c.addBox(-3.0F, -3.9F, -3.0F, 6, 3, 6, 0.0F);
        this.pod05b = new ModelRenderer(this, 0, 11);
        this.pod05b.setRotationPoint(0.0F, -0.1F, 0.0F);
        this.pod05b.addBox(-2.5F, -1.1F, -2.5F, 5, 1, 5, 0.0F);
        this.pod03f = new ModelRenderer(this, 25, 15);
        this.pod03f.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pod03f.addBox(-1.0F, -6.5F, -1.0F, 2, 1, 2, 0.0F);
        this.pod05f = new ModelRenderer(this, 25, 15);
        this.pod05f.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pod05f.addBox(-1.0F, -6.5F, -1.0F, 2, 1, 2, 0.0F);
        this.pod04e = new ModelRenderer(this, 19, 8);
        this.pod04e.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pod04e.addBox(-2.0F, -5.6F, -2.0F, 4, 1, 4, 0.0F);
        this.pod06d = new ModelRenderer(this, 19, 0);
        this.pod06d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pod06d.addBox(-2.5F, -4.8F, -2.5F, 5, 2, 5, 0.0F);
        this.pod03b = new ModelRenderer(this, 0, 11);
        this.pod03b.setRotationPoint(0.0F, -0.1F, 0.0F);
        this.pod03b.addBox(-2.5F, -1.1F, -2.5F, 5, 1, 5, 0.0F);
        this.podBase05 = new ModelRenderer(this, 0, 0);
        this.podBase05.setRotationPoint(-3.4F, 23.5F, -1.3F);
        this.podBase05.addBox(-1.5F, -0.5F, -1.5F, 3, 1, 3, 0.0F);
        this.setRotation(podBase05, 0.27314402793711257F, 0.0F, -0.40980330836826856F);
        this.pod04a = new ModelRenderer(this, 0, 5);
        this.pod04a.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pod04a.addBox(-2.0F, -0.7F, -2.0F, 4, 1, 4, 0.0F);
        this.pod06a = new ModelRenderer(this, 0, 5);
        this.pod06a.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pod06a.addBox(-2.0F, -0.7F, -2.0F, 4, 1, 4, 0.0F);
        this.pod02a = new ModelRenderer(this, 0, 5);
        this.pod02a.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pod02a.addBox(-2.0F, -0.7F, -2.0F, 4, 1, 4, 0.0F);
        this.pod03d = new ModelRenderer(this, 19, 0);
        this.pod03d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pod03d.addBox(-2.5F, -4.8F, -2.5F, 5, 2, 5, 0.0F);
        this.pod06b = new ModelRenderer(this, 0, 11);
        this.pod06b.setRotationPoint(0.0F, -0.1F, 0.0F);
        this.pod06b.addBox(-2.5F, -1.1F, -2.5F, 5, 1, 5, 0.0F);
        this.pod06f = new ModelRenderer(this, 25, 15);
        this.pod06f.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pod06f.addBox(-1.0F, -6.5F, -1.0F, 2, 1, 2, 0.0F);
        this.pod02c = new ModelRenderer(this, 0, 18);
        this.pod02c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pod02c.addBox(-3.0F, -3.9F, -3.0F, 6, 3, 6, 0.0F);
        this.pod04f = new ModelRenderer(this, 25, 15);
        this.pod04f.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pod04f.addBox(-1.0F, -6.5F, -1.0F, 2, 1, 2, 0.0F);
        this.pod01f = new ModelRenderer(this, 25, 15);
        this.pod01f.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pod01f.addBox(-1.0F, -6.5F, -1.0F, 2, 1, 2, 0.0F);
        this.pod02d = new ModelRenderer(this, 19, 0);
        this.pod02d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pod02d.addBox(-2.5F, -4.8F, -2.5F, 5, 2, 5, 0.0F);
        this.podBase06 = new ModelRenderer(this, 0, 0);
        this.podBase06.setRotationPoint(2.9F, 23.5F, -2.0F);
        this.podBase06.addBox(-1.5F, -0.5F, -1.5F, 3, 1, 3, 0.0F);
        this.setRotation(podBase06, 0.18203784098300857F, 0.0F, 0.22759093446006054F);
        this.pod01e = new ModelRenderer(this, 19, 8);
        this.pod01e.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pod01e.addBox(-2.0F, -5.6F, -2.0F, 4, 1, 4, 0.0F);
        this.pod01d = new ModelRenderer(this, 19, 0);
        this.pod01d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pod01d.addBox(-2.5F, -4.8F, -2.5F, 5, 2, 5, 0.0F);
        this.pod03a = new ModelRenderer(this, 0, 5);
        this.pod03a.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pod03a.addBox(-2.0F, -0.7F, -2.0F, 4, 1, 4, 0.0F);
        this.pod05c = new ModelRenderer(this, 0, 18);
        this.pod05c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pod05c.addBox(-3.0F, -3.9F, -3.0F, 6, 3, 6, 0.0F);
        this.pod02e = new ModelRenderer(this, 19, 8);
        this.pod02e.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pod02e.addBox(-2.0F, -5.6F, -2.0F, 4, 1, 4, 0.0F);
        this.pod05d = new ModelRenderer(this, 19, 0);
        this.pod05d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pod05d.addBox(-2.5F, -4.8F, -2.5F, 5, 2, 5, 0.0F);
        this.pod04c = new ModelRenderer(this, 0, 18);
        this.pod04c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pod04c.addBox(-3.0F, -3.9F, -3.0F, 6, 3, 6, 0.0F);
        this.pod03c = new ModelRenderer(this, 0, 18);
        this.pod03c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pod03c.addBox(-3.0F, -3.9F, -3.0F, 6, 3, 6, 0.0F);
        this.pod03e = new ModelRenderer(this, 19, 8);
        this.pod03e.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pod03e.addBox(-2.0F, -5.6F, -2.0F, 4, 1, 4, 0.0F);
        this.pod02f = new ModelRenderer(this, 25, 15);
        this.pod02f.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pod02f.addBox(-1.0F, -6.5F, -1.0F, 2, 1, 2, 0.0F);
        this.pod01b = new ModelRenderer(this, 0, 11);
        this.pod01b.setRotationPoint(0.0F, -0.1F, 0.0F);
        this.pod01b.addBox(-2.5F, -1.1F, -2.5F, 5, 1, 5, 0.0F);
        this.pod02b = new ModelRenderer(this, 0, 11);
        this.pod02b.setRotationPoint(0.0F, -0.1F, 0.0F);
        this.pod02b.addBox(-2.5F, -1.1F, -2.5F, 5, 1, 5, 0.0F);
        this.pod05a = new ModelRenderer(this, 0, 5);
        this.pod05a.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pod05a.addBox(-2.0F, -0.7F, -2.0F, 4, 1, 4, 0.0F);
        this.podBase01 = new ModelRenderer(this, 0, 0);
        this.podBase01.setRotationPoint(0.2F, 23.6F, 1.5F);
        this.podBase01.addBox(-1.5F, -0.5F, -1.5F, 3, 1, 3, 0.0F);
        this.setRotation(podBase01, 0.136659280431156F, 0.0F, -0.136659280431156F);
        this.pod04b = new ModelRenderer(this, 0, 11);
        this.pod04b.setRotationPoint(0.0F, -0.1F, 0.0F);
        this.pod04b.addBox(-2.5F, -1.1F, -2.5F, 5, 1, 5, 0.0F);
        this.pod01a = new ModelRenderer(this, 0, 5);
        this.pod01a.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pod01a.addBox(-2.0F, -0.7F, -2.0F, 4, 1, 4, 0.0F);
        this.podBase06.addChild(this.pod06e);
        this.podBase04.addChild(this.pod04d);
        this.podBase05.addChild(this.pod05e);
        this.podBase01.addChild(this.pod01c);
        this.podBase06.addChild(this.pod06c);
        this.podBase05.addChild(this.pod05b);
        this.podBase03.addChild(this.pod03f);
        this.podBase05.addChild(this.pod05f);
        this.podBase04.addChild(this.pod04e);
        this.podBase06.addChild(this.pod06d);
        this.podBase03.addChild(this.pod03b);
        this.podBase04.addChild(this.pod04a);
        this.podBase06.addChild(this.pod06a);
        this.podBase02.addChild(this.pod02a);
        this.podBase03.addChild(this.pod03d);
        this.podBase06.addChild(this.pod06b);
        this.podBase06.addChild(this.pod06f);
        this.podBase02.addChild(this.pod02c);
        this.podBase04.addChild(this.pod04f);
        this.podBase01.addChild(this.pod01f);
        this.podBase02.addChild(this.pod02d);
        this.podBase01.addChild(this.pod01e);
        this.podBase01.addChild(this.pod01d);
        this.podBase03.addChild(this.pod03a);
        this.podBase05.addChild(this.pod05c);
        this.podBase02.addChild(this.pod02e);
        this.podBase05.addChild(this.pod05d);
        this.podBase04.addChild(this.pod04c);
        this.podBase03.addChild(this.pod03c);
        this.podBase03.addChild(this.pod03e);
        this.podBase02.addChild(this.pod02f);
        this.podBase01.addChild(this.pod01b);
        this.podBase02.addChild(this.pod02b);
        this.podBase05.addChild(this.pod05a);
        this.podBase04.addChild(this.pod04b);
        this.podBase01.addChild(this.pod01a);
    }

    @Override
    public void render(Object obj)
    {
        int podCount = 5;
        
        if (obj != null && obj instanceof EntitySporePod)
        {
            EntitySporePod pod = (EntitySporePod) obj;
            podCount = pod.getPodCount();
        }
        
        if (podCount > 4)
        draw(this.podBase02);
        if (podCount > 3)
        draw(this.podBase03);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.podBase04.offsetX, this.podBase04.offsetY, this.podBase04.offsetZ);
        GlStateManager.translate(this.podBase04.rotationPointX * DEFAULT_SCALE, this.podBase04.rotationPointY * DEFAULT_SCALE, this.podBase04.rotationPointZ * DEFAULT_SCALE);
        GlStateManager.scale(0.6D, 0.6D, 0.6D);
        GlStateManager.translate(-this.podBase04.offsetX, -this.podBase04.offsetY, -this.podBase04.offsetZ);
        GlStateManager.translate(-this.podBase04.rotationPointX * DEFAULT_SCALE, -this.podBase04.rotationPointY * DEFAULT_SCALE, -this.podBase04.rotationPointZ * DEFAULT_SCALE);
        if (podCount > 2)
        draw(this.podBase04);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.podBase05.offsetX, this.podBase05.offsetY, this.podBase05.offsetZ);
        GlStateManager.translate(this.podBase05.rotationPointX * DEFAULT_SCALE, this.podBase05.rotationPointY * DEFAULT_SCALE, this.podBase05.rotationPointZ * DEFAULT_SCALE);
        GlStateManager.scale(0.8D, 0.8D, 0.8D);
        GlStateManager.translate(-this.podBase05.offsetX, -this.podBase05.offsetY, -this.podBase05.offsetZ);
        GlStateManager.translate(-this.podBase05.rotationPointX * DEFAULT_SCALE, -this.podBase05.rotationPointY * DEFAULT_SCALE, -this.podBase05.rotationPointZ * DEFAULT_SCALE);
        if (podCount > 1)
        draw(this.podBase05);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.podBase06.offsetX, this.podBase06.offsetY, this.podBase06.offsetZ);
        GlStateManager.translate(this.podBase06.rotationPointX * DEFAULT_SCALE, this.podBase06.rotationPointY * DEFAULT_SCALE, this.podBase06.rotationPointZ * DEFAULT_SCALE);
        GlStateManager.scale(0.8D, 0.8D, 0.8D);
        GlStateManager.translate(-this.podBase06.offsetX, -this.podBase06.offsetY, -this.podBase06.offsetZ);
        GlStateManager.translate(-this.podBase06.rotationPointX * DEFAULT_SCALE, -this.podBase06.rotationPointY * DEFAULT_SCALE, -this.podBase06.rotationPointZ * DEFAULT_SCALE);
        if (podCount > 0)
        draw(this.podBase06);
        GlStateManager.popMatrix();
        draw(this.podBase01);
    }
}
