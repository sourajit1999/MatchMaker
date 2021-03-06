package com.match.maker.featureModules.landing.db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.match.maker.db.tables.MatchingUsersTable;

import java.util.List;

/**
 * Created by ravindra on 17,January,2019
 */
@Dao
public interface MatchingUsersDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(MatchingUsersTable... matchingUsersTables);

    @Query("SELECT * FROM matching_user_table")
    List<MatchingUsersTable> getMatchingUsersData();


    @Query("SELECT COUNT(results) FROM matching_user_table")
    Integer getMatchingUsersDataCount();

}
