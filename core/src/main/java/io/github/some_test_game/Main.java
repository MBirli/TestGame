package io.github.some_test_game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

public class Main extends Game {
    
    @Override
    public void create() {
        Gdx.graphics.setWindowedMode(800, 800);
        setScreen(new FirstScreen());
        
    }
}
