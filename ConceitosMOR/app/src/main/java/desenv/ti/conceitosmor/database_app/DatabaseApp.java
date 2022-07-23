package desenv.ti.conceitosmor.database_app;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import java.util.concurrent.Executors;

public abstract class DatabaseApp extends RoomDatabase {
    private static final String     TAG = "DatabaseApp";
    private static final String DB_NAME = "db_app.db";
    private static volatile DatabaseApp sInstance;

    public DatabaseApp() {}

    public static synchronized DatabaseApp getInstance(Context context) {
        if (sInstance == null) {
            sInstance = getConnection(context);
        }
        return sInstance;
    }

    private static DatabaseApp getConnection(Context activityContext) {
        DatabaseApp db = Room.databaseBuilder(activityContext, DatabaseApp.class, DB_NAME)
                .addCallback(initDB)
                .build();

        return db;

    }


    static RoomDatabase.Callback initDB = new RoomDatabase.Callback() {
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            Executors.newSingleThreadScheduledExecutor().execute(() -> {
                //Executar métodos e\ou rotinas logo appós a criação do banco
                Log.d(TAG, "Banco criado com sucesso! Executar rotinas posteriores.");

            });
        }

        public void onOpen(SupportSQLiteDatabase db){

        }

    };
}
