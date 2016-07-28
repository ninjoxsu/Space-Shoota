package com.agos.game.manager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

import java.util.HashMap;

public class AssetManager {
    private HashMap<String, Texture> textures;

    public AssetManager(){
        textures = new HashMap<String, Texture>();
    }

    //Textures
    public void loadTexture(String path){
        int slashIndex = path.lastIndexOf('/');
        String key;
        if(slashIndex == -1){
            key = path.substring(0, path.lastIndexOf('.'));
        }else{
            key = path.substring(slashIndex + 1, path.lastIndexOf('.'));
        }
        loadTexture(path, key);
    }

    public void loadTexture(String path, String key){
        Texture tex = new Texture(Gdx.files.internal(path));
        textures.put(key, tex);
    }

    public Texture getTexture(String key){
        return textures.get(key);
    }

    public void removeTexture(String key){
        Texture tex = textures.get(key);
        if(tex != null){
            textures.remove(key);
            tex.dispose();
        }
    }
}
