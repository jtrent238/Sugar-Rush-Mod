package com.jtrent238.sugarrush;

import com.jtrent238.sugarrush.entity.Entilyjtrent238;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityLoader {

	
	public static void LoadEntitys() {

	  //jtrent238 Registry
	    EntityRegistry.registerGlobalEntityID(Entilyjtrent238.class, "Entilyjtrent238",EntityRegistry.findGlobalUniqueEntityId());
	    RenderingRegistry.registerEntityRenderingHandler(Entilyjtrent238.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("sugarrush:Entilyjtrent238.png");}});//jtrent238 Texture
	    EntityRegistry.addSpawn(Entilyjtrent238.class, 1, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna);

	}
	//

}
