package id.bobipermanasandii.myrecyclerview

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.bobipermanasandii.myrecyclerview.databinding.ActivityDetailBinding
import id.bobipermanasandii.myrecyclerview.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val KEY_HERO = "key_hero"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataHero = if (Build.VERSION.SDK_INT >= 33) {
            intent.getParcelableExtra(KEY_HERO, Hero::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra(KEY_HERO)
        }

        if (dataHero != null) {

            binding.tvDetail.text = dataHero.name
        }

    }
}