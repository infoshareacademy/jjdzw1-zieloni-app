package com.infoshareacademy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import javax.json.JsonArray;
import java.io.IOException;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
class JSONLoaderTest {

    @Test
    void shouldShowDataType() throws IOException {
        //given
        JSONLoader sut = new JSONLoader();

        //when
        String result = sut.showDataType(sut.MAINLINK + sut.SUBLINK);

        //then
        assertThat(result).isNotNull();
    }

    @Test
    void shouldShowDataArray() throws IOException {
        //given
        JSONLoader sut = new JSONLoader();

        //when
        JsonArray result = sut.showDataArray(sut.MAINLINK + sut.SUBLINK);

        //then
        assertThat(result).isNotNull();
    }


}