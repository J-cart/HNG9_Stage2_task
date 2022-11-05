package com.tutorial.hng9_stage2_task

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.tutorial.hng9_stage2_task.databinding.FragmentAboutBinding

class AboutFragment : Fragment() {
    private var _binding: FragmentAboutBinding? = null
    private val binding get() = _binding!!
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

        binding.gitIcon.setOnClickListener {
            makeSnackAction(
                "Open Link",
                "This will redirect you to a github link via your browser, would you like to proceed?"
            )
            {
                openBrowserIntent(getString(R.string.git_link))
            }
        }
        binding.LinkedlnIcon.setOnClickListener {
            makeSnackAction(
                "Open Link",
                "This will redirect you to a linkedLn link via your browser, would you like to proceed?"
            )
            {
                openBrowserIntent(getString(R.string.linkedln_link))
            }
        }
        binding.socialIconTwitter.setOnClickListener {
            makeSnackAction(
                "Open Link ",
                "This will redirect you to a twitter link via your browser, would you like to proceed?"
            )
            {
                openBrowserIntent(getString(R.string.twitter_link))

            }
        }

    }

  private  fun openBrowserIntent(uri: String) {
        Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse(uri)
            Intent.createChooser(this, "Select browser")
            startActivity(this)
        }
    }


}

fun Fragment.makeSnackAction(title: String, text: String, action: (() -> Unit)? = null) {
    MaterialAlertDialogBuilder(requireContext()).apply {
        setMessage(text)
        setTitle(title)
        setPositiveButton("OK") { dialogInterface, int ->
            dialogInterface.dismiss()
            action?.invoke()
        }

        setNegativeButton("CANCEL") { dialogInterface, _ ->
            dialogInterface.dismiss()
        }

        create()
        show()
    }


}