package com.tutorial.hng9_stage2_task

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.tutorial.hng9_stage2_task.databinding.FragmentAboutBinding
import com.tutorial.hng9_stage2_task.databinding.FragmentWelcomeBinding

class AboutFragment : Fragment() {
    private var _binding: FragmentAboutBinding? = null
    private val binding  get() = _binding!!
    private val skillsAdapter by lazy { SkillsAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAboutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.closeIcon.setOnClickListener { findNavController().navigateUp() }
        binding.recyclerView.adapter = skillsAdapter
        skillsAdapter.submitList(Utils.softSkills)


    }


}