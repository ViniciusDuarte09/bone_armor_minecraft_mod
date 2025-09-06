package net.msvic.bonearmor.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;
import net.msvic.bonearmor.ModRegistries;

public class Weapons {

    public static final RegistryObject<Item> PUTRID_STAFF = ModRegistries.ITEMS.register("putrid_staff",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
            ));

    public static void start(){}
}
