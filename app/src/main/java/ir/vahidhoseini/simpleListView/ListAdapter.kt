package ir.vahidhoseini.simpleListView


import android.content.Context
import android.content.Context.LAYOUT_INFLATER_SERVICE
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.core.content.getSystemService
import androidx.recyclerview.widget.RecyclerView
import java.security.Provider

import java.util.ArrayList

/**
 * Created by Vahid on 4/26/2016.
 */
class ListAdapter(items: ArrayList<StructList>, context: Context) :
    RecyclerView.Adapter<ListAdapter.ItemViewHolder>() {

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return items.size;
    }

    private var items = ArrayList<StructList>()
    private var ctx = context

//    val itemCount: Int
//        get() = items.size

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //            btnAdapter = (Button) itemView.findViewById(R.id.btnAdapter);
        //            txtAdapter = (TextView) itemView.findViewById(R.id.txtAdapter);
        //            chkAdapter = (CheckBox) itemView.findViewById(R.id.chkAdapter);
        protected var btnAdapter: Button? = null
        protected var txtAdapter: TextView? = null
        protected var chkAdapter: CheckBox? = null
    }

    init {
        this.items = items
        ctx = context
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ItemViewHolder {
        val lytInflater:LayoutInflater = LayoutInflater.from(ctx)
        lytInflater.inflate(R.layout.activity_main , viewGroup)
        var view = lytInflater.inflate(R.layout.lyt_adapter_list, viewGroup, false) as View
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(personViewHolder: ItemViewHolder, i: Int) {
        //        StructList name = items.get(i);
        //        personViewHolder.txtAdapter.setText(name.firstName);
        //        personViewHolder.chkAdapter.setText(name.lastName);
        //        personViewHolder.btnAdapter.setText(""+name.age);
    }


    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
    }
}