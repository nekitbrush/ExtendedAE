package com.glodblock.github.extendedae.client;

import appeng.api.util.AEColor;
import appeng.client.render.StaticItemColor;
import appeng.init.client.InitScreens;
import com.glodblock.github.extendedae.ExtendedAE;
import com.glodblock.github.extendedae.client.gui.GuiActiveFormationPlane;
import com.glodblock.github.extendedae.client.gui.GuiCaner;
import com.glodblock.github.extendedae.client.gui.GuiCircuitCutter;
import com.glodblock.github.extendedae.client.gui.GuiCrystalAssembler;
import com.glodblock.github.extendedae.client.gui.GuiExDrive;
import com.glodblock.github.extendedae.client.gui.GuiExIOBus;
import com.glodblock.github.extendedae.client.gui.GuiExIOPort;
import com.glodblock.github.extendedae.client.gui.GuiExInscriber;
import com.glodblock.github.extendedae.client.gui.GuiExInterface;
import com.glodblock.github.extendedae.client.gui.GuiExMolecularAssembler;
import com.glodblock.github.extendedae.client.gui.GuiExPatternProvider;
import com.glodblock.github.extendedae.client.gui.GuiExPatternTerminal;
import com.glodblock.github.extendedae.client.gui.GuiIngredientBuffer;
import com.glodblock.github.extendedae.client.gui.GuiModExportBus;
import com.glodblock.github.extendedae.client.gui.GuiModStorageBus;
import com.glodblock.github.extendedae.client.gui.GuiPatternModifier;
import com.glodblock.github.extendedae.client.gui.GuiPreciseExportBus;
import com.glodblock.github.extendedae.client.gui.GuiPreciseStorageBus;
import com.glodblock.github.extendedae.client.gui.GuiRenamer;
import com.glodblock.github.extendedae.client.gui.GuiTagExportBus;
import com.glodblock.github.extendedae.client.gui.GuiTagStorageBus;
import com.glodblock.github.extendedae.client.gui.GuiThresholdExportBus;
import com.glodblock.github.extendedae.client.gui.GuiThresholdLevelEmitter;
import com.glodblock.github.extendedae.client.gui.GuiWirelessConnector;
import com.glodblock.github.extendedae.client.gui.GuiWirelessExPAT;
import com.glodblock.github.extendedae.client.gui.pattern.GuiCraftingPattern;
import com.glodblock.github.extendedae.client.gui.pattern.GuiProcessingPattern;
import com.glodblock.github.extendedae.client.gui.pattern.GuiSmithingTablePattern;
import com.glodblock.github.extendedae.client.gui.pattern.GuiStonecuttingPattern;
import com.glodblock.github.extendedae.client.hotkey.PatternHotKey;
import com.glodblock.github.extendedae.client.model.ExDriveModel;
import com.glodblock.github.extendedae.client.model.ExPlaneModel;
import com.glodblock.github.extendedae.client.render.tesr.CanerTESR;
import com.glodblock.github.extendedae.client.render.tesr.CircuitCutterTESR;
import com.glodblock.github.extendedae.client.render.tesr.CrystalFixerTESR;
import com.glodblock.github.extendedae.client.render.tesr.ExChargerTESR;
import com.glodblock.github.extendedae.client.render.tesr.ExDriveTESR;
import com.glodblock.github.extendedae.client.render.tesr.ExInscriberTESR;
import com.glodblock.github.extendedae.client.render.tesr.ExMolecularAssemblerTESR;
import com.glodblock.github.extendedae.client.render.tesr.IngredientBufferTESR;
import com.glodblock.github.extendedae.common.EAEItemAndBlock;
import com.glodblock.github.extendedae.common.tileentities.TileCaner;
import com.glodblock.github.extendedae.common.tileentities.TileCircuitCutter;
import com.glodblock.github.extendedae.common.tileentities.TileCrystalFixer;
import com.glodblock.github.extendedae.common.tileentities.TileExCharger;
import com.glodblock.github.extendedae.common.tileentities.TileExDrive;
import com.glodblock.github.extendedae.common.tileentities.TileExInscriber;
import com.glodblock.github.extendedae.common.tileentities.TileExMolecularAssembler;
import com.glodblock.github.extendedae.common.tileentities.TileIngredientBuffer;
import com.glodblock.github.extendedae.container.ContainerActiveFormationPlane;
import com.glodblock.github.extendedae.container.ContainerCaner;
import com.glodblock.github.extendedae.container.ContainerCircuitCutter;
import com.glodblock.github.extendedae.container.ContainerCrystalAssembler;
import com.glodblock.github.extendedae.container.ContainerExDrive;
import com.glodblock.github.extendedae.container.ContainerExIOBus;
import com.glodblock.github.extendedae.container.ContainerExIOPort;
import com.glodblock.github.extendedae.container.ContainerExInscriber;
import com.glodblock.github.extendedae.container.ContainerExInterface;
import com.glodblock.github.extendedae.container.ContainerExMolecularAssembler;
import com.glodblock.github.extendedae.container.ContainerExPatternProvider;
import com.glodblock.github.extendedae.container.ContainerExPatternTerminal;
import com.glodblock.github.extendedae.container.ContainerIngredientBuffer;
import com.glodblock.github.extendedae.container.ContainerModExportBus;
import com.glodblock.github.extendedae.container.ContainerModStorageBus;
import com.glodblock.github.extendedae.container.ContainerPatternModifier;
import com.glodblock.github.extendedae.container.ContainerPreciseExportBus;
import com.glodblock.github.extendedae.container.ContainerPreciseStorageBus;
import com.glodblock.github.extendedae.container.ContainerRenamer;
import com.glodblock.github.extendedae.container.ContainerTagExportBus;
import com.glodblock.github.extendedae.container.ContainerTagStorageBus;
import com.glodblock.github.extendedae.container.ContainerThresholdExportBus;
import com.glodblock.github.extendedae.container.ContainerThresholdLevelEmitter;
import com.glodblock.github.extendedae.container.ContainerWirelessConnector;
import com.glodblock.github.extendedae.container.ContainerWirelessExPAT;
import com.glodblock.github.extendedae.container.pattern.ContainerCraftingPattern;
import com.glodblock.github.extendedae.container.pattern.ContainerProcessingPattern;
import com.glodblock.github.extendedae.container.pattern.ContainerSmithingTablePattern;
import com.glodblock.github.extendedae.container.pattern.ContainerStonecuttingPattern;
import com.glodblock.github.extendedae.xmod.ModConstants;
import com.glodblock.github.extendedae.xmod.wt.WTClientLoad;
import com.glodblock.github.glodium.util.GlodUtil;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.ModelEvent;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;

public class ClientRegistryHandler {

    public static final ClientRegistryHandler INSTANCE = new ClientRegistryHandler();

    public void onInit() {
        if (ExtendedAE.isLoad(ModConstants.AE2WTL)) {
            WTClientLoad.init();
        }
    }

    @SubscribeEvent
    public void registerGui(RegisterMenuScreensEvent event) {
        InitScreens.register(ContainerExPatternProvider.TYPE, GuiExPatternProvider::new, "/screens/ex_pattern_provider.json");
        InitScreens.register(ContainerExInterface.TYPE, GuiExInterface::new, "/screens/ex_interface.json");
        InitScreens.register(ContainerExIOBus.EXPORT_TYPE, GuiExIOBus::new, "/screens/ex_export_bus.json");
        InitScreens.register(ContainerExIOBus.IMPORT_TYPE, GuiExIOBus::new, "/screens/ex_import_bus.json");
        InitScreens.<ContainerExPatternTerminal, GuiExPatternTerminal<ContainerExPatternTerminal>>register(ContainerExPatternTerminal.TYPE, GuiExPatternTerminal::new, "/screens/ex_pattern_access_terminal.json");
        InitScreens.register(ContainerWirelessConnector.TYPE, GuiWirelessConnector::new, "/screens/wireless_connector.json");
        InitScreens.register(ContainerIngredientBuffer.TYPE, GuiIngredientBuffer::new, "/screens/ingredient_buffer.json");
        InitScreens.register(ContainerExDrive.TYPE, GuiExDrive::new, "/screens/ex_drive.json");
        InitScreens.register(ContainerPatternModifier.TYPE, GuiPatternModifier::new, "/screens/pattern_modifier.json");
        InitScreens.register(ContainerExMolecularAssembler.TYPE, GuiExMolecularAssembler::new, "/screens/ex_molecular_assembler.json");
        InitScreens.register(ContainerExInscriber.TYPE, GuiExInscriber::new, "/screens/ex_inscriber.json");
        InitScreens.register(ContainerTagStorageBus.TYPE, GuiTagStorageBus::new, "/screens/tag_storage_bus.json");
        InitScreens.register(ContainerTagExportBus.TYPE, GuiTagExportBus::new, "/screens/tag_export_bus.json");
        InitScreens.register(ContainerThresholdLevelEmitter.TYPE, GuiThresholdLevelEmitter::new, "/screens/threshold_level_emitter.json");
        InitScreens.register(ContainerRenamer.TYPE, GuiRenamer::new, "/screens/renamer.json");
        InitScreens.register(ContainerModStorageBus.TYPE, GuiModStorageBus::new, "/screens/mod_storage_bus.json");
        InitScreens.register(ContainerModExportBus.TYPE, GuiModExportBus::new, "/screens/mod_export_bus.json");
        InitScreens.register(ContainerActiveFormationPlane.TYPE, GuiActiveFormationPlane::new, "/screens/active_formation_plane.json");
        InitScreens.register(ContainerCaner.TYPE, GuiCaner::new, "/screens/caner.json");
        InitScreens.register(ContainerPreciseExportBus.TYPE, GuiPreciseExportBus::new, "/screens/precise_export_bus.json");
        InitScreens.register(ContainerWirelessExPAT.TYPE, GuiWirelessExPAT::new, "/screens/ex_pattern_access_terminal.json");
        InitScreens.register(ContainerExIOPort.TYPE, GuiExIOPort::new, "/screens/ex_io_port.json");
        InitScreens.register(ContainerPreciseStorageBus.TYPE, GuiPreciseStorageBus::new, "/screens/precise_storage_bus.json");
        InitScreens.register(ContainerThresholdExportBus.TYPE, GuiThresholdExportBus::new, "/screens/threshold_export_bus.json");
        InitScreens.register(ContainerCrystalAssembler.TYPE, GuiCrystalAssembler::new, "/screens/crystal_assembler.json");
        InitScreens.register(ContainerCircuitCutter.TYPE, GuiCircuitCutter::new, "/screens/circuit_cutter.json");
        InitScreens.register(ContainerExInterface.TYPE_OVERSIZE, GuiExInterface::new, "/screens/oversize_interface.json");
        event.register(ContainerProcessingPattern.TYPE, GuiProcessingPattern::new);
        event.register(ContainerCraftingPattern.TYPE, GuiCraftingPattern::new);
        event.register(ContainerStonecuttingPattern.TYPE, GuiStonecuttingPattern::new);
        event.register(ContainerSmithingTablePattern.TYPE, GuiSmithingTablePattern::new);
    }

    @SubscribeEvent
    public void registerColorHandler(RegisterColorHandlersEvent.Item event) {
        event.register(new StaticItemColor(AEColor.TRANSPARENT), EAEItemAndBlock.EX_PATTERN_TERMINAL);
    }

    @SubscribeEvent
    public void registerModels(ModelEvent.RegisterGeometryLoaders event) {
        BlockEntityRenderers.register(GlodUtil.getTileType(TileIngredientBuffer.class), IngredientBufferTESR::new);
        BlockEntityRenderers.register(GlodUtil.getTileType(TileExDrive.class), ExDriveTESR::new);
        BlockEntityRenderers.register(GlodUtil.getTileType(TileExMolecularAssembler.class), ExMolecularAssemblerTESR::new);
        BlockEntityRenderers.register(GlodUtil.getTileType(TileExInscriber.class), ExInscriberTESR::new);
        BlockEntityRenderers.register(GlodUtil.getTileType(TileExCharger.class), ExChargerTESR::new);
        BlockEntityRenderers.register(GlodUtil.getTileType(TileCaner.class), CanerTESR::new);
        BlockEntityRenderers.register(GlodUtil.getTileType(TileCrystalFixer.class), CrystalFixerTESR::new);
        BlockEntityRenderers.register(GlodUtil.getTileType(TileCircuitCutter.class), CircuitCutterTESR::new);
        event.register(ExtendedAE.id("ex_drive"), new ExDriveModel.Loader());
        event.register(ExtendedAE.id("active_formation_plane"), new ExPlaneModel.Loader(ExtendedAE.id("part/active_formation_plane")));
        event.register(ExtendedAE.id("active_formation_plane_on"), new ExPlaneModel.Loader(ExtendedAE.id("part/active_formation_plane_on")));
    }

    @SubscribeEvent
    public void registerHotKey(RegisterKeyMappingsEvent e) {
        e.register(PatternHotKey.getHotKey());
    }

}