package com.irontom10.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

/**
 * Modern replacement for danger.orespawn.ModelCoin.
 */
public class CoinModel<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
            new ResourceLocation("your_mod_id", "coin"), "main"
    );

    private final ModelPart shape1;
    private final float wingspeed;

    public CoinModel(ModelPart root, float wingspeed) {
        this.shape1   = root.getChild("shape1");
        this.wingspeed = wingspeed;
    }

    /** Defines geometry and texture size (512×512) */
    public static LayerDefinition createBodyLayer(float wingspeed) {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        root.addOrReplaceChild("shape1",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(
                                /* x */ -128.0F, /* y */ -128.0F, /* z */ 0.0F,
                                /* dx=*/256,    /* dy=*/256,      /* dz=*/1
                        ),
                PartPose.offset(
                        /* x */  0.0F,
                        /* y */ -109.0F,
                        /* z */  0.0F
                )
        );

        return LayerDefinition.create(mesh, 512, 512);
    }

    @Override
    public void setupAnim(
            T entity,
            float limbSwing,
            float limbSwingAmount,
            float ageInTicks,
            float netHeadYaw,
            float headPitch
    ) {
        // Rotate around Y axis like the old MathHelper.cos(...)
        this.shape1.yRot = Mth.cos(ageInTicks * 0.05F * this.wingspeed) * (float)Math.PI;
    }

    @Override
    public void renderToBuffer(
            PoseStack poseStack,
            VertexConsumer buffer,
            int packedLight,
            int packedOverlay,
            float red,
            float green,
            float blue,
            float alpha
    ) {
        shape1.render(poseStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}
