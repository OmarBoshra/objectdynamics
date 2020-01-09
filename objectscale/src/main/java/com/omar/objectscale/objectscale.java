package com.omar.objectscale;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;


public class objectscale {

    private int [] lastTouchDownXY = new int [2];


    public void touchgrappingMechanism(MotionEvent motionEvent, View
            view, final View rootLayout, Context context){

        int doublepaddingID = context.getResources().getIdentifier("doublepadding", "dimen", context.getPackageName());
        int buttompaddingID = context.getResources().getIdentifier("bottomtooolbarheight", "dimen", context.getPackageName());

        float doublepadding =(context.getResources().getDimension(doublepaddingID));
        float buttompadding =(context.getResources().getDimension(buttompaddingID));

        int action = motionEvent.getActionMasked();

        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();

        lastTouchDownXY[0] = (int) motionEvent.getRawX();
        lastTouchDownXY[1] = (int) motionEvent.getRawY();

        switch(action) {


            case MotionEvent.ACTION_DOWN:


            case MotionEvent.ACTION_MOVE:


                if((lastTouchDownXY[0] - (view.getWidth() / 2))>=0&&lastTouchDownXY[1] - (view.getHeight())>=0) {
                    if ((lastTouchDownXY[0] - (view.getWidth() / 2)) + view.getWidth() < (rootLayout.getWidth() - (doublepadding)) && (lastTouchDownXY[1] - (view.getHeight())) + view.getHeight() < (rootLayout.getHeight() - (doublepadding + buttompadding))) {

                        layoutParams.leftMargin = lastTouchDownXY[0] - (view.getWidth() / 2);
                        layoutParams.topMargin = lastTouchDownXY[1] - (view.getHeight());

                    }
                }

                view.setLayoutParams(layoutParams);



                break;
            case MotionEvent.ACTION_UP:




            case MotionEvent.ACTION_CANCEL:


        }
    }
}
