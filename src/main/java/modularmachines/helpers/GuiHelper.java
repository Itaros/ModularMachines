package modularmachines.helpers;

public class GuiHelper {
	public static boolean isMouseBetween(int mouseX, int mouseY, int x, int y, int width, int height) {
		int xSize = x + width;
		int ySize = y + height;
		
		if(mouseX > x && mouseX < xSize && mouseY > y && mouseY < ySize)
			return true;
		
		return false;
	}
}