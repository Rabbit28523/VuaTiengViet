package com.example.appvuatiengviet;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class CSDL {
    DataBase db;
    public CSDL(Context applicationContext) {
        db = new DataBase(applicationContext, "VTV.sql", null, 1);
    }
    public void ChoiLai(Context context){
        db.QueryData("DROP TABLE IF EXISTS CauHoi" );
        TaoCSDL(context);
        Toast.makeText(context, "Bạn đã chọn chơi lại từ đầu", Toast.LENGTH_SHORT).show();
    }
    public void TaoCSDL(Context context) {
//        db.QueryData("DROP TABLE IF EXISTS Ruby" );
        Cursor cursor1 = db.GetData("SELECT name FROM sqlite_master WHERE type='table' AND name='Ruby'");
        if (cursor1 != null && cursor1.getCount() > 0) {
        } else {
            db.QueryData("CREATE TABLE IF NOT EXISTS Ruby (id INTEGER PRIMARY KEY AUTOINCREMENT,SoLuong Integer default 24)");
            db.QueryData("INSERT INTO Ruby  VALUES (null,2500)");
        }


        Cursor cursor = db.GetData("SELECT name FROM sqlite_master WHERE type='table' AND name='CauHoi'");
        if (cursor != null && cursor.getCount() > 0) {
        } else {
            db.QueryData("CREATE TABLE IF NOT EXISTS CauHoi (id INTEGER PRIMARY KEY AUTOINCREMENT, Tu TEXT, DapAn NVARCHAR(100), TinhTrang INTEGER DEFAULT 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'C/h/ị/h/c/t/ủ', 'Chủ tịch', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'c/L/ồ/ọ/n', 'Lọ cồn', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'n/ệ/n/ả/h/Đ/i', 'Điện ảnh', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'c/C/a/o/u/n', 'Con cua', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'s/ú/c/C/ố', 'Cú sốc', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'b/y/L/a/i', 'Ly bia', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'à/Đ/ô/n/g/n', 'Đàn ông', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'â/T/ẻ/t/r/r/u', 'Trẻ trâu', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'p/H/h/ồ/c/i/ụ', 'Hồi phục', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'T/u/t/à/á/o', 'Táo tàu', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'A/n/n/t/à/o', 'An toàn', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'c/C/ắ/h/n/c/h/ắ', 'Chắc chắn', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'á/K/ả/i/h/g', 'Khá giả', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'T/á/h/ệ/p/r/t/i', 'Triệt phá', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'L/a/a/n/n/c', 'Lan can', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'ắ/g/n/ò/Đ/g/n/l', 'Đắng lòng', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'ẻ/G/ở/q/i/u', 'Giở quẻ', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'c/C/u/ỉ/h/n/h', 'Chỉn chu', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'n/P/t/ụ/h/g/o/h', 'Phong thụ', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'i/P/v/g/ò/n/h', 'Phòng vi', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'i/ả/t/ế/G/i/h/t', 'Giả thiết', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'ả/Đ/c/i/g/ộ', 'Độc giả', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'ì/n/N/t/h/ô/n/g', 'Ngôn tình', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'í/h/ồ/n/i/C/u/m', 'Chín muồi', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'u/n/g/T/ự/t/r/u', 'Tựu trung', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'c/h/c/N/ậ/m/ứ/h', 'Nhậm chức', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'n/C/u/ẩ/đ/á/h/o/n', 'Chuẩn đoán', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'a/m/q/u/T/h/n/a', 'Tham quan', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'á/p/n/S/ậ/h/p', 'Sáp nhập', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'ậ/à/n/G/i/h/g/i/t', 'Giành giật', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'ú/c/t/S/c/h/í', 'Súc tích', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'g/ạ/B/t/ạ/n/m', 'Bạt mạng', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'t/á/C/x/ọ', 'Cọ xát', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'ạ/X/n/l/á/n', 'Xán lạn', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'c/ế/c/ụ/K/t', 'Kết cục', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'u/ề/Q/ả/n/h/y/u/n', 'Quản huyền', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'t/Q/á/c/ê/n/y/u', 'Quyên cát', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'ơ/ì/t/S/h/n', 'Sơ tình', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'ầ/p/ư/m/T/h/ơ/g/n', 'Tầm phương', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'â/m/T/a/n/h/k/h/h', 'Thanh khâm', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'h/u/n/X/â/u/y/ê/n', 'Xuân huyên', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'á/Đ/ư/s/n/ờ/g', 'Đường sá', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'d/D/à/h/m/ụ/n', 'Dành dụm', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'g/X/i/ụ/c/ú/i', 'Xúi giục', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'í/B/i/ả/h/c/g/n', 'Bích giản', 0)");
            db.QueryData("INSERT INTO CauHoi  VALUES (null,'ư/C/u/ử/h/n', 'Cửu như', 0)");
        }
    }
    public CauHoi HienCSDL(Context context){
        Cursor dataCV=db.GetData("SELECT * FROM CauHoi WHERE TinhTrang = 0 LIMIT 1");
        CauHoi cauHoi;
        if (dataCV != null && dataCV.moveToFirst()) {
            int id = dataCV.getInt(0);
            String tu = dataCV.getString(1);
            String dapAn = dataCV.getString(2);
            int tinhTrang = dataCV.getInt(3);
            cauHoi= new CauHoi(id, tu, dapAn, tinhTrang);
//            Toast.makeText(context, "id: " + dataCV.getInt(0) + "dapan: " + dataCV.getString(2), Toast.LENGTH_SHORT).show();
        }
        else {
            cauHoi= new CauHoi(-1,"aa","bb",0);
        }
        return cauHoi;
    }
    public int HienRuby(Context context){
        Cursor dataCV=db.GetData("SELECT * FROM Ruby  LIMIT 1");
        int soluong=0;
        if (dataCV != null && dataCV.moveToFirst()) {
            soluong = dataCV.getInt(1);
//            Toast.makeText(context, "id: " + dataCV.getInt(1) , Toast.LENGTH_SHORT).show();

        }
        return soluong;
    }
    public void Update(Context context, int id){
        db.QueryData("update CauHoi set TinhTrang=1 where id="+id);
    }
    public void UpdateRuby(Context context, int slg){
        db.QueryData("update Ruby set SoLuong= SoLuong+"+slg);
    }

}
class DataBase extends SQLiteOpenHelper {
    public DataBase(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    //truy vấn không trả kết quả:insert, update,delete
    public void QueryData (String sql){
        SQLiteDatabase db= getWritableDatabase();
        db.execSQL(sql);
    }
    //truy vấn có trả kết quả
    public Cursor GetData(String sql){
        SQLiteDatabase db= getReadableDatabase();
        return db.rawQuery(sql,null);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}