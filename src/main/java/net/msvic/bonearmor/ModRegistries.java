package net.msvic.bonearmor;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

//For organization, the most part of logical are on your specific mod folder

//Here are the core of the mod; Basically, here we pass the register for forge, and them, based on events,
// he shoots the things to Minecraft Render
public class ModRegistries {

    //This Object it's a Generics who control the creation of the ForgeRegistries - The Forge Handle a big part of process;
    //In that example, the generic assume Basically an Item ARRAY type, it's him who control the ITEMS registry
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BoneArmor.MOD_ID);


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }

}
