package ir.vahidhoseini.simpleListView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import java.util.ArrayList


class MainActivity : AppCompatActivity() {

    val myList = mutableListOf<StructList>() as ArrayList<StructList>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerview: RecyclerView = findViewById(R.id.test_recyclerview)
        recyclerview.setHasFixedSize(true)

        val manager = LinearLayoutManager(this)
        manager.orientation = LinearLayoutManager.VERTICAL
        recyclerview.layoutManager = manager
        populateData()
        val adapter = ListAdapter(myList, this)
        recyclerview.adapter = adapter
    }

    private fun populateData() {
        myList.clear()
        for (i in 0..29) {
            val item = StructList()
            item.title = "First Name#$i"
            myList.add(item)
        }
    }
}
