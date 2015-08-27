package com.praddy.androidgames.doodlesnake;

import com.praddy.androidgames.framework.Screen;
import com.praddy.androidgames.framework.impl.AndroidGame;

public class DoodleSnake extends AndroidGame {
    @Override
    public Screen getStartScreen() {
        return new LoadingScreen(this); 
    }
}
