package model;

    public class Bus
    {
        private String govNumber;
        private String nameOfBus;
        private String ageOfcreate;
        private String numberOfRoute;
        private int sitPassangers;
        private int capacity;
        private int currentAmount;

        public String getGovNumber()
        {
            return govNumber;
        }

        public void setGovNumber(String govNumber)
        {
            this.govNumber = govNumber;
        }

        public String getNameOfBus()
        {
            return nameOfBus;
        }

        public void setNameOfBus(String nameOfBus)
        {
            this.nameOfBus = nameOfBus;
        }

        public String getAgeOfcreate()
        {
            return ageOfcreate;
        }

        public void setAgeOfcreate(String ageOfcreate)
        {
            this.ageOfcreate = ageOfcreate;
        }

        public String getNumberOfRoute()
        {
            return numberOfRoute;
        }

        public void setNumberOfRoute(String numberOfRoute) {
            this.numberOfRoute = numberOfRoute;
        }

        public int getSitPassangers() {
            return sitPassangers;
        }

        public void setSitPassangers(int sitPassangers)
        {
            this.sitPassangers = sitPassangers;
        }

        public int getCapacity()
        {
            return capacity;
        }

        public void setCapacity(int capacity)
        {
            this.capacity = capacity;
        }

        public int getCurrentAmount()
        {
            return currentAmount;
        }

        public void setCurrentAmount(int currentAmount)
        {
            this.currentAmount = currentAmount;
        }

        public Bus(String govNumber, String nameOfBus, String ageOfcreate, String numberOfRoute, int sitPassangers, int capacity, int currentAmount)
        {
            this.govNumber = govNumber;
            this.nameOfBus = nameOfBus;
            this.ageOfcreate = ageOfcreate;
            this.numberOfRoute = numberOfRoute;
            this.sitPassangers = sitPassangers;
            this.capacity = capacity;
            this.currentAmount = currentAmount;
        }

        public Bus()
        {
            this.govNumber = "";
            this.nameOfBus = "";
            this.ageOfcreate = "";
            this.numberOfRoute = "";
            this.sitPassangers = 0;
            this.capacity = 0;
            this.currentAmount = 0;
        }

        public String toString()
        {
            return govNumber + " " + nameOfBus + " " + ageOfcreate+ " "  + numberOfRoute+ " " + sitPassangers+ " " + capacity+ " " + currentAmount;
        }
    }
    