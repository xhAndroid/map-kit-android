/*
 * Copyright (C) 2020 Supasin Tatiyanupanwong
 * Copyright (C) 2020 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package me.tatiyanupanwong.supasin.android.libraries.kits.maps.utils.data.kml;

import java.util.ArrayList;

import me.tatiyanupanwong.supasin.android.libraries.kits.maps.utils.data.Geometry;

public class KmlMultiTrack extends KmlMultiGeometry {

    /**
     * Creates a new MultiGeometry object
     *
     * @param tracks array of KmlTrack objects contained in the MultiGeometry
     */
    public KmlMultiTrack(ArrayList<KmlTrack> tracks) {
        super(createGeometries(tracks));
    }

    private static ArrayList<Geometry> createGeometries(ArrayList<KmlTrack> tracks) {
        ArrayList<Geometry> geometries = new ArrayList<>();

        if (tracks == null) {
            throw new IllegalArgumentException("Tracks cannot be null");
        }

        for (KmlTrack track : tracks) {
            geometries.add(track);
        }

        return geometries;
    }

}
