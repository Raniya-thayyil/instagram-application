package instagram;

import java.util.Comparator;

public class sortPost implements Comparator<Post> {

    @Override
    public int compare(Post firstPost, Post nextPost) {

        int compareValue = firstPost.getUploadedDate().compareTo(nextPost.getUploadedDate());
        return compareValue;

    }
}
