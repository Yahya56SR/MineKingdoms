package com.nexor.minekingdoms.item;

import com.nexor.minekingdoms.MineKingdomsMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MineKingdomsMod.MOD_ID);

    public static final DeferredItem<Item> UNFINISHED_ENCHANTED_ALLOY = ITEMS.register("unfinished_enchanted_alloy",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ENCHANTED_ALLOY = ITEMS.register("enchanted_alloy",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CONTROL_CORE = ITEMS.register("control_core",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> KINGS_SEAL = ITEMS.register("kings_seal",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
