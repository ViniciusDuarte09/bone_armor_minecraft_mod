package net.msvic.bonearmor.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.msvic.bonearmor.BoneArmor;

//Class who control the items creation
public class Bones {

    //This Object it's a Generics who control the creation of the ForgeRegistries - The Forge Handle a big part of process;
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BoneArmor.MOD_ID);

    //Here, there is an Item Register creation; So the ResourceLocation of this item is: bone_armor:hard_bone;
    public static final RegistryObject<Item> HARD_BONE = ITEMS.register("hard_bone",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }
}
