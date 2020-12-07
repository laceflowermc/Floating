package com.possible_triangle.floating

import biomesoplenty.common.world.BOPBiomeProvider
import net.minecraft.client.gui.screen.BiomeGeneratorTypeScreens
import net.minecraft.util.ResourceLocation
import net.minecraft.util.registry.Registry
import net.minecraft.world.biome.Biome
import net.minecraft.world.biome.provider.OverworldBiomeProvider
import net.minecraft.world.gen.ChunkGenerator
import net.minecraft.world.gen.DimensionSettings
import net.minecraft.world.gen.NoiseChunkGenerator

class FloatingBOPWorldType : ModdedWorldType("floating_bop", { biomeReg, settingsReg, seed ->
    val biomes = BOPBiomeProvider(seed, biomeReg)
    NoiseChunkGenerator(biomes, seed) { settingsReg.getOrThrow(DimensionSettings.field_242739_h) }
})