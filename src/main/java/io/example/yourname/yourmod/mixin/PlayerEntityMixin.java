package io.example.yourname.yourmod.mixin;

import io.example.yourname.yourmod.factories.power.ExamplePower;
import io.github.apace100.apoli.component.PowerHolderComponent;
import io.github.apace100.apoli.power.Power;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin {

    @Inject(method = "isOnSoulSpeedBlock", at = @At("RETURN"), cancellable = true)
    private void mimicSoulSpeed(CallbackInfoReturnable<Boolean> cir) {
        PlayerEntity player = (PlayerEntity)(Object)this;
        if(PowerHolderComponent.getPowers(player, ExamplePower.class).stream().anyMatch(Power::isActive)) {
            cir.setReturnValue(true);
        }
    }
}
