package modularmachines.items;

import modularmachines.main.MM;
import modularmachines.main.init.MMTabs;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class MMSpecialUpgradeScreen extends Item{

	public MMSpecialUpgradeScreen() {
		setMaxStackSize(1);
		setUnlocalizedName(MM.modName.toLowerCase() + "." + "item" + "." + "screen");
		setCreativeTab(MMTabs.tabMain);
		
		GameRegistry.registerItem(this, this.getUnlocalizedName());
	}
	
	@Override
    public void registerIcons(IIconRegister ir) 
	{
		itemIcon = ir.registerIcon(MM.modName.toLowerCase() + ":" + "machine_front");
	}
}