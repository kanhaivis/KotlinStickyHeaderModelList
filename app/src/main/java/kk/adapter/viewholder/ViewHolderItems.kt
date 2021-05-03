package kk.adapter.viewholder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kk.mystickyheaderlist.R

class ViewHolderItems(view: View) : RecyclerView.ViewHolder(view) {
    val nameView = view.findViewById<TextView>(R.id.title_txt)
    val detailsView = view.findViewById<TextView>(R.id.details_txt)
    val priceView = view.findViewById<TextView>(R.id.price_txt)
}