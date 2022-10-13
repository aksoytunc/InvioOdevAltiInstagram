package com.tuncaksoy.invioodevaltiinstagram

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.tuncaksoy.invioodevaltiinstagram.databinding.FragmentHomePageBinding

class HomePageFragment : Fragment() {
    private lateinit var dataBindig: FragmentHomePageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        dataBindig = DataBindingUtil.inflate(inflater,R.layout.fragment_home_page,container,false)
        return dataBindig.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var historyPostList = ArrayList<UsersHistory>()

        var myH = UsersHistory("Hikayen","history_my")
        var h1 = UsersHistory("anilcanyazar","history_1")
        var h2 = UsersHistory("petshop","history_2")
        var h3 = UsersHistory("benimolsun","history_3")
        var h4 = UsersHistory("patiler","history_4")
        var h5 = UsersHistory("yesiltas","history_5")
        var h6 = UsersHistory("elvantolon","history_6")
        var h7 = UsersHistory("minibus","history_7")

        historyPostList.add(myH)
        historyPostList.add(h1)
        historyPostList.add(h2)
        historyPostList.add(h3)
        historyPostList.add(h4)
        historyPostList.add(h5)
        historyPostList.add(h6)
        historyPostList.add(h7)

        dataBindig.recyclerView.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
        val adapter1 = HistoryAdapter(requireContext(),historyPostList)
        dataBindig.recyclerView.adapter = adapter1

        var postList = ArrayList<UsersPost>()

        var anil1 = UsersPost("anilcanyazar","history_1","anilcanyazar_post_1",989,19,"Harika resim :)")
        var anil2 = UsersPost("anilcanyazar","history_1","anilcanyazar_post_2",870,34,"Yeni evim...")
        var benim = UsersPost("benimolsun","history_3","benimolsun_post",210,17,"Hahahah çok iyiydi...")
        var elvan = UsersPost("elvantolon","history_6","elvantolon_post",667,67,"Hoşça kalın!")
        var patiler = UsersPost("patiler","history_4","patiler_post",94,13,"Yürek yediğim bir gündü sadasdasd")
        var petshop = UsersPost("petshop","history_2","petshop_post",100,19,"Canım benim <3")

        postList.add(benim)
        postList.add(anil1)
        postList.add(anil2)
        postList.add(elvan)
        postList.add(patiler)
        postList.add(petshop)

        dataBindig.recyclerPost.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        val adapter2 = PostAdapter(requireContext(),postList)
        dataBindig.recyclerPost.adapter = adapter2

    }
}