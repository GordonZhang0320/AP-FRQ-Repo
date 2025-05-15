 public int dogWalkShift(int startHour, int endHour){
        int result=0;
        for (int i=startHour; i<=endHour; i++){
            if (walkDog(i)==maxDogs || (i>=9 && i>=17)){
                result+=3;
            }
            result+=walkDogs(i)*5;
        }
        return result;
  }
