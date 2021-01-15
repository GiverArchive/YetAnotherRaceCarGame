package me.giverplay.racecar.scenes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.TimeUtils;
import me.giverplay.racecar.Game;

public class LogoScene extends ScreenAdapter
{
  private final Game game;

  private Screen nextScene;

  private SpriteBatch batch;
  private Texture logo;

  private long createdTime;

  public LogoScene(Game game) {
    this.game = game;
  }

  @Override
  public void show() {
    nextScene = this; // TODO: Set on the Game
    createdTime = TimeUtils.millis();

    if(batch == null) {
      batch = new SpriteBatch();
    }

    if(logo == null) {
      logo = new Texture("logos/logo.png");
    }
  }

  @Override
  public void render(float delta) {

    if(TimeUtils.millis() - createdTime >= 3000) {
      game.setScreen(nextScene);
      return;
    }

    Gdx.gl.glClearColor(1, 0, 0, 1);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

    batch.begin();
    batch.draw(logo, 0, 0, Game.SCREEN_WIDTH, Game.SCREEN_HEIGHT);
    batch.end();
  }

  @Override
  public void dispose() {
    if(batch != null) {
      batch.dispose();
    }

    if(logo != null) {
      logo.dispose();
    }
  }

  public void setNextScene(Screen nextScene)
  {
    this.nextScene = nextScene;
  }
}
