package io.example.yourname.yourmod.factories;

import io.example.yourname.yourmod.factories.action.entity.ExampleAction;
import io.example.yourname.yourmod.factories.condition.entity.ExampleCondition;
import io.example.yourname.yourmod.factories.power.ExamplePower;
import io.example.yourname.yourmod.utils.ApoliRegistryHelper;

public class ExampleTypeRegistry {

    public static void register() {
        ApoliRegistryHelper.registerEntityAction(ExampleAction.getFactory());
        ApoliRegistryHelper.registerEntityCondition(ExampleCondition.getFactory());
        ApoliRegistryHelper.registerPowerFactory(ExamplePower.getFactory());
    }

}
