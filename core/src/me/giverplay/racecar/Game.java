package me.giverplay.racecar;

import me.giverplay.racecar.assets.Assets;
import me.giverplay.racecar.scenes.LogoScene;

public class Game extends com.badlogic.gdx.Game
{
	public static final String TITLE = "Yet another Race Car game";

	public static final int SCREEN_WIDTH = 1280;
	public static final int SCREEN_HEIGHT = 720;

	private LogoScene logoScene;
	private Assets assets;

	@Override
	public void create () {
	  assets = new Assets();
		logoScene = new LogoScene(this);
		setScreen(logoScene);
	}

	@Override
	public void dispose () {
		logoScene.dispose();
		assets.dispose();
	}

	public LogoScene getLogoScene()
	{
		return logoScene;
	}
}
