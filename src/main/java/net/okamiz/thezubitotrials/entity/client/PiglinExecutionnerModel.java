// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package net.okamiz.thezubitotrials.entity.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.render.entity.model.PiglinEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.okamiz.thezubitotrials.entity.custom.PiglinExecutionnerEntity;

@Environment(EnvType.CLIENT)
public class PiglinExecutionnerModel<T extends PiglinExecutionnerEntity> extends PiglinEntityModel<T> {


	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart hat;
	private final ModelPart ear;
	private final ModelPart left_ear;
	private final ModelPart right_ear;
	private final ModelPart rightArm;
	private final ModelPart leftArm;
	private final ModelPart rightLeg;
	private final ModelPart leftLeg;
	private final ModelPart leftItem;

	public final ModelPart leftSleeve;
	public final ModelPart rightSleeve;
	public final ModelPart leftPants;
	public final ModelPart rightPants;
	public final ModelPart jacket;
	private final ModelPart cloak;


	public PiglinExecutionnerModel(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.ear = root.getChild("ear");
		this.hat = root.getChild(EntityModelPartNames.HAT);
		this.left_ear = this.head.getChild(EntityModelPartNames.LEFT_EAR);
		this.right_ear = this.head.getChild(EntityModelPartNames.RIGHT_EAR);
		this.rightArm = root.getChild("right_arm");
		this.leftArm = root.getChild("left_arm");
		this.rightLeg = root.getChild("right_leg");
		this.leftLeg = root.getChild("left_leg");
		this.leftItem = root.getChild("leftItem");

		this.cloak = root.getChild("cloak");
		this.leftSleeve = root.getChild("left_sleeve");
		this.rightSleeve = root.getChild("right_sleeve");
		this.leftPants = root.getChild("left_pants");
		this.rightPants = root.getChild("right_pants");
		this.jacket = root.getChild(EntityModelPartNames.JACKET);
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(24, 32).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 32).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData head = modelPartData.addChild(EntityModelPartNames.HEAD, ModelPartBuilder.create().uv(0, 16).cuboid(-5.0F, -8.0F, -4.0F, 10.0F, 8.0F, 8.0F, new Dilation(-0.02F))
		.uv(0, 0).cuboid(-5.0F, -8.0F, -4.0F, 10.0F, 8.0F, 8.0F, new Dilation(0.2F))
		.uv(32, 48).cuboid(-2.0F, -4.0F, -5.0F, 4.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 3).cuboid(2.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-3.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData hat = modelPartData.addChild(EntityModelPartNames.HAT, ModelPartBuilder.create(), ModelTransform.NONE);
		ModelPartData ear = modelPartData.addChild("ear", ModelPartBuilder.create().uv(24, 0).cuboid(-3.0F, -6.0F, -1.0F, 6.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.NONE);

		ModelPartData cloak = modelPartData.addChild(
				"cloak", ModelPartBuilder.create().uv(0, 0).cuboid(-5.0F, 0.0F, -1.0F, 10.0F, 16.0F, 1.0F, new Dilation(0.0F), 1.0F, 0.5F), ModelTransform.pivot(0.0F, 0.0F, 0.0F)
		);
		ModelPartData left_sleeve = modelPartData.addChild(
				"left_sleeve",
				ModelPartBuilder.create().uv(48, 48).cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F).add(0.25F)),
				ModelTransform.pivot(5.0F, 2.0F, 0.0F)
		);
		ModelPartData right_sleeve = modelPartData.addChild(
				"right_sleeve",
				ModelPartBuilder.create().uv(40, 32).cuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F).add(0.25F)),
				ModelTransform.pivot(-5.0F, 2.0F, 0.0F)
		);

		ModelPartData left_pants = modelPartData.addChild(
				"left_pants",
				ModelPartBuilder.create().uv(0, 48).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F).add(0.25F)),
				ModelTransform.pivot(1.9F, 12.0F, 0.0F)
		);
		ModelPartData right_pants = modelPartData.addChild(
				"right_pants",
				ModelPartBuilder.create().uv(0, 32).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F).add(0.25F)),
				ModelTransform.pivot(-1.9F, 12.0F, 0.0F)
		);
		ModelPartData jacket = modelPartData.addChild(
				EntityModelPartNames.JACKET, ModelPartBuilder.create().uv(16, 32).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F).add(0.25F)), ModelTransform.NONE
		);



		ModelPartData left_ear = head.addChild(EntityModelPartNames.LEFT_EAR, ModelPartBuilder.create().uv(56, 56).cuboid(-1.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, -6.0F, 0.0F, 0.0F, 0.0F, -0.5236F));

		ModelPartData right_ear = head.addChild(EntityModelPartNames.RIGHT_EAR, ModelPartBuilder.create().uv(52, 16).cuboid(0.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.5236F));

		ModelPartData right_arm = modelPartData.addChild("right_arm", ModelPartBuilder.create().uv(32, 56).cuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(52, 0).cuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));

		ModelPartData left_arm = modelPartData.addChild("left_arm", ModelPartBuilder.create().uv(48, 28).cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(16, 48).cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(5.0F, 2.0F, 0.0F));

		ModelPartData right_leg = modelPartData.addChild("right_leg", ModelPartBuilder.create().uv(0, 48).cuboid(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(44, 44).cuboid(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(-1.9F, 12.0F, 0.0F));

		ModelPartData left_leg = modelPartData.addChild("left_leg", ModelPartBuilder.create().uv(36, 16).cuboid(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(36, 0).cuboid(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(1.9F, 12.0F, 0.0F));

		ModelPartData leftItem = modelPartData.addChild("leftItem", ModelPartBuilder.create(), ModelTransform.pivot(6.0F, 9.0F, 1.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		head.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		rightArm.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		leftArm.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		rightLeg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		leftLeg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		leftItem.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}