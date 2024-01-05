package io.github.manamiproject.modb.mal

import io.github.manamiproject.modb.core.coroutines.CoroutineManager.runCoroutine
import io.github.manamiproject.modb.core.extensions.writeToFile
import io.github.manamiproject.modb.core.random
import io.github.manamiproject.modb.test.testResource
import kotlinx.coroutines.delay
import java.nio.file.Path
import java.nio.file.Paths

internal fun main() {
    val downloader = MalDownloader(MalConfig)
    
    runCoroutine {
        downloader.download("10098").writeToFile(resourceFile("file_converter_tests/anime_season/season/jan.html"))
        delay(random(3000, 4800))
        downloader.download("10077").writeToFile(resourceFile("file_converter_tests/anime_season/season/feb.html"))
        delay(random(3000, 4800))
        downloader.download("10016").writeToFile(resourceFile("file_converter_tests/anime_season/season/mar.html"))
        delay(random(3000, 4800))
        downloader.download("1006").writeToFile(resourceFile("file_converter_tests/anime_season/season/apr.html"))
        delay(random(3000, 4800))
        downloader.download("1015").writeToFile(resourceFile("file_converter_tests/anime_season/season/may.html"))
        delay(random(3000, 4800))
        downloader.download("10112").writeToFile(resourceFile("file_converter_tests/anime_season/season/jun.html"))
        delay(random(3000, 4800))
        downloader.download("10029").writeToFile(resourceFile("file_converter_tests/anime_season/season/jul.html"))
        delay(random(3000, 4800))
        downloader.download("1038").writeToFile(resourceFile("file_converter_tests/anime_season/season/aug.html"))
        delay(random(3000, 4800))
        downloader.download("10045").writeToFile(resourceFile("file_converter_tests/anime_season/season/sep.html"))
        delay(random(3000, 4800))
        downloader.download("1024").writeToFile(resourceFile("file_converter_tests/anime_season/season/nov.html"))
        delay(random(3000, 4800))
        downloader.download("1002").writeToFile(resourceFile("file_converter_tests/anime_season/season/oct.html"))
        delay(random(3000, 4800))
        downloader.download("10000").writeToFile(resourceFile("file_converter_tests/anime_season/season/dec.html"))
        delay(random(3000, 4800))

        downloader.download("38483").writeToFile(resourceFile("file_converter_tests/anime_season/season/fall.html"))
        delay(random(3000, 4800))
        downloader.download("38000").writeToFile(resourceFile("file_converter_tests/anime_season/season/spring.html"))
        delay(random(3000, 4800))
        downloader.download("37347").writeToFile(resourceFile("file_converter_tests/anime_season/season/summer.html"))
        delay(random(3000, 4800))
        downloader.download("26145").writeToFile(resourceFile("file_converter_tests/anime_season/season/undefined.html"))
        delay(random(3000, 4800))
        downloader.download("37779").writeToFile(resourceFile("file_converter_tests/anime_season/season/winter.html"))
        delay(random(3000, 4800))

        downloader.download("34958").writeToFile(resourceFile("file_converter_tests/anime_season/year_of_premiere/aired_node_-_year_only.html"))
        delay(random(3000, 4800))
        downloader.download("45874").writeToFile(resourceFile("file_converter_tests/anime_season/year_of_premiere/aired_node_-_year_to_unknown.html"))
        delay(random(3000, 4800))
        downloader.download("43314").writeToFile(resourceFile("file_converter_tests/anime_season/year_of_premiere/aired_node_-_year_to_unavailable.html"))
        delay(random(3000, 4800))
        downloader.download("44015").writeToFile(resourceFile("file_converter_tests/anime_season/year_of_premiere/aired_node_-_exact_day_to_unknown.html"))
        delay(random(3000, 4800))
        downloader.download("8663").writeToFile(resourceFile("file_converter_tests/anime_season/year_of_premiere/aired_node_-_year_to_year.html"))
        delay(random(3000, 4800))
        downloader.download("36736").writeToFile(resourceFile("file_converter_tests/anime_season/year_of_premiere/aired_node_-_month_of_year_to_year.html"))
        delay(random(3000, 4800))
        downloader.download("43944").writeToFile(resourceFile("file_converter_tests/anime_season/year_of_premiere/aired_node_-_month_of_year_to_unknown.html"))
        delay(random(3000, 4800))
        downloader.download("33474").writeToFile(resourceFile("file_converter_tests/anime_season/year_of_premiere/aired_node_-_exact_day.html"))
        delay(random(3000, 4800))
        downloader.download("41515").writeToFile(resourceFile("file_converter_tests/anime_season/year_of_premiere/aired_node_-_exact_day_to_exact_day.html"))
        delay(random(3000, 4800))
        downloader.download("18007").writeToFile(resourceFile("file_converter_tests/anime_season/year_of_premiere/aired_node_-_year_to_exact_day.html"))
        delay(random(3000, 4800))
        downloader.download("11307").writeToFile(resourceFile("file_converter_tests/anime_season/year_of_premiere/aired_node_-_exact_day_to_year.html"))
        delay(random(3000, 4800))
        downloader.download("12659").writeToFile(resourceFile("file_converter_tests/anime_season/year_of_premiere/premiered.html"))
        delay(random(3000, 4800))

        downloader.download("10056").writeToFile(resourceFile("file_converter_tests/duration/1_hour.html"))
        delay(random(3000, 4800))
        downloader.download("10821").writeToFile(resourceFile("file_converter_tests/duration/1_hour_11_min.html"))
        delay(random(3000, 4800))
        downloader.download("10937").writeToFile(resourceFile("file_converter_tests/duration/1_hour_11_min_per_episode.html"))
        delay(random(3000, 4800))
        downloader.download("10389").writeToFile(resourceFile("file_converter_tests/duration/2_hours.html"))
        delay(random(3000, 4800))
        downloader.download("1091").writeToFile(resourceFile("file_converter_tests/duration/2_hours_15_minutes.html"))
        delay(random(3000, 4800))
        downloader.download("10055").writeToFile(resourceFile("file_converter_tests/duration/10_min.html"))
        delay(random(3000, 4800))
        downloader.download("10039").writeToFile(resourceFile("file_converter_tests/duration/10_min_per_episode.html"))
        delay(random(3000, 4800))
        downloader.download("31686").writeToFile(resourceFile("file_converter_tests/duration/10_sec.html"))
        delay(random(3000, 4800))
        downloader.download("32737").writeToFile(resourceFile("file_converter_tests/duration/10_sec_per_episode.html"))
        delay(random(3000, 4800))
        downloader.download("10506").writeToFile(resourceFile("file_converter_tests/duration/unknown.html"))
        delay(random(3000, 4800))

        downloader.download("31758").writeToFile(resourceFile("file_converter_tests/episodes/1.html"))
        delay(random(3000, 4800))
        downloader.download("851").writeToFile(resourceFile("file_converter_tests/episodes/10.html"))
        delay(random(3000, 4800))
        downloader.download("2165").writeToFile(resourceFile("file_converter_tests/episodes/100.html"))
        delay(random(3000, 4800))
        downloader.download("12393").writeToFile(resourceFile("file_converter_tests/episodes/1818.html"))
        delay(random(3000, 4800))
        downloader.download("30088").writeToFile(resourceFile("file_converter_tests/episodes/unknown.html"))
        delay(random(3000, 4800))

        downloader.download("55715").writeToFile(resourceFile("file_converter_tests/picture_and_thumbnail/neither_picture_nor_thumbnail.html"))
        delay(random(3000, 4800))
        downloader.download("10163").writeToFile(resourceFile("file_converter_tests/picture_and_thumbnail/picture_and_thumbnail_available.html"))
        delay(random(3000, 4800))

        downloader.download("1575").writeToFile(resourceFile("file_converter_tests/related_anime/has_adaption_and_multiple_relations.html"))
        delay(random(3000, 4800))
        downloader.download("25397").writeToFile(resourceFile("file_converter_tests/related_anime/has_adaption_but_no_relation.html"))
        delay(random(3000, 4800))
        downloader.download("8857").writeToFile(resourceFile("file_converter_tests/related_anime/has_one_adaption_and_one_relation.html"))
        delay(random(3000, 4800))
        downloader.download("18507").writeToFile(resourceFile("file_converter_tests/related_anime/no_adaption_multiple_relations.html"))
        delay(random(3000, 4800))
        downloader.download("10003").writeToFile(resourceFile("file_converter_tests/related_anime/no_adaption_no_relations.html"))
        delay(random(3000, 4800))

        downloader.download("16498").writeToFile(resourceFile("file_converter_tests/sources/16498.html"))
        delay(random(3000, 4800))

        downloader.download("40393").writeToFile(resourceFile("file_converter_tests/status/ongoing.html"))
        delay(random(3000, 4800))
        downloader.download("21329").writeToFile(resourceFile("file_converter_tests/status/finished.html"))
        delay(random(3000, 4800))
        downloader.download("54915").writeToFile(resourceFile("file_converter_tests/status/upcoming.html"))
        delay(random(3000, 4800))

        downloader.download("100").writeToFile(resourceFile("file_converter_tests/synonyms/multiple_languages_one_each.html"))
        delay(random(3000, 4800))
        downloader.download("22777").writeToFile(resourceFile("file_converter_tests/synonyms/multiple_synonyms_for_one_language.html"))
        delay(random(3000, 4800))
        downloader.download("15609").writeToFile(resourceFile("file_converter_tests/synonyms/multiple_synonyms_with_comma_in_one_language.html"))
        delay(random(3000, 4800))
        downloader.download("30559").writeToFile(resourceFile("file_converter_tests/synonyms/no_synonyms.html"))
        delay(random(3000, 4800))
        downloader.download("10000").writeToFile(resourceFile("file_converter_tests/synonyms/one_synonym.html"))
        delay(random(3000, 4800))
        downloader.download("12665").writeToFile(resourceFile("file_converter_tests/synonyms/one_synonym_with_multiple_commas.html"))
        delay(random(3000, 4800))
        downloader.download("35315").writeToFile(resourceFile("file_converter_tests/synonyms/semicolon_in_synonym_wihtout_whitespaces.html"))
        delay(random(3000, 4800))
        downloader.download("38085").writeToFile(resourceFile("file_converter_tests/synonyms/semicolon_in_synonym_with_whitespace.html"))
        delay(random(3000, 4800))
        downloader.download("993").writeToFile(resourceFile("file_converter_tests/synonyms/semicolon_in_title_but_not_in_synonyms.html"))
        delay(random(3000, 4800))
        downloader.download("10863").writeToFile(resourceFile("file_converter_tests/synonyms/synonym_contains_comma_but_title_does_not.html"))
        delay(random(3000, 4800))
        downloader.download("12665").writeToFile(resourceFile("file_converter_tests/synonyms/synonym_contains_comma_followed_by_whitespace.html"))
        delay(random(3000, 4800))
        downloader.download("15609").writeToFile(resourceFile("file_converter_tests/synonyms/title_contains_comma_and_multiple_synonyms_for_one_language.html"))
        delay(random(3000, 4800))

        downloader.download("5114").writeToFile(resourceFile("file_converter_tests/tags/multiple_tags.html"))
        delay(random(3000, 4800))
        downloader.download("28487").writeToFile(resourceFile("file_converter_tests/tags/no_tags.html"))
        delay(random(3000, 4800))
        downloader.download("10077").writeToFile(resourceFile("file_converter_tests/tags/one_tag.html"))
        delay(random(3000, 4800))

        downloader.download("45").writeToFile(resourceFile("file_converter_tests/title/english_and_original_title.html"))
        delay(random(3000, 4800))
        downloader.download("31055").writeToFile(resourceFile("file_converter_tests/title/special_chars.html"))
        delay(random(3000, 4800))

        downloader.download("28851").writeToFile(resourceFile("file_converter_tests/type/movie.html"))
        delay(random(3000, 4800))
        downloader.download("30097").writeToFile(resourceFile("file_converter_tests/type/movie_case_which_resulted_in_containsOwn.html"))
        delay(random(3000, 4800))
        downloader.download("12659").writeToFile(resourceFile("file_converter_tests/type/music.html"))
        delay(random(3000, 4800))
        downloader.download("38935").writeToFile(resourceFile("file_converter_tests/type/ona.html"))
        delay(random(3000, 4800))
        downloader.download("44").writeToFile(resourceFile("file_converter_tests/type/ova.html"))
        delay(random(3000, 4800))
        downloader.download("21329").writeToFile(resourceFile("file_converter_tests/type/special.html"))
        delay(random(3000, 4800))
        downloader.download("1535").writeToFile(resourceFile("file_converter_tests/type/tv.html"))
        delay(random(3000, 4800))
        downloader.download("55579").writeToFile(resourceFile("file_converter_tests/type/unknown.html"))
        delay(random(3000, 4800))
        downloader.download("52811").writeToFile(resourceFile("file_converter_tests/type/pv.html"))
        delay(random(3000, 4800))
        downloader.download("52834").writeToFile(resourceFile("file_converter_tests/type/pv.html"))
        delay(random(3000, 4800))
        downloader.download("2312").writeToFile(resourceFile("file_converter_tests/type/tv_special.html"))
        delay(random(3000, 4800))
        downloader.download("57733").writeToFile(resourceFile("file_converter_tests/type/music_without_link.html"))

        println("Done")
    }
}

private fun resourceFile(file: String): Path {
    return Paths.get(
        testResource(file).toAbsolutePath()
            .toString()
            .replace("/build/resources/test/", "/src/test/resources/")
    )
}