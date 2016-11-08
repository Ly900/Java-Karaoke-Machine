 package com.lynguyen;

import com.ly.nguyen.model.SongBook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KaraokeMachine {
  private SongBook mSongBook;
  private BufferedReader mReader;

  public KaraokeMachine(SongBook songBook) {
    mSongBook = songBook;
    mReader = new BufferedReadernew (InputStreamReader(System.in));
  }

}
