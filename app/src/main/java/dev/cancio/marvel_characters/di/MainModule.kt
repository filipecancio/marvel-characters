package dev.cancio.marvel_characters.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.cancio.marvel_characters.BuildConfig
import dev.cancio.marvel_characters.repository.MarvelRepository
import dev.cancio.marvel_characters.service.MarvelApi
import dev.cancio.marvel_characters.service.MarvelService
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.math.BigInteger
import java.security.MessageDigest
import java.sql.Timestamp
import javax.inject.Named


@Module
@InstallIn(SingletonComponent::class)
class MainModule {

    @Provides
    @Named("LoggingInterceptor")
    fun provideLoggingInterceptor(): HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    @Provides
    @Named("QueryInterceptor")
    fun provideQueryInterceptor(): Interceptor = Interceptor { chain ->

        val original = chain.request()
        val originalHttpUrl = original.url
        val url = originalHttpUrl.newBuilder()
            .addQueryParameter("apikey", BuildConfig.MARVEL_API_KEY)
            .build()
        val requestBuilder = original.newBuilder().url(url)
        val request = requestBuilder.build()
        chain.proceed(request)
    }

    @Provides
    fun provideOkHttpClient(
        @Named("LoggingInterceptor") loggingInterceptor: HttpLoggingInterceptor,
        @Named("QueryInterceptor") queryInterceptor: Interceptor
        ): OkHttpClient =
        OkHttpClient.Builder()
        .addInterceptor(loggingInterceptor)
        .addInterceptor(queryInterceptor)
        .build()

    @Provides
    @Named("MarvelClient")
    fun provideMarvelClient(okHttpClient: OkHttpClient): Retrofit = Retrofit.Builder()
        .baseUrl(BuildConfig.MARVEL_BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Provides
    fun provideMarvelService(
        @Named("MarvelClient") retrofit: Retrofit
    ): MarvelService = retrofit.create(MarvelService::class.java)

    @Provides
    fun providesMarvelApi(marvelService: MarvelService) = MarvelApi(marvelService)

    @Provides
    fun providesRepository(marvelApi: MarvelApi) = MarvelRepository(marvelApi)
}