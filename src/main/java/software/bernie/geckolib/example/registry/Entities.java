/*
 * Copyright (c) 2020.
 * Author: Bernie G. (Gecko)
 */

package software.bernie.geckolib.example.registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import software.bernie.geckolib.GeckoLib;
import software.bernie.geckolib.example.entity.AscendedLegfishEntity;
import software.bernie.geckolib.example.entity.StingrayTestEntity;
import software.bernie.geckolib.example.entity.TigrisEntity;

public class Entities
{
	public static final EntityType<StingrayTestEntity> STINGRAY = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier(GeckoLib.ModID, "stingray"),
			FabricEntityTypeBuilder.create(EntityCategory.CREATURE, StingrayTestEntity::new).dimensions(
					EntityDimensions.fixed(2.845F, 0.3125F)).trackable(160, 2).build());

	public static final EntityType<AscendedLegfishEntity> ASCENDED_LEG_FISH = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier(GeckoLib.ModID, "ascended_leg_fish"),
			FabricEntityTypeBuilder.create(EntityCategory.CREATURE, AscendedLegfishEntity::new).dimensions(
					EntityDimensions.fixed(2.4F, 4.2F)).trackable(160, 2).build());


	public static final EntityType<TigrisEntity> TIGRIS = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier(GeckoLib.ModID, "tigris"),
			FabricEntityTypeBuilder.create(EntityCategory.CREATURE, TigrisEntity::new).dimensions(
					EntityDimensions.fixed(5F, 3F)).trackable(160, 2).build());

}
