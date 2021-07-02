package com.example.sims.student

import android.content.Context

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.sims.R

class ScoreAdapter constructor(context: Context, dataList: List<String>) : BaseAdapter() {
    var context: Context //ListView显示的数据
    var dataList: List<String>

    init {
        this.context = context;
        this.dataList = dataList;

    }


    override fun getCount(): Int {
        return dataList.size ?: 0
    }

    override fun getItem(position: Int): Any {
        return dataList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var convertView = convertView
        val viewHolder: ViewHolder
        //判断是否有缓存
        if (convertView == null) {
            convertView =
                LayoutInflater.from(context).inflate(R.layout.activity_score_adapter, null)
            viewHolder = ViewHolder(convertView)
            convertView.tag = viewHolder
        } else {
            //得到缓存的布局
            viewHolder = convertView.tag as ViewHolder
        }

        //设置图片
        //设置内容
        viewHolder.contentTv.text = dataList[position]
        return convertView!!
    }

    /**
     * ViewHolder类
     */
    private inner class ViewHolder internal constructor(view: View) {

        var contentTv //内容
                : TextView

        /**
         * 构造器
         *
         * @param view 视图组件（ListView的子项视图）
         */
        init {
            contentTv = view.findViewById<View>(R.id.content_tv) as TextView
        }
    }
}