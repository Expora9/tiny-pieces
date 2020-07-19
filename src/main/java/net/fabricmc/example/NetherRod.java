package net.fabricmc.example;

import com.mojang.realmsclient.dto.RealmsServer;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

public class NetherRod extends Block
{

    public NetherRod(Settings settings) {
        super(Settings.of(Material.METAL).nonOpaque());

    }

}
