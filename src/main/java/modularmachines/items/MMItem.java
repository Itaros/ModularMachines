package modularmachines.items;

import modularmachines.main.MM;
import modularmachines.main.init.MMTabs;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class MMItem extends Item{
	public MMItem(int stackSize, String name, String texture) {
		setMaxStackSize(stackSize);
		setUnlocalizedName(MM.modName.toLowerCase() + "." + "item" + "." + name.toLowerCase());
		setCreativeTab(MMTabs.tabMain);
		this.name = name;
		this.texture = texture;
		GameRegistry.registerItem(this, this.getUnlocalizedName());
	}
	String name;
	String texture;
	
	@Override
    public void registerIcons(IIconRegister ir){
        itemIcon = ir.registerIcon(MM.modName.toLowerCase() + ":" + texture);
	}
}