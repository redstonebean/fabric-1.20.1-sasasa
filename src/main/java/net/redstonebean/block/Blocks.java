package net.redstonebean.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.redstonebean.Sasasa;

public class Blocks {
    public static final Block MY_TEST_BLOCK = register(new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK)),
            "mytestblock",
            true
    );

    public static Block register(Block block, String id,boolean shouldRegisterItem) {
        Identifier identifier = new Identifier(Sasasa.MOD_ID, id);

        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, identifier, blockItem);
        }

        return Registry.register(Registries.BLOCK, identifier, block);
    }

    public static void initialize() {

    }
}
