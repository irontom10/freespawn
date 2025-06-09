package com.irontom10.client.model;

import com.mojang.blaze3d.vertex.*;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.*;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import com.irontom10.entity.BeeEntity; // your Bee entity class

public class BeeModel<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(new ResourceLocation("freespawn","bee"), "main");

    private final ModelPart sting, abdomnem1, abdomnem2, abdomnem3, abdomnem4, abdomnem5;
    private final ModelPart mainBody, neck, head, wingRight, wingLeft;
    private final ModelPart ra1, la1, la2, ra2, ra3, la3;
    private final ModelPart leftPom, rightPom, leftPincerExtra, leftPincerMain, rightPincerMain, rightPincerExtra;
    private final float wingspeed = 1.0f;

    public BeeModel(ModelPart root) {
        this.sting             = root.getChild("sting");
        this.abdomnem1         = root.getChild("abdomnem1");
        this.abdomnem2         = root.getChild("abdomnem2");
        this.abdomnem3         = root.getChild("abdomnem3");
        this.abdomnem4         = root.getChild("abdomnem4");
        this.abdomnem5         = root.getChild("abdomnem5");
        this.mainBody          = root.getChild("mainBody");
        this.neck              = root.getChild("neck");
        this.head              = root.getChild("head");
        this.wingRight         = root.getChild("wingRight");
        this.wingLeft          = root.getChild("wingLeft");
        this.ra1               = root.getChild("ra1");
        this.la1               = root.getChild("la1");
        this.la2               = root.getChild("la2");
        this.ra2               = root.getChild("ra2");
        this.ra3               = root.getChild("ra3");
        this.la3               = root.getChild("la3");
        this.leftPom           = root.getChild("leftPom");
        this.rightPom          = root.getChild("rightPom");
        this.leftPincerExtra   = root.getChild("leftPincerExtra");
        this.leftPincerMain    = root.getChild("leftPincerMain");
        this.rightPincerMain   = root.getChild("rightPincerMain");
        this.rightPincerExtra  = root.getChild("rightPincerExtra");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        // Sting
        root.addOrReplaceChild("sting",
                CubeListBuilder.create()
                        .texOffs(68, 0).addBox(-1, 0, -1, 2, 10, 2),
                PartPose.offsetAndRotation(0, 16, 1, -0.7853982F, 0, 0));

        // Abdomen segments 1–5
        root.addOrReplaceChild("abdomnem1",
                CubeListBuilder.create().texOffs(64,12).addBox(-2, 0, 0, 4, 8, 4),
                PartPose.offsetAndRotation(0,9,2, -0.5235988F,0,0));
        root.addOrReplaceChild("abdomnem2",
                CubeListBuilder.create().texOffs(60,24).addBox(-3, 0, 0, 6, 6, 6),
                PartPose.offset(0,5,0));
        root.addOrReplaceChild("abdomnem3",
                CubeListBuilder.create().texOffs(56,36).addBox(-4, 0, 0, 8, 7, 8),
                PartPose.offsetAndRotation(0,1,-2, 0.2617994F,0,0));
        root.addOrReplaceChild("abdomnem4",
                CubeListBuilder.create().texOffs(53,51).addBox(-5,0,0,10,12,10),
                PartPose.offsetAndRotation(0,-6,-8, 0.5934119F,0,0));
        root.addOrReplaceChild("abdomnem5",
                CubeListBuilder.create().texOffs(48,73).addBox(-6,0,0,12,12,12),
                PartPose.offsetAndRotation(0,-6,-15, 1.099557F,0,0));

        // Main body, neck & head
        root.addOrReplaceChild("mainBody",
                CubeListBuilder.create().texOffs(48,97).addBox(-6,0,-6,12,14,12),
                PartPose.offsetAndRotation(0,-12,-24, 1.48353F,0,0));
        root.addOrReplaceChild("neck",
                CubeListBuilder.create().texOffs(55,123).addBox(-4,-4,-8,8,8,8),
                PartPose.offset(0,-12,-23));
        root.addOrReplaceChild("head",
                CubeListBuilder.create().texOffs(51,139).addBox(-5,-5,-10,10,10,10),
                PartPose.offsetAndRotation(0,-13,-28, 0.2617994F,0,0));

        // Wings
        root.addOrReplaceChild("wingRight",
                CubeListBuilder.create().texOffs(0,91).addBox(0,0,0,0,8,24),
                PartPose.offsetAndRotation(-4,-14,-15, -0.7853982F,-0.5235988F,2.617994F));
        root.addOrReplaceChild("wingLeft",
                CubeListBuilder.create().texOffs(96,91).addBox(0,0,0,0,8,24),
                PartPose.offsetAndRotation(3,-14,-15, -0.7853982F, 0.5235988F,-2.617994F));

        // Legs & pincers
        root.addOrReplaceChild("ra1",
                CubeListBuilder.create().texOffs(47,152).addBox(0,-6,-1,1,6,1),
                PartPose.offsetAndRotation(-3,-17,-31, 0.2617994F,0.5235988F,0));
        root.addOrReplaceChild("la1",
                CubeListBuilder.create().texOffs(91,152).addBox(0,-6,-1,1,6,1),
                PartPose.offsetAndRotation(2,-17,-32, 0.2617994F,-0.5235988F,0));
        root.addOrReplaceChild("la2",
                CubeListBuilder.create().texOffs(91,145).addBox(0,-11,0,1,6,1),
                PartPose.offsetAndRotation(2,-17,-32, 0.4363323F,-0.6108652F,0));
        root.addOrReplaceChild("ra2",
                CubeListBuilder.create().texOffs(47,145).addBox(0,-11,0,1,6,1),
                PartPose.offsetAndRotation(-3,-17,-31,0.4363323F,0.6108652F,0));
        root.addOrReplaceChild("ra3",
                CubeListBuilder.create().texOffs(47,138).addBox(0,-16,2,1,6,1),
                PartPose.offsetAndRotation(-3,-17,-31,0.6108652F,0.6981317F,0));
        root.addOrReplaceChild("la3",
                CubeListBuilder.create().texOffs(91,138).addBox(0,-16,2,1,6,1),
                PartPose.offsetAndRotation(2,-17,-32,0.6108652F,-0.6981317F,0));
        root.addOrReplaceChild("leftPom",
                CubeListBuilder.create().texOffs(89,134).addBox(4,-16,-6,2,2,2),
                PartPose.offset(2,-17,-32));
        root.addOrReplaceChild("rightPom",
                CubeListBuilder.create().texOffs(45,134).addBox(-5,-16,-7,2,2,2),
                PartPose.offset(-3,-17,-31));

        // Pincers
        root.addOrReplaceChild("leftPincerExtra",
                CubeListBuilder.create().texOffs(71,166).addBox(-2,0,-6,2,1,2),
                PartPose.offsetAndRotation(2,-8,-36,0.1745329F,-0.1745329F,0));
        root.addOrReplaceChild("leftPincerMain",
                CubeListBuilder.create().texOffs(71,159).addBox(0,0,-6,2,1,6),
                PartPose.offsetAndRotation(2,-8,-36,0.1745329F,-0.1745329F,0));
        root.addOrReplaceChild("rightPincerMain",
                CubeListBuilder.create().texOffs(55,159).addBox(0,0,-6,2,1,6),
                PartPose.offsetAndRotation(-4,-8,-36,0.1745329F,0.1745329F,0));
        root.addOrReplaceChild("rightPincerExtra",
                CubeListBuilder.create().texOffs(63,166).addBox(2,0,-6,2,1,2),
                PartPose.offsetAndRotation(-4,-8,-36,0.1745329F,0.1745329F,0));

        return LayerDefinition.create(mesh, 256, 256);
    }

    @Override
    public void renderToBuffer(PoseStack pose, VertexConsumer vb, int light, int overlay, float r, float g, float b, float a) {
        sting.render(pose, vb, light, overlay, r, g, b, a);
        abdomnem1.render(pose, vb, light, overlay, r, g, b, a);
        abdomnem2.render(pose, vb, light, overlay, r, g, b, a);
        abdomnem3.render(pose, vb, light, overlay, r, g, b, a);
        abdomnem4.render(pose, vb, light, overlay, r, g, b, a);
        abdomnem5.render(pose, vb, light, overlay, r, g, b, a);
        mainBody.render(pose, vb, light, overlay, r, g, b, a);
        neck.render(pose, vb, light, overlay, r, g, b, a);
        head.render(pose, vb, light, overlay, r, g, b, a);
        wingRight.render(pose, vb, light, overlay, r, g, b, a);
        wingLeft.render(pose, vb, light, overlay, r, g, b, a);
        ra1.render(pose, vb, light, overlay, r, g, b, a);
        la1.render(pose, vb, light, overlay, r, g, b, a);
        la2.render(pose, vb, light, overlay, r, g, b, a);
        ra2.render(pose, vb, light, overlay, r, g, b, a);
        ra3.render(pose, vb, light, overlay, r, g, b, a);
        la3.render(pose, vb, light, overlay, r, g, b, a);
        leftPom.render(pose, vb, light, overlay, r, g, b, a);
        rightPom.render(pose, vb, light, overlay, r, g, b, a);
        leftPincerExtra.render(pose, vb, light, overlay, r, g, b, a);
        leftPincerMain.render(pose, vb, light, overlay, r, g, b, a);
        rightPincerMain.render(pose, vb, light, overlay, r, g, b, a);
        rightPincerExtra.render(pose, vb, light, overlay, r, g, b, a);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        // Wings
        float wingAng = Mth.cos(ageInTicks * 1.1F * wingspeed) * (float)Math.PI * 0.3F;
        wingLeft.zRot  = -1.745F - wingAng;
        wingRight.zRot =  1.754F + wingAng;

        // Pincers
        float pincAng = Mth.cos(ageInTicks * 0.3F * wingspeed) * (float)Math.PI * 0.1F;
        leftPincerMain.yRot  = -0.274F + pincAng;
        leftPincerExtra.yRot = -0.274F + pincAng;
        rightPincerMain.yRot =  0.274F - pincAng;
        rightPincerExtra.yRot=  0.274F - pincAng;

        // Legs
        float leg1 = Mth.cos(ageInTicks * 0.21F * wingspeed) * (float)Math.PI * 0.06F;
        la1.xRot = 0.261F + leg1; la2.xRot = 0.436F + leg1; la3.xRot = 0.611F + leg1;
        leftPom.xRot = leg1;
        float leg2 = Mth.cos(ageInTicks * 0.27F * wingspeed) * (float)Math.PI * 0.06F;
        ra1.xRot = 0.261F + leg2; ra2.xRot = 0.436F + leg2; ra3.xRot = 0.611F + leg2;
        rightPom.xRot = leg2;

        float legZ1 = Mth.cos(ageInTicks * 0.31F * wingspeed) * (float)Math.PI * 0.06F;
        la1.zRot = legZ1; la2.zRot = legZ1; la3.zRot = legZ1; leftPom.zRot = legZ1;
        float legZ2 = Mth.cos(ageInTicks * 0.37F * wingspeed) * (float)Math.PI * 0.06F;
        ra1.zRot = legZ2; ra2.zRot = legZ2; ra3.zRot = legZ2; rightPom.zRot = legZ2;

        // Abdomen waggle
        boolean attacking = (entity instanceof BeeEntity bee && bee.getAttacking() == 1);
        float abSwing = Mth.cos(ageInTicks * (attacking?0.11F:0.021F) * wingspeed)
                * (float)Math.PI * (attacking?0.055F:0.023F);

        // chain through segments
        abdomnem5.xRot = 1.099F + abSwing;
        abdomnem4.xRot = abdomnem5.xRot + abSwing - 0.35F;
        abdomnem4.y    = -6F + Mth.cos(abdomnem4.xRot)*10F;
        abdomnem4.z    = -8F + Mth.sin(abdomnem4.xRot)*10F;

        abdomnem3.xRot = abdomnem4.xRot + abSwing - 0.35F;
        abdomnem3.y    = abdomnem4.y + Mth.cos(abdomnem3.xRot)*10F;
        abdomnem3.z    = abdomnem4.z + Mth.sin(abdomnem3.xRot)*10F;

        abdomnem2.xRot = abdomnem3.xRot + abSwing - 0.35F;
        abdomnem2.y    = abdomnem3.y + Mth.cos(abdomnem2.xRot)*6F;
        abdomnem2.z    = abdomnem3.z + Mth.sin(abdomnem2.xRot)*6F;

        abdomnem1.xRot = abdomnem2.xRot + abSwing - 0.35F;
        abdomnem1.y    = abdomnem2.y + Mth.cos(abdomnem1.xRot)*5F;
        abdomnem1.z    = abdomnem2.z + Mth.sin(abdomnem1.xRot)*5F;

        sting.xRot = abdomnem1.xRot + abSwing - 0.35F;
        sting.y    = abdomnem1.y + Mth.cos(sting.xRot)*7F;
        sting.z    =  1F + abdomnem1.z + Mth.sin(sting.xRot)*7F;
    }
}
