package com.example.irecomend.connection;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.irecomend.model.bean.Cliente;
import com.example.irecomend.model.dao.ClienteDAO;

import java.util.ArrayList;

public class Conexao extends SQLiteOpenHelper{

    private static final String name = "iRecomend";
    private static final int version = 1;
    private ArrayList<String> scripts;


    public Conexao(Context context) {
        super(context, name, null, version);
        this.preencheScripts();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        for (String script:this.scripts) {
            db.execSQL(script);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    private void preencheScripts(){
        this.scriptCliente();
        this.scriptEvento();
        this.scriptAcaoHistorico();
        this.scriptImagem();
        this.scriptHistorico();
    }
    private void scriptCliente(){ //Script índice 0
        this.scripts.add("CREATE TABLE `Cliente` (\n" +
                "  `idCliente` INT NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
                "  `nome` TEXT NOT NULL,\n" +
                "  `sobrenome` TEXT NOT NULL,\n" +
                "  `email` TEXT NOT NULL,\n" +
                "  `senha` TEXT NOT NULL)");
    }

    private void scriptEvento(){ //Script índice 1
        this.scripts.add("CREATE TABLE `Evento` (\n" +
                "  `idEvento` INT NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
                "  `nome` TEXT NOT NULL,\n" +
                "  `data` DATETIME NOT NULL,\n" +
                "  `preco` DECIMAL(10,2) NULL,\n" +
                "  `likes` INT NULL,\n" +
                "  `deslike` INT NULL,\n" +
                "  `endereco` TEXT NULL,\n" +
                "  `numero` INT NULL,\n" +
                "  `bairro` TEXT NULL,\n" +
                "  `cidade` TEXT NULL,\n" +
                "  `estado` TEXT NULL,\n" +
                "  `cep` TEXT NULL,\n" +
                "  `pais` TEXT NULL,\n" +
                "  `latitude` TEXT NULL,\n" +
                "  `longitude` TEXT NULL)");
    }
    private void scriptAcaoHistorico(){ //Script índice 2
        this.scripts.add("CREATE TABLE `AcaoHistorico` (\n" +
                "  `idAcaoHistorico` INT NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
                "  `descricao` TEXT NULL)");
    }
    private void scriptImagem() { //Script índice 3
        this.scripts.add("CREATE TABLE `Imagem` (\n" +
                "  `idImagem` INT NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
                "  `nome` TEXT NULL,\n" +
                "  `caminho` TEXT NULL,\n" +
                "  `idEvento` INT NOT NULL,\n" +
                "    FOREIGN KEY (`idEvento`)\n" +
                "    REFERENCES `Evento` (`idEvento`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE)");
    }
    private void scriptHistorico(){ //Script índice 4
        this.scripts.add("CREATE TABLE `Historico` (\n" +
                "  `idHistorico` INT NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
                "  `idCliente` INT NOT NULL,\n" +
                "  `idEvento` INT NOT NULL,\n" +
                "  `idAcaoHistorico` INT NOT NULL,\n" +
                "    FOREIGN KEY (`idCliente`)\n" +
                "    REFERENCES `Cliente` (`idCliente`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE,\n" +
                "    FOREIGN KEY (`idEvento`)\n" +
                "    REFERENCES `Evento` (`idEvento`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE,\n" +
                "    FOREIGN KEY (`IdAcaoHistorico`)\n" +
                "    REFERENCES `AcaoHistorico` (`idAcaoHistorico`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE)");
    }

    public static final String COL_1 = "idCliente";
    public static final String COL_2 = "email";
    public static final String COL_3 = "senha";
    public static final String TABLE_NAME = "Cliente";

    public boolean checaUsuario(String email, String senha){
        String[] columns = { COL_1};
        SQLiteDatabase db = getReadableDatabase();
        String selection = COL_2 + "=?" + "and " + COL_3 + "=?" ;
        String[] selectionArgs = {email,senha};
        Cursor cursor = db.query(TABLE_NAME, columns, selection, selectionArgs, null,null,null);

        int count = cursor.getCount();
        cursor.close();
        db.close();

        if(count>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


}
