package com.example.win.easy.display;

import android.widget.TabHost;

import com.example.win.easy.Constants;
import com.example.win.easy.MainActivity;
import com.example.win.easy.song.Song;

import java.util.List;

public class ImplementSongListView implements SongListView {

    /**
     * 展示一首歌的所有所在歌单
     * @param songLists
     * @param songToDisplay
     */
    @Override
    public void update(List<SongList> songLists, Song songToDisplay,TabHost tabHost,Integer[] tabs) {

        TabHost.TabSpec[] spec=new TabHost.TabSpec[Constants.NumberOfList];
        String[] tabName=new String[]{"tab1","tab2","tab3"};

        for(int i = 0; i<Constants.NumberOfList; i++){
            spec[i]=tabHost.newTabSpec(tabName[i]);
            spec[i].setIndicator(songLists.get(i).getName(),null);
            spec[i].setContent((tabs[i]));
        }
        tabHost.clearAllTabs();
        for(int i=0;i<Constants.NumberOfList;i++)
            tabHost.addTab(spec[i]);
    }
}
