package com.yogify.bottomsheetdialog;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class ShowBottomsheet {

    public static void ShowBottomSheet(Context context,int layout,int id)
    {
        com.google.android.material.bottomsheet.BottomSheetDialog bottomSheetDialog;
        bottomSheetDialog = new com.google.android.material.bottomsheet.BottomSheetDialog(context);
        View view = LayoutInflater.from(context).inflate(layout,
                (RelativeLayout) bottomSheetDialog.findViewById(id));
        bottomSheetDialog.setContentView(view);
        bottomSheetDialog.getBehavior().setState(BottomSheetBehavior.STATE_EXPANDED);
        Window window = bottomSheetDialog.getWindow();
        window.findViewById(com.google.android.material.R.id.container).setFitsSystemWindows(false);
        bottomSheetDialog.show();
    }
    public static void ShowActivity(Context context)
    {
     context.startActivity(new Intent(context,MainActivity.class));
    }

}
