package modularmachines.api.main;

import modularmachines.api.heat.MMHeatFuels;
import modularmachines.api.misc.InteractingUpgrade;
import modularmachines.api.misc.Upgrade;
import net.minecraft.item.Item;

public class MMApi {
	public static void addUpgrade(Item item, Upgrade upgrade){
		MMUpgrades.addUpgrade(item, upgrade);
	}
	public static MMUpgrades upgrades;
	
	public static void addInteractingUpgrade(Item item, InteractingUpgrade upgrade){
		MMInteractingUpgrades.addUpgrade(item, upgrade);
	}
	public static MMInteractingUpgrades interactingUpgrades;
	
	public static void addFuel(Item Item, int amount){
		MMHeatFuels.addFuel(Item, amount);
	}
	public static MMHeatFuels heatFuel;
}