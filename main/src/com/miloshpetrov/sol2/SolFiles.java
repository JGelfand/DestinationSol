package com.miloshpetrov.sol2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.miloshpetrov.sol2.game.DebugAspects;

public class SolFiles {

  public static FileHandle readOnly(String path) {
    if (DebugAspects.REPO_PATH == null) return Gdx.files.internal(path);
    return Gdx.files.absolute(DebugAspects.REPO_PATH + "/main/" + path);
  }
}
