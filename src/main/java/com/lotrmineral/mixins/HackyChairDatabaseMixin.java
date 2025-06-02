package com.lotrmineral.mixins;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;

import java.util.Map;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import com.github.maximuslotro.lotrrextended.common.chairs.HackyChairDatabase;
import com.github.maximuslotro.lotrrextended.common.entity.special.ExtendedChairEntity;

@Mixin(HackyChairDatabase.class)
public abstract class HackyChairDatabaseMixin {

	@Accessor(value="chairs", remap=false)
	public abstract Map<ResourceLocation, Map<BlockPos, ExtendedChairEntity>> getChairs();
}
