package io.example.yourname.yourmod.factories.condition.entity;

import io.github.apace100.apoli.power.factory.condition.ConditionFactory;
import io.github.apace100.calio.data.SerializableData;
import io.example.yourname.yourmod.ExampleMod;
import net.minecraft.entity.Entity;

public class ExampleCondition {

    public static boolean condition(SerializableData.Instance data, Entity entity) {
        return entity.isCrawling();

    }

    public static ConditionFactory<Entity> getFactory() {
        return new ConditionFactory<>(
            ExampleMod.identifier("example_condition"),
            new SerializableData(),
            ExampleCondition::condition
        );
    }

}
