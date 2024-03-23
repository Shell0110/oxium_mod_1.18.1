package fr.shell.oxium;

import fr.shell.oxium.item.OxiumItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class OxiumCreativeTab {
    public  static final CreativeModeTab OxiumTab = new CreativeModeTab("oxium_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(OxiumItem.OXIUM_ITEM.get());
        }
    };
}
