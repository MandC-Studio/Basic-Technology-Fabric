package cn.org.mandcstudio.basictechnology;

import cn.org.mandcstudio.basictechnology.block.ModBlocks;
import cn.org.mandcstudio.basictechnology.item.ModItemGroups;
import cn.org.mandcstudio.basictechnology.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicTechnology implements ModInitializer {
	public static final String MOD_ID = "basictechnology";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("I liked THAT!");
		LOGGER.info("Was what I like her?");

		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}