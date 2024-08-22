package com.example.triviaapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.triviaapp.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        // TODO: Inflate the layout for this fragment
        val binding: FragmentTitleBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_title, container, false)

        binding.playButton.setOnClickListener {

            // TODO: view: View ->
            // TODO: Navigation.findNavController(view).navigate(R.id.action_titleFragment_to_gameFragment)
            // TODO: view.findNavController().navigate(R.id.action_titleFragment_to_gameFragment)
//            Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment)

           view: View ->
           Navigation.findNavController(view).navigate(R.id.action_titleFragment_to_gameFragment)
        }

        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)

        inflater?.inflate(R.menu.overflow_menu, menu)
    }

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onOptionsItemSelected(menuItem: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(menuItem!!, view!!.findNavController()) || super.onOptionsItemSelected(menuItem)
    }
}