package com.example.pagging

import androidx.recyclerview.widget.RecyclerView

/**
 * creation date: 2020/3/25 下午7:54
 * description ：
 */
class MyAdapterDataObserver(
    private val observer: RecyclerView.AdapterDataObserver
    , private val headCount: Int, private val footCount: Int
) : RecyclerView.AdapterDataObserver() {
    override fun onChanged() {
        observer.onChanged()
    }

    override fun onItemRangeChanged(positionStart: Int, itemCount: Int) {
        observer.onItemRangeChanged(positionStart + headCount + footCount, itemCount)
    }

    override fun onItemRangeChanged(positionStart: Int, itemCount: Int, payload: Any?) {
        super.onItemRangeChanged(positionStart + headCount + footCount, itemCount, payload)
    }

    override fun onItemRangeInserted(positionStart: Int, itemCount: Int) {
        observer.onItemRangeInserted(positionStart + headCount + footCount, itemCount)
    }

    override fun onItemRangeMoved(fromPosition: Int, toPosition: Int, itemCount: Int) {
        super.onItemRangeMoved(
            fromPosition + headCount + footCount,
            toPosition + headCount + footCount,
            itemCount
        )
    }

    override fun onItemRangeRemoved(positionStart: Int, itemCount: Int) {
        observer.onItemRangeRemoved(positionStart + headCount + footCount, itemCount)
    }
}