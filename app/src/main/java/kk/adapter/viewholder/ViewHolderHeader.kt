package kk.adapter.viewholder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kk.mystickyheaderlist.R

class ViewHolderHeader(view: View) : RecyclerView.ViewHolder(view) {
    val headerView = view.findViewById<TextView>(R.id.headerView)
}