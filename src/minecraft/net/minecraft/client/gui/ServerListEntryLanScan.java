package net.minecraft.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;

public class ServerListEntryLanScan implements GuiListExtended.IGuiListEntry
{
    private final Minecraft field_148288_a = Minecraft.getMinecraft();
    private static final String __OBFID = "CL_00000815";

    public void drawEntry(int slotIndex, int x, int y, int listWidth, int slotHeight, int mouseX, int mouseY, boolean isSelected)
    {
        int var9 = y + slotHeight / 2 - this.field_148288_a.fontRendererObj.FONT_HEIGHT / 2;
        this.field_148288_a.fontRendererObj.drawString(""/*I18n.format("lanServer.scanning", new Object[0])*/, this.field_148288_a.currentScreen.width / 2 - this.field_148288_a.fontRendererObj.getStringWidth(I18n.format("lanServer.scanning", new Object[0])) / 2, var9, 16777215);
        String var10;

        switch ((int)(Minecraft.getSystemTime() / 170L % 10L))
        {
            case 0:
            default:
                var10 = "Kai Wei is gay";
                break;

            case 1:
            case 9:
                var10 = "Kai Wei is gaay";
                break;

            case 2:
            case 8:
                var10 = "Kai Wei is gaaay";
                break;

            case 3:
            case 7:
                var10 = "Kai Wei is gaaaay";
                break;

            case 4:
            case 6:
                var10 = "Kai Wei is gaaaaay";
                break;

            case 5:
                var10 = "Kai Wei is gaaaaaay";
                break;
        }

        this.field_148288_a.fontRendererObj.drawString(var10, this.field_148288_a.currentScreen.width / 2 - this.field_148288_a.fontRendererObj.getStringWidth(var10) / 2, var9 + this.field_148288_a.fontRendererObj.FONT_HEIGHT, 8421504);
    }

    public void setSelected(int p_178011_1_, int p_178011_2_, int p_178011_3_) {}

    /**
     * Returns true if the mouse has been pressed on this control.
     */
    public boolean mousePressed(int p_148278_1_, int p_148278_2_, int p_148278_3_, int p_148278_4_, int p_148278_5_, int p_148278_6_)
    {
        return false;
    }

    /**
     * Fired when the mouse button is released. Arguments: index, x, y, mouseEvent, relativeX, relativeY
     */
    public void mouseReleased(int slotIndex, int x, int y, int mouseEvent, int relativeX, int relativeY) {}
}
