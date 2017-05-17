package com.newhartsolutions.tutorialmod.proxy;

import com.newhartsolutions.tutorialmod.item.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Luke.Newhart on 5/17/2017.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Override
    public void init(FMLInitializationEvent event) {
        ModItems.registerRenders();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }
}

