package com.hilltree.blockrooms.item;

import com.hilltree.blockrooms.BlockRoomsMod;
import com.hilltree.blockrooms.item.custom.AlmondWaterItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BlockRoomsMod.MOD_ID);

    public static final DeferredItem<Item> EMPTY_BOTTLE = ITEMS.register("empty_bottle",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALMOND_WATER = ITEMS.register("almond_water",
            () -> new AlmondWaterItem(new Item.Properties().food(ModFoodProperties.ALMOND_WATER)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
