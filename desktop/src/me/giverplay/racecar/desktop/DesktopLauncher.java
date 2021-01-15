package me.giverplay.racecar.desktop;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import me.giverplay.racecar.Game;

public class DesktopLauncher
{
  public static void main(String[] arg) {
    Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
    config.useVsync(false);
    config.setTitle(Game.TITLE);
    config.setWindowedMode(Game.SCREEN_WIDTH, Game.SCREEN_HEIGHT);

    new Lwjgl3Application(new Game(), config);
  }
}
