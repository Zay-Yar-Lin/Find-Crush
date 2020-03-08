package com.example.findcrush

import android.app.Person
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.findcrush.adapter.FindCrushAdapter
import com.example.findcrush.model.FindCrush
import kotlinx.android.synthetic.main.fragment_fragment.view.*

/**
 * A simple [Fragment] subclass.
 */
class Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var root = inflater.inflate(R.layout.fragment_fragment, container, false)
        var findCrushArray = ArrayList<FindCrush>()
        findCrushArray.add(FindCrush(R.drawable.dilireba,"Dilireba","Posted","2h",R.drawable.loveofdreamtwo,"2K","98","69"))
        findCrushArray.add(FindCrush(R.drawable.vengo_gao,"Vengo Gao","Posted","2h",R.drawable.loveofdreamthree,"2K","100","80"))

        var findCrushAdapter = FindCrushAdapter(findCrushArray)
        root.recyclerView.layoutManager= LinearLayoutManager(context)
        root.recyclerView.adapter = findCrushAdapter
        return root
    }

}
