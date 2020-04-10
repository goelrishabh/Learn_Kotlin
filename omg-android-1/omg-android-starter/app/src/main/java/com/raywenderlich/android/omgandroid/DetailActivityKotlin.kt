package com.raywenderlich.android.omgandroid

import android.content.Intent
import android.os.Bundle
import android.support.v4.view.MenuItemCompat
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.ShareActionProvider
import android.view.Menu
import android.widget.ImageView
import com.squareup.picasso.Picasso

/**
 * - Declare Kotlin classes using the keyword class — just like in Java.
 * - By default, if no visibility modifier is present in Kotlin, the item is public.
 * - Classes and methods are final by default. Declare them open if you want to inherit classes and override methods.
 * */
class DetailActivityKotlin : AppCompatActivity() {

    /**
     * You can’t later reassign variables that you declare with (val aka => final).
     * Doing so triggers a compiler error.
     * But you can with var!
     * < var car: String = "BMW" > you don’t need to explicitly declare the type of a variable
     * */

    /**
     * All variables must be initialized at the point of declaration,
     * in a constructor or in a init,
     * except lateinit var.

     * In Kotlin, the possible causes of a NullPointerException are:
    External Java code.
    An explicit call to throw NullPointerException() (NPE).
    Usage of the !! operator.
    lateinit var not initialized before access.

     * To Declare a variable null < var lastName:String? = null >
     * */

    /**
     * < lateinit >
     * Late initialization variables are the developer’s promise that they will initialize the variable before accessing it.
     * This is one of the most common NPE causes.
     * To declare a variable without initializing it in the constructor or an init block, prepend lateinit:
     *
     * This can be useful when you have something you know for sure you’ll initialize in time
     * but you can’t do it in the constructor or in an init block.
     *
     * */

    private val imageUrlBase = "http://covers.openlibrary.org/b/id/"
    private var imageURL = ""
    private var shareActionProvider: ShareActionProvider? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_detail)

        actionBar?.setDisplayHomeAsUpEnabled(true)

        val imageView = findViewById<ImageView>(R.id.img_cover)

        val coverId = this.intent.extras.getString("coverID")

        val len = coverId?.length ?: 0

        if (len > 0) {
            imageURL = imageUrlBase + coverId + "-L.jpg"
            Picasso.with(this).load(imageURL).placeholder(R.drawable.img_books_loading).into(imageView)
        }
    }

    private fun setShareIntent() {

        val shareIntent = Intent(Intent.ACTION_SEND)
        shareIntent.type = "text/plain"
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Book Recommendation!")
        shareIntent.putExtra(Intent.EXTRA_TEXT, imageURL)

        shareActionProvider?.setShareIntent(shareIntent)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        menuInflater.inflate(R.menu.main, menu)

        val shareItem = menu.findItem(R.id.menu_item_share)

        shareActionProvider = MenuItemCompat.getActionProvider(shareItem) as ShareActionProvider

        setShareIntent()

        return true
    }
}