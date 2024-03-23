package fr.shell.oxium.item;

import fr.shell.oxium.Oxium;
import fr.shell.oxium.OxiumCreativeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class OxiumItem {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Oxium.MOD_ID);

    public static final RegistryObject<Item> OXIUM_ITEM = ITEMS.register("oxium_item", () -> new Item(new Item.Properties().tab(OxiumCreativeTab.OxiumTab)));
    public static final RegistryObject<Item> OXIUM_SWORD = ITEMS.register("oxium_sword", () -> new SwordItem(ModItemTier.ZINC, 2, 3f, new Item.Properties().tab(OxiumCreativeTab.OxiumTab)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

