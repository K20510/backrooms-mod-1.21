package com.hilltree.blockrooms.item;

import com.hilltree.blockrooms.BlockRoomsMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BlockRoomsMod.MOD_ID);

    public static final DeferredItem<Item> ALMOND_WATER = ITEMS.register("almond_water",() -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
