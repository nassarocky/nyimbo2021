package com.nyimbozamani.nyimbozazamani.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import com.nyimbozamani.nyimbozazamani.R;
import com.nyimbozamani.nyimbozazamani.model.Song;

public class AutoGeneratedPlaylistBitmap {
    private static final String TAG = "AutoGeneratedPB";

    /*
    public static Bitmap getBitmapWithCollectionFrame(Context context, List<Song> songPlaylist, boolean round, boolean blur) {
        Bitmap bitmap = getBitmap(context,songPlaylist,round,blur);
        int w = bitmap.getWidth();
        Bitmap ret = Bitmap.createBitmap(w,w,Bitmap.Config.ARGB_8888);
    }
    */
    public static Bitmap getBitmap(
            Context context, List<Song> songPlaylist, boolean round, boolean blur) {
        if (songPlaylist == null || songPlaylist.isEmpty()) return null;
        long start = System.currentTimeMillis();
        // lấy toàn bộ album id, loại bỏ trùng nhau
        List<Long> albumID = new ArrayList<>();
        for (Song song : songPlaylist) {
            if (!albumID.contains(song.getAlbumId())) albumID.add(song.getAlbumId());
        }

        long start2 = System.currentTimeMillis() - start;

        // lấy toàn bộ art tồn tại
        List<Bitmap> art = new ArrayList<Bitmap>();
        for (Long id : albumID) {
            Bitmap bitmap = getBitmapWithAlbumId(context, id);
            if (bitmap != null) art.add(bitmap);
            if (art.size() == 6) break;
        }
        return MergedImageUtils.INSTANCE.joinImages(art);
    /*

    long start3 = System.currentTimeMillis() - start2 - start;
    Bitmap ret;
    switch (art.size()) {
        // lấy hình mặc định
        case 0:
            ret = getDefaultBitmap(context, round).copy(Bitmap.Config.ARGB_8888, false);
            break;
        // dùng hình duy nhất
        case 1:
            if (round)
                ret = BitmapEditor.getRoundedCornerBitmap(art.get(0), art.get(0).getWidth() / 40);
            else ret = art.get(0);
            break;
        // từ 2 trở lên ta cần vẽ canvas
        default:
            ret = getBitmapCollection(art, round);
    }
    int w = ret.getWidth();
    if (blur)
        return BitmapEditor.GetRoundedBitmapWithBlurShadow(context, ret, w / 24, w / 24, w / 24, w / 24, 0, 200, w / 40, 1);

    Log.d(TAG, "getBitmap: time = " + (System.currentTimeMillis() - start) + ", start2 = " + start2 + ", start3 = " + start3);
    return ret;*/
    }

    private static Bitmap getBitmapCollection(ArrayList<Bitmap> art, boolean round) {
        long start = System.currentTimeMillis();
        // lấy kích thước là kích thước của bitmap lớn nhất
        int max_width = art.get(0).getWidth();
        for (Bitmap b : art) if (max_width < b.getWidth()) max_width = b.getWidth();
        Bitmap bitmap = Bitmap.createBitmap(max_width, max_width, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(max_width / 100);
        paint.setColor(0xffffffff);
        switch (art.size()) {
            case 2:
                canvas.drawBitmap(art.get(1), null, new Rect(0, 0, max_width, max_width), null);
                canvas.drawBitmap(
                        art.get(0), null, new Rect(-max_width / 2, 0, max_width / 2, max_width), null);
                canvas.drawLine(max_width / 2, 0, max_width / 2, max_width, paint);
                break;
            case 3:
                canvas.drawBitmap(
                        art.get(0), null, new Rect(-max_width / 4, 0, 3 * max_width / 4, max_width), null);
                canvas.drawBitmap(
                        art.get(1), null, new Rect(max_width / 2, 0, max_width, max_width / 2), null);
                canvas.drawBitmap(
                        art.get(2), null, new Rect(max_width / 2, max_width / 2, max_width, max_width), null);
                canvas.drawLine(max_width / 2, 0, max_width / 2, max_width, paint);
                canvas.drawLine(max_width / 2, max_width / 2, max_width, max_width / 2, paint);
                break;
            case 4:
                canvas.drawBitmap(art.get(0), null, new Rect(0, 0, max_width / 2, max_width / 2), null);
                canvas.drawBitmap(
                        art.get(1), null, new Rect(max_width / 2, 0, max_width, max_width / 2), null);
                canvas.drawBitmap(
                        art.get(2), null, new Rect(0, max_width / 2, max_width / 2, max_width), null);
                canvas.drawBitmap(
                        art.get(3), null, new Rect(max_width / 2, max_width / 2, max_width, max_width), null);
                canvas.drawLine(max_width / 2, 0, max_width / 2, max_width, paint);
                canvas.drawLine(0, max_width / 2, max_width, max_width / 2, paint);
                break;
            // default: canvas.drawBitmap(art.get(0),null,new Rect(0,0,max_width,max_width),null);
            default:

                // độ rộng của des bitmap
                float w = (float) (Math.sqrt(2) / 2 * max_width);
                float b = (float) (max_width / Math.sqrt(5));
                // khoảng cách định nghĩa, dùng để tính vị trí tâm của 4 bức hình xung quanh
                float d = (float) (max_width * (0.5f - 1 / Math.sqrt(10)));
                float deg = 45;

                for (int i = 0; i < 5; i++) {
                    canvas.save();
                    switch (i) {
                        case 0:
                            canvas.translate(max_width / 2, max_width / 2);
                            canvas.rotate(deg);
                            // b = (float) (max_width*Math.sqrt(2/5f));
                            canvas.drawBitmap(art.get(0), null, new RectF(-b / 2, -b / 2, b / 2, b / 2), null);
                            break;
                        case 1:
                            canvas.translate(d, 0);
                            canvas.rotate(deg);
                            canvas.drawBitmap(art.get(i), null, new RectF(-w / 2, -w / 2, w / 2, w / 2), null);
                            paint.setAntiAlias(true);
                            canvas.drawLine(w / 2, -w / 2, w / 2, w / 2, paint);
                            break;
                        case 2:
                            canvas.translate(max_width, d);
                            canvas.rotate(deg);
                            canvas.drawBitmap(art.get(i), null, new RectF(-w / 2, -w / 2, w / 2, w / 2), null);
                            paint.setAntiAlias(true);
                            canvas.drawLine(-w / 2, w / 2, w / 2, w / 2, paint);
                            break;
                        case 3:
                            canvas.translate(max_width - d, max_width);
                            canvas.rotate(deg);
                            canvas.drawBitmap(art.get(i), null, new RectF(-w / 2, -w / 2, w / 2, w / 2), null);
                            paint.setAntiAlias(true);
                            canvas.drawLine(-w / 2, -w / 2, -w / 2, w / 2, paint);
                            break;
                        case 4:
                            canvas.translate(0, max_width - d);
                            canvas.rotate(deg);
                            canvas.drawBitmap(art.get(i), null, new RectF(-w / 2, -w / 2, w / 2, w / 2), null);
                            paint.setAntiAlias(true);
                            canvas.drawLine(-w / 2, -w / 2, w / 2, -w / 2, paint);
                            break;
                    }
                    canvas.restore();
                }
        }
        Log.d(TAG, "getBitmapCollection: smalltime = " + (System.currentTimeMillis() - start));
        if (round) return BitmapEditor.getRoundedCornerBitmap(bitmap, bitmap.getWidth() / 40);
        else return bitmap;
    }

    private static Bitmap getBitmapWithAlbumId(@NonNull Context context, Long id) {
        try {
            return Glide.with(context)
                    .load(MusicUtil.INSTANCE.getMediaStoreAlbumCoverUri(id))
                    .asBitmap()
                    .into(200, 200)
                    .get();
        } catch (Exception e) {
            return null;
        }
    }

    public static Bitmap getDefaultBitmap(@NonNull Context context, boolean round) {
        if (round)
            return BitmapFactory.decodeResource(context.getResources(), R.drawable.default_album_art);
        return BitmapFactory.decodeResource(context.getResources(), R.drawable.default_album_art);
    }
}
