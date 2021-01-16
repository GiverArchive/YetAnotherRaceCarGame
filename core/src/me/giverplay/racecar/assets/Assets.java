package me.giverplay.racecar.assets;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.assets.loaders.resolvers.InternalFileHandleResolver;
import com.badlogic.gdx.utils.Disposable;

public final class Assets implements Disposable
{
  private final AssetManager assetManager = new AssetManager(new InternalFileHandleResolver());

  public float getProgress() {
    return assetManager.getProgress() * 100.0f;
  }

  public <T> T get(AssetDescriptor<T> descriptor) {
    return assetManager.get(descriptor);
  }

  public void load(AssetDescriptor<?> descriptor) {
    assetManager.load(descriptor);
  }

  @Override
  public void dispose() {
    assetManager.dispose();
  }
}
