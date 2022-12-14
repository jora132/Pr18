package com.example.ivanov_pr1819_mobil.ui.ram

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RamViewModel: ViewModel()  {
    private val _text = MutableLiveData<String>().apply {
        value = "\nНа юниорском уровне играл за «Де-Мойн Баккэнирс» команду из USHL; по итогам сезона он стал лучшим бомбардиром среди защитников по голам, занял второе место по передачам и очкам и вошёл в команду звёзд USHL и команду новичков. На драфте НХЛ в 2017 году был выбран во 2-м раунде под общим 49-м номером клубом «Сан-Хосе Шаркс». С 2017 по 2019 играл за «ЮМасс Минитмен» - команду университета Массачусетса в Амхерсте; по итогам сезона 2017/18 он был рекордсменом по набранным очкам.В апреле 2019 года подписал с клубом трёхлетний контракт новичка. Дебютировал в НХЛ 2 октября 2019 года в матче против «Вегаса»;матч закончился победой «рыцарей» со счётом 4:1. "
    }
    val text: LiveData<String> = _text
}