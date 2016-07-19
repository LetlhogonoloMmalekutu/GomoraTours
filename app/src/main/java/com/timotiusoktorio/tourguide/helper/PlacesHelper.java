package com.timotiusoktorio.tourguide.helper;

import android.content.Context;

import com.timotiusoktorio.tourguide.R;
import com.timotiusoktorio.tourguide.model.Place;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Timotius on 2016-07-19.
 */

public class PlacesHelper {

    public static List<Place> getPlaces(Context context, String topic) {
        if (topic.equals(context.getString(R.string.topic_see_and_do))) {
            return getSeeAndDoPlaces(context);
        }
        else if (topic.equals(context.getString(R.string.topic_dine))) {
            return getDinePlaces(context);
        }
        else if (topic.equals(context.getString(R.string.topic_shop))) {
            return getShopPlaces(context);
        }
        else if (topic.equals(context.getString(R.string.topic_stay))) {
            return getStayPlaces(context);
        }
        return new ArrayList<>();
    }

    public static List<Place> getSeeAndDoPlaces(Context context) {
        List<Place> places = new ArrayList<>();
        places.add(new Place(context.getString(R.string.place_air_combat_zone), context.getString(R.string.place_air_combat_zone_desc), R.drawable.air_combat_zone));
        places.add(new Place(context.getString(R.string.place_archery_district), context.getString(R.string.place_archery_district_desc), R.drawable.archery_district));
        places.add(new Place(context.getString(R.string.place_fantasy_fair), context.getString(R.string.place_fantasy_fair_desc), R.drawable.fantasy_fair));
        places.add(new Place(context.getString(R.string.place_the_art_gallery), context.getString(R.string.place_the_art_gallery_desc), R.drawable.the_art_gallery));
        places.add(new Place(context.getString(R.string.place_the_glenerin_inn_spa), context.getString(R.string.place_the_glenerin_inn_spa_desc), R.drawable.the_glenerin_inn));
        places.add(new Place(context.getString(R.string.place_salt_cave), context.getString(R.string.place_salt_cave_desc), R.drawable.salt_cave));
        return places;
    }

    public static List<Place> getDinePlaces(Context context) {
        List<Place> places = new ArrayList<>();
        places.add(new Place(context.getString(R.string.place_168_sushi_buffet), context.getString(R.string.place_168_sushi_buffet_desc), R.drawable._168_sushi_buffet));
        places.add(new Place(context.getString(R.string.place_mandarin_restaurant), context.getString(R.string.place_mandarin_restaurant_desc), R.drawable.mandarin_restaurant));
        places.add(new Place(context.getString(R.string.place_bobbys_hideaway), context.getString(R.string.place_bobbys_hideaway_desc), R.drawable.bobbys_hideaway));
        places.add(new Place(context.getString(R.string.place_cock_and_pheasant), context.getString(R.string.place_cock_and_pheasant_desc), R.drawable.cock_pheasant));
        places.add(new Place(context.getString(R.string.place_chop_steakhouse), context.getString(R.string.place_chop_steakhouse_desc), R.drawable.chop_steakhouse));
        places.add(new Place(context.getString(R.string.place_gabriels_restaurant), context.getString(R.string.place_gabriels_restaurant_desc), R.drawable.gabriels_restaurant));
        return places;
    }

    public static List<Place> getShopPlaces(Context context) {
        List<Place> places = new ArrayList<>();
        places.add(new Place(context.getString(R.string.place_dixie_outlet_mall), context.getString(R.string.place_dixie_outlet_mall_desc), R.drawable.dixie_outlet_mall));
        places.add(new Place(context.getString(R.string.place_erin_mills_town_centre), context.getString(R.string.place_erin_mills_town_centre_desc), R.drawable.erin_mills_town_centre));
        places.add(new Place(context.getString(R.string.place_sherway_gardens), context.getString(R.string.place_sherway_gardens_desc), R.drawable.sherway_gardens));
        places.add(new Place(context.getString(R.string.place_square_one_shopping_centre), context.getString(R.string.place_square_one_shopping_centre_desc), R.drawable.square_one_shopping_centre));
        places.add(new Place(context.getString(R.string.place_cabin_goods_and_grooming), context.getString(R.string.place_cabin_goods_and_grooming_desc), R.drawable.cabin_goods_and_grooming));
        places.add(new Place(context.getString(R.string.place_threshold_aviation), context.getString(R.string.place_threshold_aviation_desc), R.drawable.threshold_aviation));
        return places;
    }

    public static List<Place> getStayPlaces(Context context) {
        List<Place> places = new ArrayList<>();
        places.add(new Place(context.getString(R.string.place_park_place_bed_and_breakfast), context.getString(R.string.place_park_place_bed_and_breakfast_desc), R.drawable.park_place_bed_and_breakfast));
        places.add(new Place(context.getString(R.string.place_alt_hotel_toronto_airport), context.getString(R.string.place_alt_hotel_toronto_airport_desc), R.drawable.alt_hotel_toronto_airport));
        places.add(new Place(context.getString(R.string.place_comfort_inn), context.getString(R.string.place_comfort_inn_desc), R.drawable.comfort_inn));
        places.add(new Place(context.getString(R.string.place_four_points), context.getString(R.string.place_four_points_desc), R.drawable.four_points_by_sheraton));
        places.add(new Place(context.getString(R.string.place_hilton_garden_inn), context.getString(R.string.place_hilton_garden_inn_desc), R.drawable.hilton_garden_inn));
        places.add(new Place(context.getString(R.string.place_holiday_inn_express), context.getString(R.string.place_holiday_inn_express_desc), R.drawable.holiday_inn_express));
        return places;
    }

}