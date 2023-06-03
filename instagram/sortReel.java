package instagram;

import java.util.Comparator;

public class sortReel implements Comparator<Reel> {

    @Override
    public int compare(Reel firstReel, Reel nextReel) {

        int compareValue = firstReel.getUploadedDate().compareTo(nextReel.getUploadedDate());
        return compareValue;

    }

}
