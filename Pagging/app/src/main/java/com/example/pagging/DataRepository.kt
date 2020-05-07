package com.example.pagging

class DataRepository {

    private val dataList: MutableList<Bean> = mutableListOf()

    init {
        initDataRepository()
    }

    private fun initDataRepository() {
        for (i in 0..999) {
            val bean = Bean("ID号是:$i", "名称:$i", "年龄:$i")
            dataList.add(bean)
        }
    }

    fun initData(size: Int): MutableList<Bean> {
        return dataList.subList(0, size)
    }

    fun loadPageData(page: Int, size: Int): MutableList<Bean>? {
        val totalPage: Int = if (dataList.size % size == 0) {
            dataList.size / size
        } else {
            dataList.size / size + 1
        }
        if (page > totalPage || page < 1) {
            return null
        }
        return if (page == totalPage) {
            dataList.subList((page - 1) * size, dataList.size)
        } else dataList.subList((page - 1) * size, page * size)
    }
}