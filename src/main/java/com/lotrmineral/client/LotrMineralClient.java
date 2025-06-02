package com.lotrmineral.client;

import com.lotrmineral.MineralsofMiddleEarth;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class LotrMineralClient {
    public static void staticClientSetup() {
        if(Minecraft.getInstance()==null) {
            return;
        }
        new LotrMineralClient();
    }

    public static LotrMineralClient INSTANCE;

    public MineralsofMiddleEarth getParentInstance() {
        return MineralsofMiddleEarth.INSTANCE;
    }

    public LotrMineralClient() {
        INSTANCE = this;
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;modBus.addListener(this::clientStartupEvent);

    }
    public void clientStartupEvent(final FMLClientSetupEvent event) {
    }
}

