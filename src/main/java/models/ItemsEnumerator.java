package main.java.models;

public enum ItemsEnumerator {
    ROCK,
    PAPER,
    SCISSOR;

    public static Integer compare(ItemsEnumerator item1, ItemsEnumerator item2) {
        if (item1 != item2) {
            switch (item1) {
                case ROCK: {
                    return item2 == ItemsEnumerator.PAPER ? -1 : 1;
                }

                case PAPER: {
                    return item2 == ItemsEnumerator.SCISSOR ? -1 : 1;
                }

                case SCISSOR: {
                    return item2 == ItemsEnumerator.ROCK ? -1 : 1;
                }
            }
        }
        return 0;
    }
}
