package com.agos.game;

import com.agos.game.manager.AssetManager;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MainGame extends Game{
    public static final String TITLE = "TiredUP!"; //game title
    public static final int WIDTH = 600, HEIGHT = 320; //game screen size
    public static final float STEP = 1/60f, PPM = 100; //STEP is for world step/movement PPM is scaling the box2d e.g 1 point = 100 metre

    //sample
    private SpriteBatch batch;
    private AssetManager asset;

    @Override
    public void create() {
        batch = new SpriteBatch();
        asset = new AssetManager();

        asset.loadTexture("badlogic.jpg");
    }

    @Override
    public void render() {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(asset.getTexture("badlogic"), 0, 0);
        batch.end();
    }

    @Override
    public void dispose() {
    }
}
