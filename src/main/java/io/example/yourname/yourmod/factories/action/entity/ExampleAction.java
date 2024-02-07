package io.example.yourname.yourmod.factories.action.entity;

import io.example.yourname.yourmod.ExampleMod;
import io.github.apace100.apoli.power.factory.action.ActionFactory;
import io.github.apace100.calio.data.SerializableData;
import net.minecraft.entity.Entity;
import net.minecraft.text.Text;

public class ExampleAction {

    public static void action(SerializableData.Instance data, Entity entity) {
        entity.sendMessage(Text.literal("Action performed!"));
    }

    public static ActionFactory<Entity> getFactory() {
        return new ActionFactory<>(
            ExampleMod.identifier("example_action"),
            new SerializableData(),
            ExampleAction::action
        );
    }

}
