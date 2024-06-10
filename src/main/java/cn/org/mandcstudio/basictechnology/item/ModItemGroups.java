package cn.org.mandcstudio.basictechnology.item;

import cn.org.mandcstudio.basictechnology.BasicTechnology;
import cn.org.mandcstudio.basictechnology.block.ModBlocks;
import cn.org.mandcstudio.basictechnology.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup Basic_Technology = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BasicTechnology.MOD_ID, "basic_technology"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.basic_technology"))
                    .icon(() -> new ItemStack(ModBlocks.Steel_Block)).entries((displayContext, entries) -> {
                        // Item
                        entries.add(ModItems.Iron_Stick);
                        // Block
                        entries.add(ModBlocks.Steel_Block);
                    }).build());

    public static void registerItemGroups() {
        BasicTechnology.LOGGER.info("Registering!");
    }
}
