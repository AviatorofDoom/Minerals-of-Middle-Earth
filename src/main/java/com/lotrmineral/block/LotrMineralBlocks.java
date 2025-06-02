package com.lotrmineral.block;

import com.lotrmineral.MineralsofMiddleEarth;
import com.lotrmineral.item.LotrMineralItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;


public class LotrMineralBlocks {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, MineralsofMiddleEarth.MOD_ID);


    //Blocks added
    public static final RegistryObject<Block> GNEISS = registerBlock("gneiss",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> LIMESTONE = registerBlock("limestone",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> GABBRO = registerBlock("gabbro",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> SHALE = registerBlock("shale",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> SLATE = registerBlock("slate",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));



    //Block registry

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        LotrMineralItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
