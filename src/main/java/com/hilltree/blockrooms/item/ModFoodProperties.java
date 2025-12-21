package com.hilltree.blockrooms.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties ALMOND_WATER =  new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.HEAL), 0.35f)
            .alwaysEdible()
            .usingConvertsTo(ModItems.EMPTY_BOTTLE.asItem())
            .build();
}
