package plugily.projects.amongcraft.handlers.hologram;

import org.bukkit.entity.ArmorStand;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Plajer
 * <p>
 * Created at 31.10.2020
 */
public class HologramManager {

  private static final List<ArmorStand> armorStands = new ArrayList<>();

  public static List<ArmorStand> getArmorStands() {
    return armorStands;
  }

}