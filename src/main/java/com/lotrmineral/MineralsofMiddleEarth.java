package com.lotrmineral;

import com.lotrmineral.block.LotrMineralBlocks;
import com.lotrmineral.client.LotrMineralClient;
import com.lotrmineral.item.LotrMineralItems;
import net.minecraft.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



@Mod(MineralsofMiddleEarth.MOD_ID)
public class MineralsofMiddleEarth {
	public static final String MOD_ID = "lotrmineral";


	public static MineralsofMiddleEarth INSTANCE;
	public static final Logger LOGGER = LogManager.getLogger();


	public MineralsofMiddleEarth() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		INSTANCE = this;
		DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> LotrMineralClient::staticClientSetup);

		LotrMineralItems.register(modEventBus);
		LotrMineralBlocks.register(modEventBus);


		modEventBus.addListener(this::setup);
		modEventBus.addListener(this::enqueueIMC);
		modEventBus.addListener(this::processIMC);
		modEventBus.addListener(this::doClientStuff);

		MinecraftForge.EVENT_BUS.register(this);

	}

	private void setup(final FMLCommonSetupEvent event)
	{

	}

	private void doClientStuff(final FMLClientSetupEvent event) {
	}

	private void enqueueIMC(final InterModEnqueueEvent event)
	{
	}

	private void processIMC(final InterModProcessEvent event)
	{
	}
	@SubscribeEvent
	public void onServerStarting(FMLServerStartingEvent event) {
	}

	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
		}
	}
}
