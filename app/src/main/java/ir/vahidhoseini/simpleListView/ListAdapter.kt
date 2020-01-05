package ir.vahidhoseini.simpleListView


import android.content.Context
import android.content.Context.LAYOUT_INFLATER_SERVICE
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.core.content.getSystemService
import androidx.recyclerview.widget.RecyclerView
import java.security.Provider
import java.util.*

/**
 * Created by Vahid on 4/26/2016.
 */
class ListAdapter(context: Context) :
    RecyclerView.Adapter<ListAdapter.ItemViewHolder>() {
    private var recyclerview: RecyclerView? = null
    private var layoutManager: RecyclerView.LayoutManager? = null

    fun setRecylcerView(value: RecyclerView): ListAdapter {
        recyclerview = value
        return this
    }

    fun setLayoutManager(value: RecyclerView.LayoutManager): ListAdapter {
        layoutManager = value
        return this
    }

    fun setListItems(value: ArrayList<StructList>): ListAdapter {
        items = value
        return this
    }


    fun initialAdapter() {
        recyclerview?.layoutManager = layoutManager
        recyclerview?.adapter = this

    }

    override fun getItemCount(): Int {
        return items.size;
    }

    private var items = ArrayList<StructList>()
    private var ctx = context


    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtAdapter: TextView = itemView.findViewById(R.id.item_title)
    }

    init {
        this.items = items
        ctx = context
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ItemViewHolder {
        val lytInflater: LayoutInflater = LayoutInflater.from(ctx)
        var view = lytInflater.inflate(R.layout.lyt_adapter_list, viewGroup, false) as View
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(personViewHolder: ItemViewHolder, i: Int) {
        val item: StructList = items.get(i)
        personViewHolder.txtAdapter.setText(item.title);
        personViewHolder.txtAdapter.setBackgroundColor(
            Color.argb(
                255,
                Random().nextInt(256),
                Random().nextInt(256),
                Random().nextInt(256)
            )
        )
    }


    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
    }
}