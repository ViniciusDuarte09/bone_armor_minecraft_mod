package net.msvic.bonearmor.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.PotionItem;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.msvic.bonearmor.BoneArmor;

public class Consumables {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BoneArmor.MOD_ID);

    public static final FoodProperties UNDEAD_WINE_PROPERTIES = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.2f)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1000, 1), 1.0f)
            .build();

    public static final RegistryObject<Item> UNDEAD_WINE_ITEM = ITEMS.register("undead_wine",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .food(UNDEAD_WINE_PROPERTIES)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}