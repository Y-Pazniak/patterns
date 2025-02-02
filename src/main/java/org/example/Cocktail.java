package org.example;

public class Cocktail {
    private final String base;
    private final String mixer;
    private final String sweetener;
    private final String beauty;
    private final int iceCount;

    private Cocktail(final String base, final String mixer, final String sweetener, final String beauty, final int iceCount) {
        this.base = base;
        this.mixer = mixer;
        this.sweetener = sweetener;
        this.beauty = beauty;
        this.iceCount = iceCount;
    }

    @Override
    public String toString() {
        return String.format("Cocktail consists of: base - %s, mixer - %s, sweetener - %s, beauty - %s, with ice - %s", base, mixer, sweetener, beauty, iceCount);
    }

    public static class Builder {
        private String base;
        private String mixer;
        private String sweetener;
        private String beauty;
        private int iceCount;

        public Builder setBase(final String base) {
            this.base = base;
            return this;
        }

        public Builder setMixer(final String mixer) {
            this.mixer = mixer;
            return this;
        }

        public Builder setSweetener(final String sweetener) {
            this.sweetener = sweetener;
            return this;
        }

        public Builder setBeauty(final String beauty) {
            this.beauty = beauty;
            return this;
        }

        public Builder setIceCount(final int iceCount) {
            this.iceCount = iceCount;
            return this;
        }

        public Cocktail build() {
            checkNull(base, "base");
            checkNull(mixer, "mixer");
            checkNull(sweetener, "sweetener");
            checkNull(beauty, "beauty");
            if (iceCount <= 0) {
                throw new IllegalArgumentException("A warm cocktail is a crime! Add ice!");
            }
            return new Cocktail(base, mixer, sweetener, beauty, iceCount);
        }

        private void checkNull(final String field, final String errorText) {
            if (field == null) {
                throw new IllegalArgumentException(errorText + " is missing");
            }
        }
    }
}
