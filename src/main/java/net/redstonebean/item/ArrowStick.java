package net.redstonebean.item;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ArrowStick extends Item {

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ArrowEntity arrow = new ArrowEntity(EntityType.ARROW, world);

        arrow.setPos(user.getX(), user.getEyeY(), user.getZ());
        arrow.setVelocity(user, user.getPitch(),user.getYaw(),0.0f,5.0f, 0.5f);
        arrow.setOwner(user);

        world.spawnEntity(arrow);
        return super.use(world, user, hand);
    }

    public ArrowStick(Settings settings) {
        super(settings);
    }
}
