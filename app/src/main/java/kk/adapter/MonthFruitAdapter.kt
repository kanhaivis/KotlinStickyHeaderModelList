package kk.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import kk.adapter.viewholder.ViewHolderHeader
import kk.adapter.viewholder.ViewHolderItems
import kk.model.Items
import kk.mystickyheaderlist.R
import kk.stickyheader.StickyHeaderItemShow
import kk.util.ConstantItem.TYPE_HEADER
import kk.util.ConstantItem.TYPE_ITEM


/**
 * Created by Krishan on 2021-05-03.
 */
class MonthFruitAdapter(val items: List<Items>): RecyclerView.Adapter<RecyclerView.ViewHolder>(), StickyHeaderItemShow.StickyHeaderInterface  {

    override fun isHeader(itemPosition: Int): Boolean {
        return items[itemPosition].header
    }

    override fun bindHeaderData(header: View, headerPosition: Int) {
        ((header as ConstraintLayout).getChildAt(0) as TextView).text =
            items[headerPosition].name
    }

    override fun getHeaderLayout(headerPosition: Int): Int {
        return R.layout.row_header
    }

    override fun getHeaderPositionForItem(itemPosition: Int): Int {
        var headerPosition = 0
        var position = itemPosition
        do {
            if (this.isHeader(position)) {
                headerPosition = position
                break
            }
            position -= 1
        } while (position >= 0)
        return headerPosition
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if(viewType == TYPE_HEADER) {
            ViewHolderHeader(
                LayoutInflater.from(parent.context)
                .inflate(R.layout.row_header, parent, false))
        } else {
            ViewHolderItems(
                LayoutInflater.from(parent.context)
                .inflate(R.layout.row_item, parent, false))
        }
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(holder is ViewHolderItems) {
            val rowItems = items[position]
            holder.nameView.text = rowItems.name
            holder.detailsView.text = rowItems.details
            holder.priceView.text = "₹"+rowItems.price.toString()
        } else if(holder is ViewHolderHeader) {
            holder.headerView.text = items[position].name
        }
    }


    override fun getItemViewType(position: Int): Int {
        return if(items[position].header) {
            TYPE_HEADER
        } else {
            TYPE_ITEM
        }
    }


}