package cn.org.mandcstudio.basictechnology.item;

import cn.org.mandcstudio.basictechnology.BasicTechnology;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item Iron_Stick = registerItem("iron_stick", new Item(new FabricItemSettings()));

    private static void addItemToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(Iron_Stick);
    }
    private static void addItemToCombatItemGroup(FabricItemGroupEntries entries) {
        entries.add(Iron_Stick);
    }
    private static void addItemToToolsItemGroup(FabricItemGroupEntries entries) {
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BasicTechnology.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BasicTechnology.LOGGER.info("Registering!");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemToCombatItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemToToolsItemGroup);
    }
}
