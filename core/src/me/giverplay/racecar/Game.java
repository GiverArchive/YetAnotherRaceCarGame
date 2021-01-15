package me.giverplay.racecar;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import me.giverplay.racecar.scenes.LogoScene;

public class Game extends com.badlogic.gdx.Game
{
	public static final String TITLE = "Yet another Race Car game";

	public static final int SCREEN_WIDTH = 1280;
	public static final int SCREEN_HEIGHT = 720;

	private LogoScene logoScene;

	@Override
	public void create () {
		logoScene = new LogoScene(this);
		setScreen(logoScene);
	}

	@Override
	public void dispose () {
		logoScene.dispose();
	}

	public LogoScene getLogoScene()
	{
		return logoScene;
	}
}
