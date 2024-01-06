import entrypoint.utils.CommonMedia
import entrypoint.utils.PartInfo
import io.ktor.client.*
import io.ktor.client.engine.java.*
import io.ktor.client.plugins.logging.*
import providers.sources.flixhq.FlixHqSearch
import providers.sources.flixhq.FlixHqSourceCreator

suspend fun main(args: Array<String>) {
    println("Hello World!")
    val embeds = FlixHqSourceCreator()
        .getMovie(CommonMedia.MovieMedia(
            "Dave Chappelle: The Dreamer",
            2023,
            "12323r2r3",
            "1r23r23r"
        ))

    println(embeds)
}