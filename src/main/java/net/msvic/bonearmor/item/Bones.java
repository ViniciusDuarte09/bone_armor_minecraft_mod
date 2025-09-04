package net.msvic.bonearmor.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;
import net.msvic.bonearmor.ModRegistries;

//Class who control the bone items creation
public class Bones {

    //Here, there is an Item Register creation; So the ResourceLocation of this item is: bone_armor:hard_bone;
    public static final RegistryObject<Item> HARD_BONE = ModRegistries.ITEMS.register("hard_bone",
            () -> new Item(new Item.Properties()));


    public static void start(){}

}


