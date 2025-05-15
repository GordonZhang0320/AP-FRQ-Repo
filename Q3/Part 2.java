public ArrayList<Match> buildMatches(){
        ArrayList<Match> result=new ArrayList<Match>();
        if (competitorList.size()%2==0){
            for (int i=0; i<competitorList.size()/2; i++){
                Competitor c1=competitorList.get(i);
                Competitor c2=competitorList.get(competitorList.size()-i-1);
                Match m=new Match(c1,c2);
                result.add(m);
            }
        } else {
            for (int i=1; i<=competitorList.size()/2;i++){
                Competitor c1=competitorList.get(i);
                Competitor c2=competitorList.get(competitorList.size()-i);
                Match m=new Match(c1,c2);
                result.add(m);
            }
        }

        return result;
    }
