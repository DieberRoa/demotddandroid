package com.pragma.demo3tdd

import com.pragma.demo3tdd.features.stuff.viewmodels.StuffViewModel
import org.hamcrest.core.IsInstanceOf.instanceOf
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class StuffViewModelUnitTest {

    @Test
    fun testExistViewModel() {
        var stuffViewModel: StuffViewModel = StuffViewModel()
        assertThat(stuffViewModel, instanceOf(StuffViewModel::class.java))
    }

    @Test
    fun whenApiGetAEmptyListTheViewModelShowMessageEmptyList() {
        var stuffViewModel = StuffViewModel()
        var response = stuffViewModel.getStuffs()
        assertThat(response, instanceOf(ResponseStuff::class.java))
    }
}