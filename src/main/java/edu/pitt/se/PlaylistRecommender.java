package edu.pitt.se;

import java.util.List;

public class PlaylistRecommender {

    public static String classifyEnergy(List<Integer> bpms) {
        // TODO: Implement classifyEnergy()
        // throw new UnsupportedOperationException("Not implemented");

        if(bpms == null || bpms.size() == 0) return "Invalid playlist";
        double total = 0;
        for(int i = 0; i < bpms.size(); i++) {
            total += bpms.get(i);
        }
        double avg = total/bpms.size();

        if(avg >= 140) return "HIGH";

        if(avg >= 100) return "MEDIUM";

        else return "LOW";
    }

    public static boolean isValidTrackTitle(String title) {
        // TODO: Implement isValidTrackTitle()
        // throw new UnsupportedOperationException("Not implemented");

        if(title == null || title.length() < 1 || title.length() > 30) return false;
        char[] specialChars = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')',
                       '-', '_', '+', '=', '{', '}', '[', ']', '|', '\\',
                       ':', ';', '"', '\'', '<', '>', ',', '.', '?', '/'};
        for(int i = 0; i < title.length(); i++) {
            for(int j = 0; j < specialChars.length; j++) {
                if(title.charAt(i) == specialChars[j]) return false;
            }
        }

        return true;
    }

    public static int normalizeVolume(int volumeDb) {
        // TODO: Implement normalizeVolume()
        // throw new UnsupportedOperationException("Not implemented");

        if(volumeDb > 100) return 100;
        if(volumeDb < 0) return 0;

        return volumeDb;
    }
}
