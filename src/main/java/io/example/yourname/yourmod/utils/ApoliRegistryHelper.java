package io.example.yourname.yourmod.utils;

import io.github.apace100.apoli.power.factory.PowerFactory;
import io.github.apace100.apoli.power.factory.PowerFactorySupplier;
import io.github.apace100.apoli.power.factory.action.ActionFactory;
import io.github.apace100.apoli.power.factory.condition.ConditionFactory;
import io.github.apace100.apoli.registry.ApoliRegistries;
import net.minecraft.block.pattern.CachedBlockPosition;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.StackReference;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registry;
import net.minecraft.util.Pair;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.apache.commons.lang3.tuple.Triple;

public class ApoliRegistryHelper {

    public static void registerEntityCondition(ConditionFactory<Entity> conditionFactory) {
        Registry.register(ApoliRegistries.ENTITY_CONDITION, conditionFactory.getSerializerId(), conditionFactory);
    }

    public static void registerEntityAction(ActionFactory<Entity> conditionFactory) {
        Registry.register(ApoliRegistries.ENTITY_ACTION, conditionFactory.getSerializerId(), conditionFactory);
    }

    public static void registerItemCondition(ConditionFactory<Pair<World, ItemStack>> conditionFactory) {
        Registry.register(ApoliRegistries.ITEM_CONDITION, conditionFactory.getSerializerId(), conditionFactory);
    }

    public static void registerItemAction(ActionFactory<Pair<World, StackReference>> conditionFactory) {
        Registry.register(ApoliRegistries.ITEM_ACTION, conditionFactory.getSerializerId(), conditionFactory);
    }

    public static void registerBlockCondition(ConditionFactory<CachedBlockPosition> conditionFactory) {
        Registry.register(ApoliRegistries.BLOCK_CONDITION, conditionFactory.getSerializerId(), conditionFactory);
    }

    public static void registerBlockAction(ActionFactory<Triple<World, BlockPos, Direction>> conditionFactory) {
        Registry.register(ApoliRegistries.BLOCK_ACTION, conditionFactory.getSerializerId(), conditionFactory);
    }

    public static void registerPowerFactory(PowerFactory<?> serializer) {
        Registry.register(ApoliRegistries.POWER_FACTORY, serializer.getSerializerId(), serializer);
    }

    public static void registerPowerFactorySupplier(PowerFactorySupplier<?> supplier) {
        registerPowerFactory(supplier.createFactory());
    }

}
