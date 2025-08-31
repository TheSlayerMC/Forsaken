package net.forsaken.core.data;

import net.forsaken.core.init.internal.JBlocks;
import net.forsaken.core.init.internal.JEntities;
import net.forsaken.core.init.internal.JItems;

import java.io.*;
import java.util.ArrayList;

public class LangRegistry {

    protected BufferedWriter langWriter;

    public String FIREBALLS = "It shoots Fireballs";
    public String FLYING_FIREBALLS = "It fly's and shoots Fireballs";

    public void generate() {
        String langDir = "../src/main/resources/assets/forsaken/lang/en_us.json";

        File en_us = new File(langDir);

        ArrayList<String> mobList = new ArrayList<>(JEntities.entityName);

        ArrayList<String> blockList = new ArrayList<>(JBlocks.normalBlockName);
        ArrayList<String> logList = new ArrayList<>(JBlocks.logBlockName);
        ArrayList<String> crossList = new ArrayList<>(JBlocks.crossBlockName);
        ArrayList<String> tintedCrossList = new ArrayList<>(JBlocks.tintedCrossBlockName);
        ArrayList<String> tintedLeavesList = new ArrayList<>(JBlocks.tintedLeavesBlockName);
        ArrayList<String> doublePlantList = new ArrayList<>(JBlocks.doublePlantBlockName);
        ArrayList<String> lilyList = new ArrayList<>(JBlocks.lilyPadBlockName);
        ArrayList<String> paneList = new ArrayList<>(JBlocks.paneBlockName);
        ArrayList<String> attachedCrossList = new ArrayList<>(JBlocks.attachedCrossBlockName);
        ArrayList<String> doorList = new ArrayList<>(JBlocks.doorBlockName);
        ArrayList<String> trapDoorList = new ArrayList<>(JBlocks.trapDoorBlockName);
        ArrayList<String> stairList = new ArrayList<>(JBlocks.stairsBlockName);
        ArrayList<String> slabList = new ArrayList<>(JBlocks.slabBlockName);
        ArrayList<String> pressureList = new ArrayList<>(JBlocks.pressurePlateBlockName);
        ArrayList<String> buttonList = new ArrayList<>(JBlocks.buttonBlockName);
        ArrayList<String> gateList = new ArrayList<>(JBlocks.gateBlockName);
        ArrayList<String> fenceList = new ArrayList<>(JBlocks.fenceBlockName);
        ArrayList<String> modelBlockList = new ArrayList<>(JBlocks.modelBlockName);
        ArrayList<String> rotatableBlockList = new ArrayList<>(JBlocks.rotatableBlockName);
        ArrayList<String> vineBlockList = new ArrayList<>(JBlocks.vineBlockName);
        ArrayList<String> furnaceBlockList = new ArrayList<>(JBlocks.furnaceBlockName);
        ArrayList<String> portalBlockList = new ArrayList<>(JBlocks.portalBlockName);
        ArrayList<String> campfireBlockList = new ArrayList<>(JBlocks.campfireBlockName);
        ArrayList<String> chestBlockList = new ArrayList<>(JBlocks.chestBlockName);
        ArrayList<String> ladderBlockList = new ArrayList<>(JBlocks.ladderBlockName);
        ArrayList<String> pathBlockList = new ArrayList<>(JBlocks.pathBlockName);
        ArrayList<String> grassBlockList = new ArrayList<>(JBlocks.grassBlockName);
        ArrayList<String> overlayGrassBlockList = new ArrayList<>(JBlocks.overlayGrassBlockName);
        ArrayList<String> terrainBlockList = new ArrayList<>(JBlocks.terrainBlockName);
        ArrayList<String> randomizedBlockList = new ArrayList<>(JBlocks.randomBlockName);
        ArrayList<String> bushBlockList = new ArrayList<>(JBlocks.bushBlockName);
        ArrayList<String> farmBlockList = new ArrayList<>(JBlocks.farmlandBlockName);
        ArrayList<String> cropBlockList = new ArrayList<>(JBlocks.cropBlockName);
        ArrayList<String> wallBlockList = new ArrayList<>(JBlocks.wallBlockName);
        ArrayList<String> slimeBlockList = new ArrayList<>(JBlocks.slimeBlockName);
        ArrayList<String> trophyBlockList = new ArrayList<>(JBlocks.trophyBlockName);
        ArrayList<String> mushroomBlockList = new ArrayList<>(JBlocks.mushroomBlockName);
        ArrayList<String> basePortalBlockList = new ArrayList<>(JBlocks.basePortalBlockName);
        ArrayList<String> basePortalFrameBlockList = new ArrayList<>(JBlocks.basePortalFrameBlockName);
        ArrayList<String> topBottomBlockList = new ArrayList<>(JBlocks.topBottomBlockName);
        ArrayList<String> totemBlockList = new ArrayList<>(JBlocks.totemBlockName);
        ArrayList<String> dripstoneBlockList = new ArrayList<>(JBlocks.dripstoneBlockName);

        ArrayList<String> toolItemList = new ArrayList<>(JItems.toolName);
        ArrayList<String> itemList = new ArrayList<>(JItems.itemName);
        ArrayList<String> spawnEggList = new ArrayList<>(JItems.spawnName);
        ArrayList<String> bowItemList = new ArrayList<>(JItems.bowName);
        ArrayList<String> shieldItemList = new ArrayList<>(JItems.shieldName);
        ArrayList<String> recordList = new ArrayList<>(JItems.recordName);
        ArrayList<String> modelItemList = new ArrayList<>(JItems.modelName);
        ArrayList<String> recordDescList = new ArrayList<>(JItems.recordDescName);
        ArrayList<String> gunList = new ArrayList<>(JItems.gunName);
        ArrayList<String> hammerList = new ArrayList<>(JItems.hammerName);

        try {
            if(en_us.exists()) en_us.delete();
            en_us.createNewFile();
            langWriter = new BufferedWriter(new FileWriter(en_us));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writeToFile("{");
        /* --------------------- Add manual lines --------------------- */

        writeToFile("\"forsaken.boss_spawn.sky_stalker\" : \"Watch the Sky's...\",");

        /* --------------------- Finish manual lines --------------------- */

        for(int i = 0; i < mobList.size(); i++)
            writeToFile("\"entity.forsaken." + mobList.get(i) + "\": \"" + JEntities.entityLangName.get(i) + "\"" + ",");

        for(int i = 0; i < recordDescList.size(); i++)
            writeToFile("\"" + recordDescList.get(i) + "\": \"" + JItems.recordDescLangName.get(i) + "\",");

        for(int i = 0; i < blockList.size(); i++)
            writeToFile("\"block.forsaken." + blockList.get(i) + "\": \"" + JBlocks.normalLangName.get(i) + "\"" + ",");

        for(int i = 0; i < doublePlantList.size(); i++)
            writeToFile("\"block.forsaken." + doublePlantList.get(i) + "\": \"" + JBlocks.doublePlantLangName.get(i) + "\"" + ",");

        for(int i = 0; i < logList.size(); i++)
            writeToFile("\"block.forsaken." + logList.get(i) + "\": \"" + JBlocks.logLangName.get(i) + "\"" + ",");

        for(int i = 0; i < crossList.size(); i++)
            writeToFile("\"block.forsaken." + crossList.get(i) + "\": \"" + JBlocks.crossLangName.get(i) + "\"" + ",");

        for(int i = 0; i < lilyList.size(); i++)
            writeToFile("\"block.forsaken." + lilyList.get(i) + "\": \"" + JBlocks.lilyPadLangName.get(i) + "\"" + ",");

        for(int i = 0; i < tintedCrossList.size(); i++)
            writeToFile("\"block.forsaken." + tintedCrossList.get(i) + "\": \"" + JBlocks.tintedCrossLangName.get(i) + "\"" + ",");

        for(int i = 0; i < tintedLeavesList.size(); i++)
            writeToFile("\"block.forsaken." + tintedLeavesList.get(i) + "\": \"" + JBlocks.tintedLeavesLangName.get(i) + "\"" + ",");

        for(int i = 0; i < grassBlockList.size(); i++)
            writeToFile("\"block.forsaken." + grassBlockList.get(i) + "\": \"" + JBlocks.grassLangName.get(i) + "\"" + ",");

        for(int i = 0; i < chestBlockList.size(); i++)
            writeToFile("\"block.forsaken." + chestBlockList.get(i) + "\": \"" + JBlocks.chestLangName.get(i) + "\"" + ",");

        for(int i = 0; i < wallBlockList.size(); i++)
            writeToFile("\"block.forsaken." + wallBlockList.get(i) + "\": \"" + JBlocks.wallLangName.get(i) + "\"" + ",");

        for(int i = 0; i < vineBlockList.size(); i++)
            writeToFile("\"block.forsaken." + vineBlockList.get(i) + "\": \"" + JBlocks.vineLangName.get(i) + "\"" + ",");

        for(int i = 0; i < ladderBlockList.size(); i++)
            writeToFile("\"block.forsaken." + ladderBlockList.get(i) + "\": \"" + JBlocks.ladderLangName.get(i) + "\"" + ",");

        for(int i = 0; i < overlayGrassBlockList.size(); i++)
            writeToFile("\"block.forsaken." + overlayGrassBlockList.get(i) + "\": \"" + JBlocks.overlayGrassLangName.get(i) + "\"" + ",");

        for(int i = 0; i < paneList.size(); i++)
            writeToFile("\"block.forsaken." + paneList.get(i) + "\": \"" + JBlocks.paneLangName.get(i) + "\"" + ",");

        for(int i = 0; i < totemBlockList.size(); i++)
            writeToFile("\"block.forsaken." + totemBlockList.get(i) + "\": \"" + JBlocks.totemLangName.get(i) + "\"" + ",");

        for(int i = 0; i < dripstoneBlockList.size(); i++)
            writeToFile("\"block.forsaken." + dripstoneBlockList.get(i) + "\": \"" + JBlocks.dripstoneLangName.get(i) + "\"" + ",");

        for(int i = 0; i < terrainBlockList.size(); i++)
            writeToFile("\"block.forsaken." + terrainBlockList.get(i) + "\": \"" + JBlocks.terrainLangName.get(i) + "\"" + ",");

        for(int i = 0; i < attachedCrossList.size(); i++)
            writeToFile("\"block.forsaken." + attachedCrossList.get(i) + "\": \"" + JBlocks.attachedCrossLangName.get(i) + "\"" + ",");

        for(int i = 0; i < doorList.size(); i++)
            writeToFile("\"block.forsaken." + doorList.get(i) + "\": \"" + JBlocks.doorLangName.get(i) + "\"" + ",");

        for(int i = 0; i < trapDoorList.size(); i++)
            writeToFile("\"block.forsaken." + trapDoorList.get(i) + "\": \"" + JBlocks.trapDoorLangName.get(i) + "\"" + ",");

        for(int i = 0; i < stairList.size(); i++)
            writeToFile("\"block.forsaken." + stairList.get(i) + "\": \"" + JBlocks.stairsLangName.get(i) + "\"" + ",");

        for(int i = 0; i < slabList.size(); i++)
            writeToFile("\"block.forsaken." + slabList.get(i) + "\": \"" + JBlocks.slabLangName.get(i) + "\"" + ",");

        for(int i = 0; i < buttonList.size(); i++)
            writeToFile("\"block.forsaken." + buttonList.get(i) + "\": \"" + JBlocks.buttonLangName.get(i) + "\"" + ",");

        for(int i = 0; i < pressureList.size(); i++)
            writeToFile("\"block.forsaken." + pressureList.get(i) + "\": \"" + JBlocks.pressurePlateLangName.get(i) + "\"" + ",");

        for(int i = 0; i < fenceList.size(); i++)
            writeToFile("\"block.forsaken." + fenceList.get(i) + "\": \"" + JBlocks.fenceLangName.get(i) + "\"" + ",");

        for(int i = 0; i < gateList.size(); i++)
            writeToFile("\"block.forsaken." + gateList.get(i) + "\": \"" + JBlocks.gateLangName.get(i) + "\"" + ",");

        for(int i = 0; i < modelBlockList.size(); i++)
            writeToFile("\"block.forsaken." + modelBlockList.get(i) + "\": \"" + JBlocks.modelLangName.get(i) + "\"" + ",");

        for(int i = 0; i < rotatableBlockList.size(); i++)
            writeToFile("\"block.forsaken." + rotatableBlockList.get(i) + "\": \"" + JBlocks.rotatableLangName.get(i) + "\"" + ",");

        for(int i = 0; i < randomizedBlockList.size(); i++)
            writeToFile("\"block.forsaken." + randomizedBlockList.get(i) + "\": \"" + JBlocks.randomLangName.get(i) + "\"" + ",");

        for(int i = 0; i < mushroomBlockList.size(); i++)
            writeToFile("\"block.forsaken." + mushroomBlockList.get(i) + "\": \"" + JBlocks.mushroomLangName.get(i) + "\"" + ",");

        for(int i = 0; i < basePortalBlockList.size(); i++)
            writeToFile("\"block.forsaken." + basePortalBlockList.get(i) + "\": \"" + JBlocks.basePortalLangName.get(i) + "\"" + ",");

        for(int i = 0; i < basePortalFrameBlockList.size(); i++)
            writeToFile("\"block.forsaken." + basePortalFrameBlockList.get(i) + "\": \"" + JBlocks.basePortalFrameLangName.get(i) + "\"" + ",");

        for(int i = 0; i < topBottomBlockList.size(); i++)
            writeToFile("\"block.forsaken." + topBottomBlockList.get(i) + "\": \"" + JBlocks.topBottomLangName.get(i) + "\"" + ",");

        for(int i = 0; i < portalBlockList.size(); i++)
            writeToFile("\"block.forsaken." + portalBlockList.get(i) + "\": \"" + JBlocks.portalLangName.get(i) + "\"" + ",");

        for(int i = 0; i < campfireBlockList.size(); i++)
            writeToFile("\"block.forsaken." + campfireBlockList.get(i) + "\": \"" + JBlocks.campfireLangName.get(i) + "\"" + ",");

        for(int i = 0; i < pathBlockList.size(); i++)
            writeToFile("\"block.forsaken." + pathBlockList.get(i) + "\": \"" + JBlocks.pathLangName.get(i) + "\"" + ",");

        for(int i = 0; i < farmBlockList.size(); i++)
            writeToFile("\"block.forsaken." + farmBlockList.get(i) + "\": \"" + JBlocks.farmlandLangName.get(i) + "\"" + ",");

        for(int i = 0; i < cropBlockList.size(); i++)
            writeToFile("\"block.forsaken." + cropBlockList.get(i) + "\": \"" + JBlocks.cropLangName.get(i) + "\"" + ",");

        for(int i = 0; i < bushBlockList.size(); i++)
            writeToFile("\"block.forsaken." + bushBlockList.get(i) + "\": \"" + JBlocks.bushLangName.get(i) + "\"" + ",");

        for(int i = 0; i < furnaceBlockList.size(); i++)
            writeToFile("\"block.forsaken." + furnaceBlockList.get(i) + "\": \"" + JBlocks.furnaceLangName.get(i) + "\"" + ",");

        for(int i = 0; i < slimeBlockList.size(); i++)
            writeToFile("\"block.forsaken." + slimeBlockList.get(i) + "\": \"" + JBlocks.slimeLangName.get(i) + "\"" + ",");

        for(int i = 0; i < trophyBlockList.size(); i++)
            writeToFile("\"block.forsaken." + trophyBlockList.get(i) + "\": \"" + JBlocks.trophyLangName.get(i) + "\"" + ",");

        for(int i = 0; i < toolItemList.size(); i++)
            writeToFile("\"item.forsaken." + toolItemList.get(i) + "\": \"" + JItems.toolLangName.get(i) + "\"" + ",");

        for(int i = 0; i < bowItemList.size(); i++)
            writeToFile("\"item.forsaken." + bowItemList.get(i) + "\": \"" + JItems.bowLangName.get(i) + "\"" + ",");

        for(int i = 0; i < shieldItemList.size(); i++)
            writeToFile("\"item.forsaken." + shieldItemList.get(i) + "\": \"" + JItems.shieldLangName.get(i) + "\"" + ",");

        for(int i = 0; i < recordList.size(); i++)
            writeToFile("\"item.forsaken." + recordList.get(i) + "\": \"" + JItems.recordLangName.get(i) + "\"" + ",");

        for(int i = 0; i < spawnEggList.size(); i++)
            writeToFile("\"item.forsaken." + spawnEggList.get(i) + "\": \"" + JItems.spawnLangName.get(i) + "\"" + ",");

        for(int i = 0; i < modelItemList.size(); i++)
            writeToFile("\"item.forsaken." + modelItemList.get(i) + "\": \"" + JItems.modelLangName.get(i) + "\"" + ",");

        for(int i = 0; i < gunList.size(); i++)
            writeToFile("\"item.forsaken." + gunList.get(i) + "\": \"" + JItems.gunLangName.get(i) + "\"" + ",");

        for(int i = 0; i < hammerList.size(); i++)
            writeToFile("\"item.forsaken." + hammerList.get(i) + "\": \"" + JItems.hammerLangName.get(i) + "\"" + ",");


        int j = 0;
        for(int i = 0; i < itemList.size(); i++) {
            j++;
            String end = j == itemList.size() ? "" : ",";
            writeToFile("\"item.forsaken." + itemList.get(i) + "\": \"" + JItems.langName.get(i) + "\"" + end);
        }

        writeToFile("}");

        writerInit();
    }


    public String getHarmless(boolean harmless) {
        return harmless ? ", Harmless" : "";
    }

    public String getDrops(String drops) {
        return !drops.isEmpty() ? ", Chance to drop " + drops : "";
    }

    public String getNeutral(boolean neutral) {
        return neutral ? "Peaceful unless attacked" : "Will attack on sight";
    }

    public String getHealth(double health, double damage) {
        return damage != 0 ? "It has " + (int)health + "HP and does " + damage / 2 + "x Hearts of Damage" : "It has " + (int)health + "HP";
    }

    public void writerInit() {
        try {
            langWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile(String text){
        try {
            langWriter.write(text + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}