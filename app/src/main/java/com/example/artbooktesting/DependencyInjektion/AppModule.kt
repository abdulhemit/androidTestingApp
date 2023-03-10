package com.example.artbooktesting.DependencyInjektion

import android.content.Context
import androidx.room.Room
import com.example.artbooktesting.api.RetrofitAPI
import com.example.artbooktesting.roomdb.ArtDatabase
import com.example.artbooktesting.util.util.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class )
object AppModule {


    @Singleton
    @Provides
    fun injectRoomDatabase(
        @ApplicationContext context: Context) = Room.databaseBuilder(
        context,ArtDatabase::class.java,"ArtDB"
        ).build()


    @Singleton
    @Provides
    fun injectDao(database: ArtDatabase) = database.artDao()


    @Singleton
    @Provides
    fun injectRetrofit(): RetrofitAPI{

        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(RetrofitAPI::class.java)

    }

}