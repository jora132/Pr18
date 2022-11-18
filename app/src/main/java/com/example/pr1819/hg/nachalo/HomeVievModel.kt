package com.example.ivanov_pr1819_mobil.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeVievModel: ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "До 1967 года Национальная хоккейная лига состояла из шести команд, так называемой «Оригинальной шестёрки», которые были расположены на севере, востоке и в центре Северной Америки. В 1967 году было принято решение о расширении лиги, открывать новые области. Калифорния не считалась хорошим местом для культивирования хоккея, но в Сан-Франциско всё же расположился новый клуб. Команда была первоначально названа «Калифорния Силз», позднее — «Окленд Силз», а спустя два года — «Калифорния Голден Силз». После девяти лет проведённых на «Окленд-Колизеум-арена», команда была продана в 1976 году бизнесменам Джорджу и Гордону Гандам, команда переехала в Кливленд, штат Огайо, и отныне называлась «Кливленд Баронс». После двух лет без каких-либо значительных успехов, братья Ганды решили купить ещё одну команду НХЛ. Они остановились на клубе «Миннесота Норт Старз», испытывающем тогда финансовые трудности. После покупки второго клуба, братья решили объединить две команды, владельцами которых они являлись, под названием «Миннесота Норт Старз»."
    }
    val text: LiveData<String> = _text

    /*private  val _image = MutableLiveData<Image>().apply {
        value = R.id.

    }*/

    /*private var _wallpaper = MutableLiveData<Drawable>()
    val wallpaper: LiveData<Drawable>
        get() = _wallpaper

    fun updateWallPaper() {
        val file = appCtx.getWallpaperFile()
        if(file.exists()) {
            _wallpaper.value = BitmapDrawable(R.drawable.campic, BitmapFactory.decodeFile(file.absolutePath))
        }
    }*/

}