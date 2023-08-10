package me.carrotfarmer.nuclearenergy.general;




import org.bukkit.Material;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;

@UtilityClass
public final class BaseItems {
    public static SlimefunItemStack em_coil = new SlimefunItemStack(
        "EM_COIL", 
        Material.ACACIA_FENCE, 
        "&4Electromagnetic Coil", 
        "&cWhat can you make with this?"
    );
    public static SlimefunItemStack dynamo = new SlimefunItemStack(
        "DYNAMO", 
        Material.GRAY_CONCRETE, 
        "&4Dynamo", 
        "&cApparently this. What can you use it for?"
    );

}