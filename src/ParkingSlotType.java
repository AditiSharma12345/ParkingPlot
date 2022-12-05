public enum ParkingSlotType {
    TwoWheeler{
        public double getPriceForParking(long duration)
        {
            return duration*20;
        }
    },
    Compact{
        public double getPriceForParking(long duration)
        {
            return duration*30;
        }
    },
    Medium{
        public double getPriceForParking(long duration)
        {
            return duration*40;
        }
    },
    Large{
        public double getPriceForParking(long duration)
        {
            return duration*50;
        }
    },
    Electric{
        public double getPriceForParking(long duration)
        {
            return duration*30;
        }
    };
}
