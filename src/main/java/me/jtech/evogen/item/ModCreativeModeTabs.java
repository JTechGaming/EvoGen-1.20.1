package me.jtech.evogen.item;

import me.jtech.evogen.EvoGen;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EvoGen.MOD_ID);

    public static final RegistryObject<CreativeModeTab> EVOGEN_TAB = CREATIVE_MODE_TABS.register("evogen_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PROCESSING_CORE.get()))
                    .title(Component.translatable("creativetab.evogen_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.TEST.get());
                        pOutput.accept(ModItems.PROCESSING_CORE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
