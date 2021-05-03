package kk.mystickyheaderlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import kk.adapter.MonthFruitAdapter
import kk.model.Items
import kk.stickyheader.StickyHeaderItemShow

/**
 * Created by Krishan on 2021-05-03.
 */
class MainActivity : AppCompatActivity() {

    private lateinit var mRecyclerview: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRecyclerview = findViewById(R.id.recycler_view)

        var viewAdapter = MonthFruitAdapter(createFruitObjects())
        mRecyclerview.adapter = viewAdapter
        mRecyclerview.addItemDecoration(StickyHeaderItemShow(viewAdapter))
    }

    private fun createFruitObjects(): List<Items> {

        val dummyObjects = ArrayList<Items>()

        dummyObjects += Items("January", "", -1,true)
            dummyObjects += Items("Mango", "The mango fruit is roughly oval in shape, with uneven sides. ", 350, false)
            dummyObjects += Items("Grapefruit", "red, pink, and white and Pomelos – this super nutritious fruit has the most water of any fruit",180, false)
            dummyObjects += Items("Oranges", "Cara Cara, Blood Oranges, Navel Oranges – all prized for Vitamin C and minerals",210, false)

        dummyObjects += Items("February", "", -1,true)
            dummyObjects += Items("Apples", "With so many varieties, apples can easily go sweet or savory and enjoyed",400, false)
            dummyObjects += Items("Greens", "Fresh greens like kale, spinach, lettuce, and many others are the basis for so many tasty recipes like salads ",100, false)
            dummyObjects += Items("Kiwi", "This little brown fruit was named after New Zealand’s national bird, the kiwi. Fuzzy and brown on the outside,",460, false)
            dummyObjects += Items("Avocados", "Avocado lovers can rejoice – this favorite food is available year-round! ", 150,false)
            dummyObjects += Items("Bananas", "This favorite fruit is in season year-round making it easy to eat as a snack ",90, false)
            dummyObjects += Items("Beets", "Beets get a bad rep due to their earthy taste, but roasting them brings out their ", 120,false)

        dummyObjects += Items("March", "",-1, true)
            dummyObjects += Items("Mushrooms", "Did you know Mushrooms are the only natural food source of Vitamin D",500, false)
            dummyObjects += Items("Parsnips","Parsnips are a root veggie, closely related to the carrots. In fact, they look just like pale carrots!", 400, false)
            dummyObjects += Items("Pomegranates","Pomegranates are rich in antioxidants. While they may look difficult to seed, it’s actually fairly", 400, false)

        dummyObjects += Items("April", "",-1, true)
            dummyObjects += Items("Winter Squash", "Winter squash, like acorn squash, butternut squash and spaghetti squash, are ", 120,false)
            dummyObjects += Items("Strawberries", "Florida strawberry season is in full swing! This favorite fruit has endless possibilities beyond just snacking", 20,false)
            dummyObjects += Items("Rutabagas", "You may not be too familiar with this root veggie, but don’t let that scare you! Like most root veggies,", 120,false)
            dummyObjects += Items("Sweet Onions", "Onions are a staple in our kitchen and we use them in multiple meals each week", 120,false)
            dummyObjects += Items("Turnips", "Turnips are a member of the cabbage family and are high in Vitamins B & C. ", 120,false)

        return dummyObjects
    }
}