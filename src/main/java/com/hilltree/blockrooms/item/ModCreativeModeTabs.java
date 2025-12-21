package com.hilltree.blockrooms.item;

import com.hilltree.blockrooms.BlockRoomsMod;
import com.hilltree.blockrooms.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BlockRoomsMod.MOD_ID);

    public static final Supplier<CreativeModeTab> BLOCKROOMS_ITEMS = CREATIVE_MODE_TAB.register("blockrooms_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALMOND_WATER.get())).title(Component.translatable("creativetab.blockrooms.blockrooms_items"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ALMOND_WATER);
                    })).build());


    public static final Supplier<CreativeModeTab> BLOCKROOMS_BLOCKS = CREATIVE_MODE_TAB.register("blockrooms_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.MOIST_CARPET_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(BlockRoomsMod.MOD_ID, "blockrooms_items_tab"))
                    .title(Component.translatable("creativetab.blockrooms.blockrooms_blocks"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.MOIST_CARPET_BLOCK);
                        output.accept(ModBlocks.WALLPAPER_BLOCK);
                    })).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
