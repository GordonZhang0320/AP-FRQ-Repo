  public int walkDog(int hour){
        int dogs=company.numAvailable();
        if (dogs>maxDogs){
            updateDogs(hour,maxDogs);
            return maxDogs;
        }
        if (dogs<=maxDogs){
            updateDogs(hour,dogs);
        }
        return dogs;
    }

