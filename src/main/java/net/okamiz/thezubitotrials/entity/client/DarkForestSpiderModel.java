// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package net.okamiz.thezubitotrials.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.render.entity.model.SpiderEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.RangedAttackMob;
import net.minecraft.util.math.MathHelper;
import net.okamiz.thezubitotrials.entity.custom.DarkForestSpiderEntity;
import net.okamiz.thezubitotrials.entity.custom.MagmaSkeletonEntity;

public class DarkForestSpiderModel<T extends DarkForestSpiderEntity> extends SinglePartEntityModel<T> {
	private final ModelPart head;
	private final ModelPart neck;
	private final ModelPart body;
	private final ModelPart rightHindLeg;
	private final ModelPart leftHindLeg;
	private final ModelPart rightMiddleLeg;
	private final ModelPart leftMiddleLeg;
	private final ModelPart rightMiddleFrontLeg;
	private final ModelPart leftMiddleFrontLeg;
	private final ModelPart rightFrontLeg;
	private final ModelPart leftFrontLeg;
	public DarkForestSpiderModel(ModelPart root) {
        this.head = root.getChild("head");
		this.neck = root.getChild("neck");
		this.body = root.getChild("body");
		this.rightHindLeg = root.getChild(EntityModelPartNames.RIGHT_HIND_LEG);
		this.leftHindLeg = root.getChild(EntityModelPartNames.LEFT_HIND_LEG);
		this.rightMiddleLeg = root.getChild("right_middle_hind_leg");
		this.leftMiddleLeg = root.getChild("left_middle_hind_leg");
		this.rightMiddleFrontLeg = root.getChild("right_middle_front_leg");
		this.leftMiddleFrontLeg = root.getChild("left_middle_front_leg");
		this.rightFrontLeg = root.getChild(EntityModelPartNames.RIGHT_FRONT_LEG);
		this.leftFrontLeg = root.getChild(EntityModelPartNames.LEFT_FRONT_LEG);
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create().uv(32, 4).cuboid(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F))
		.uv(44, 26).cuboid(-3.0F, 1.0F, -9.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 18).cuboid(1.0F, 1.0F, -9.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 15.0F, -3.0F));

		ModelPartData neck = modelPartData.addChild("neck", ModelPartBuilder.create().uv(0, 0).cuboid(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 15.0F, 0.0F));

		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(0, 12).cuboid(-5.0F, -4.0F, -6.0F, 10.0F, 8.0F, 12.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 15.0F, 9.0F));

		ModelPartData rightHindLeg = modelPartData.addChild(EntityModelPartNames.RIGHT_HIND_LEG, ModelPartBuilder.create().uv(18, 0).cuboid(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, 15.0F, 4.0F));

		ModelPartData leftHindLeg = modelPartData.addChild(EntityModelPartNames.LEFT_HIND_LEG, ModelPartBuilder.create().uv(18, 0).cuboid(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, 15.0F, 4.0F));

		ModelPartData rightMiddleLeg = modelPartData.addChild("right_middle_hind_leg", ModelPartBuilder.create().uv(18, 0).cuboid(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, 15.0F, 1.0F));

		ModelPartData leftMiddleLeg = modelPartData.addChild("left_middle_hind_leg", ModelPartBuilder.create().uv(18, 0).cuboid(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, 15.0F, 1.0F));

		ModelPartData rightMiddleFrontLeg = modelPartData.addChild("right_middle_front_leg", ModelPartBuilder.create().uv(18, 0).cuboid(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, 15.0F, -2.0F));

		ModelPartData leftMiddleFrontLeg = modelPartData.addChild("left_middle_front_leg", ModelPartBuilder.create().uv(18, 0).cuboid(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, 15.0F, -2.0F));

		ModelPartData rightFrontLeg = modelPartData.addChild(EntityModelPartNames.RIGHT_FRONT_LEG, ModelPartBuilder.create().uv(18, 0).cuboid(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, 15.0F, -5.0F));

		ModelPartData leftFrontLeg = modelPartData.addChild(EntityModelPartNames.LEFT_FRONT_LEG, ModelPartBuilder.create().uv(18, 0).cuboid(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, 15.0F, -5.0F));
		return TexturedModelData.of(modelData, 64, 32);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		head.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		neck.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		rightHindLeg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		leftHindLeg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		rightMiddleLeg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		leftMiddleLeg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		rightMiddleFrontLeg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		leftMiddleFrontLeg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		rightFrontLeg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		leftFrontLeg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return this.head;
	}

	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		this.head.yaw = headYaw * (float) (Math.PI / 180.0);
		this.head.pitch = headPitch * (float) (Math.PI / 180.0);
		float f = (float) (Math.PI / 4);
		this.rightHindLeg.roll = (float) (-Math.PI / 4);
		this.leftHindLeg.roll = (float) (Math.PI / 4);
		this.rightMiddleLeg.roll = -0.58119464F;
		this.leftMiddleLeg.roll = 0.58119464F;
		this.rightMiddleFrontLeg.roll = -0.58119464F;
		this.leftMiddleFrontLeg.roll = 0.58119464F;
		this.rightFrontLeg.roll = (float) (-Math.PI / 4);
		this.leftFrontLeg.roll = (float) (Math.PI / 4);
		float g = -0.0F;
		float h = (float) (Math.PI / 8);
		this.rightHindLeg.yaw = (float) (Math.PI / 4);
		this.leftHindLeg.yaw = (float) (-Math.PI / 4);
		this.rightMiddleLeg.yaw = (float) (Math.PI / 8);
		this.leftMiddleLeg.yaw = (float) (-Math.PI / 8);
		this.rightMiddleFrontLeg.yaw = (float) (-Math.PI / 8);
		this.leftMiddleFrontLeg.yaw = (float) (Math.PI / 8);
		this.rightFrontLeg.yaw = (float) (-Math.PI / 4);
		this.leftFrontLeg.yaw = (float) (Math.PI / 4);
		float i = -(MathHelper.cos(limbAngle * 0.6662F * 2.0F + 0.0F) * 0.4F) * limbDistance;
		float j = -(MathHelper.cos(limbAngle * 0.6662F * 2.0F + (float) Math.PI) * 0.4F) * limbDistance;
		float k = -(MathHelper.cos(limbAngle * 0.6662F * 2.0F + (float) (Math.PI / 2)) * 0.4F) * limbDistance;
		float l = -(MathHelper.cos(limbAngle * 0.6662F * 2.0F + (float) (Math.PI * 3.0 / 2.0)) * 0.4F) * limbDistance;
		float m = Math.abs(MathHelper.sin(limbAngle * 0.6662F + 0.0F) * 0.4F) * limbDistance;
		float n = Math.abs(MathHelper.sin(limbAngle * 0.6662F + (float) Math.PI) * 0.4F) * limbDistance;
		float o = Math.abs(MathHelper.sin(limbAngle * 0.6662F + (float) (Math.PI / 2)) * 0.4F) * limbDistance;
		float p = Math.abs(MathHelper.sin(limbAngle * 0.6662F + (float) (Math.PI * 3.0 / 2.0)) * 0.4F) * limbDistance;
		this.rightHindLeg.yaw += i;
		this.leftHindLeg.yaw += -i;
		this.rightMiddleLeg.yaw += j;
		this.leftMiddleLeg.yaw += -j;
		this.rightMiddleFrontLeg.yaw += k;
		this.leftMiddleFrontLeg.yaw += -k;
		this.rightFrontLeg.yaw += l;
		this.leftFrontLeg.yaw += -l;
		this.rightHindLeg.roll += m;
		this.leftHindLeg.roll += -m;
		this.rightMiddleLeg.roll += n;
		this.leftMiddleLeg.roll += -n;
		this.rightMiddleFrontLeg.roll += o;
		this.leftMiddleFrontLeg.roll += -o;
		this.rightFrontLeg.roll += p;
		this.leftFrontLeg.roll += -p;
	}
}