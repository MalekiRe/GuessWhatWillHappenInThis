package fr.anatom3000.gwwhit.materials.hugom;
import net.minecraft.util.registry.*;
import net.minecraft.util.Identifier;
import net.minecraft.item.BlockItem;
import fr.anatom3000.gwwhit.CustomItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.biome.v1.*;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.*;
public class HugomRoot  {
public static final HugomDust HUGOM_DUST = new HugomDust();
public static final HugomBlock HUGOM_BLOCK = new HugomBlock();
public static final HugomOre HUGOM_ORE = new HugomOre();
public static final HugomSword HUGOM_SWORD = new HugomSword(HugomMaterial.INSTANCE);

public void onInitialize() {
Registry.register(Registry.ITEM, new Identifier("gwwhit","hugom_dust"),HUGOM_DUST);
Registry.register(Registry.BLOCK, new Identifier("gwwhit", "hugom_block"), HUGOM_BLOCK);
Registry.register(Registry.ITEM, new Identifier("gwwhit", "hugom_block"), new BlockItem(HUGOM_BLOCK, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
Registry.register(Registry.BLOCK, new Identifier("gwwhit", "hugom_ore"), HUGOM_ORE);
Registry.register(Registry.ITEM, new Identifier("gwwhit", "hugom_ore"), new BlockItem(HUGOM_ORE, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
Registry.register(Registry.ITEM, new Identifier("gwwhit","hugom_sword"),HUGOM_SWORD);
RegistryKey<ConfiguredFeature<?,?>> ore = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("gwwhit","ore_hugom"));
BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ore);
}
public void onInitializeClient() {

}
}