package com.hermannproject.com;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class FlashPage extends AppCompatActivity {

    private boolean isMyFirstConnexion = false;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_flash_page);
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                Log.e("flaspage","Flaspage");
//                StaticObject.setLastInfoEntities(new ArrayList<>());
//                StaticObject.setLastInfoEntities(RoomData.getDB(context)
//                        .lastInfoEntity().getAll());
//                StaticObject.setOnlineMode(true);
//                isItMyFirstConnexion();
            }
        });

    }


//    private void isItMyFirstConnexion(){
//
//        boolean response = false;
//        List<UserEntity> userList = RoomData.getDB(context).userDao().getAll();
//        Log.e("userList",userList.toString());
//
//        if(userList!=null && userList.size()>0){
//            UserEntity u = userList.get(0);
//            if(u.getLast()!=null) {
//                Log.e("u.getLast0",u.getLast()+"==="+MyDatabase.version);
//
//                if (!u.getLast().equals(MyDatabase.version + "")) {
//                    Log.e("u.getLast()",u.getLast()+"==="+MyDatabase.version);
//
//                    response = true;
//                }
//            }else{
//                response = true;
//            }
//        }else{
//            response = true;
//        }
//        isMyFirstConnexion =response;
//        Message childThreadMessage = new Message();
//        childThreadMessage.what = 1;
//        // Put the message in main thread message queue.
//        StaticObject.getMainThreadHandler().sendMessage(childThreadMessage);//mainThreadHandler.sendMessage(childThreadMessage);
//    }

    public  void actionDoByHandler(){
//        if (!isMyFirstConnexion) {
//
//          /*
//          OPEN HOME PAGE
//           */
//            Intent home = new Intent(this, home.class);
//            this.startActivity(home);
//
//        } else {
//            Intent home = new Intent(this, Login.class);
//            this.startActivity(home);
//        }
    }
}