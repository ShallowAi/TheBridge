package plugily.projects.amongcraft.commands.arguments.data;

import plugily.projects.amongcraft.Main;
import plugily.projects.amongcraft.handlers.ChatManager;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Plajer
 * <p>
 * Created at 31.10.2020
 */
public class LabelData {

  private final String text;
  private String command;
  private String description;

  public LabelData(String text, String command, String description) {
    ChatManager chatManager = JavaPlugin.getPlugin(Main.class).getChatManager();
    this.text = chatManager.colorRawMessage(text);
    this.command = command;
    this.description = chatManager.colorRawMessage(description);
  }

  public String getText() {
    return text;
  }

  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}