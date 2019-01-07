package rizky.rizky.app.booksfairs.adapter;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import rizky.rizky.app.booksfairs.utils.Consts;
import rizky.rizky.app.booksfairs.utils.CursorRecyclerViewAdapter;

public class FavoritesAdapter extends CursorRecyclerViewAdapter<FavoritesAdapter.FavoriteHolder> {

    public FavoritesAdapter(Context context, Cursor cursor){
        super(context, cursor);
    }
    
    @Override
    public void onBindViewHolder(FavoriteHolder viewHolder, Cursor cursor) {
        cursor.moveToPosition(cursor.getPosition());
        viewHolder.setData(cursor);
    }

    @NonNull
    @Override
    public FavoriteHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        return new FavoriteHolder(LayoutInflater.from(parent.getContext()).inflate(parent, R.layout.item_book, false));
    }

    @Override
    public int getItemCount() {
        return super.getItemCount();
    }

    public class FavoriteHolder extends RecyclerView.ViewHolder {

        private CardView cardBook;
        private ImageView imgposter;
        private TextView textBookName, textYear;

        @SuppressLint("CutPasteId")
        FavoriteHolder(View itemView){
            super(itemView);
            cardBook = itemView.findViewById(R.id.card_book);
            imgposter = itemView.findViewById(R.id.img_poster);
            textBookName  = itemView.findViewById(R.id.txt_book_name);
            textYear = itemView.findViewById(R.id.txt_year);
        }

        public void setData(Cursor cursor) {
            Glide.with(imgposter.getContext())
                    .load(Consts.loadBookBanner())
        }
    }
}
