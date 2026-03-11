package net.redstonebean.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.redstonebean.Sasasa;


public class Items {

    public static final ArrowStick MYTEST = register(new ArrowStick(new FabricItemSettings()), "mytest");

    public static <T extends Item> T register(T item, String id) {
        Identifier identifier = new Identifier(Sasasa.MOD_ID, id);

        Registry.register(Registries.ITEM, identifier,item);

        return item;
    }

    public static void initialize() {

    }
}
