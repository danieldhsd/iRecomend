package com.example.irecomend.connection;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CriaBanco extends SQLiteOpenHelper {
    private static String NOME_BANCO = "iRecomend";
    private static int version = 1;

    public CriaBanco(Context context){
        super(context, NOME_BANCO,null,version);
    }

    @Override
    public void onCreate(SQLiteDatabase database){
        //Criar script para criar o banco caso ele não exista
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Criar script para deletar o banco caso ele já exista
        //db.execSQL("DROP TABLE IF EXISTS" + TABELA);
        onCreate(db);
    }

}
