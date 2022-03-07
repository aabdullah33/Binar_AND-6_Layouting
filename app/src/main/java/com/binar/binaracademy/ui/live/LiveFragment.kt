package com.binar.binaracademy.ui.live

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.binar.binaracademy.databinding.LiveFragmentBinding
import com.binar.binaracademy.ui.home.HomeViewModel

class LiveFragment : Fragment() {

    private var _binding: LiveFragmentBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val liveViewModel =
            ViewModelProvider(this).get(LiveViewModel::class.java)

        _binding = LiveFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textLive
        liveViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}