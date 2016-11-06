package laboration1;

public class Fysiker extends Human{
        private int gradeIn;
        public Fysiker(int ageIn, String nameIn, int gradeIn){
            super(ageIn, nameIn); this.gradeIn=gradeIn;
        
        if (gradeIn<1932 || gradeIn>2016) {
            throw new IllegalArgumentException("Fel år");
        }
        if (ageIn -(2016-gradeIn)<15) {
            throw new IllegalArgumentException("Fel ålder");
        }
        }
        public Fysiker(){                                                             //Konstruktör
        this.nameIn = this.randomName();
        this.gradeIn = this.randomGrade();
        this.ageIn = this.randomAge();
        
        }
        
        public int getGrade(){
            return gradeIn;
        }
        @Override
        public int randomAge(){
        return (int)((2016-(gradeIn-15))+Math.random()*(100-(2016-(gradeIn-15))));
        }
        public int randomGrade(){
            return (int) (1932 + Math.random()*(2016-1932));
        }
        @Override
        public String toString(){
            if (gradeIn%100 >= 10){
                return "Namn:" + nameIn + ", ålder " + ageIn + ", F" + gradeIn%100+" ." ;
            }
            else{return "Namn:" + nameIn + ", ålder " + ageIn + ", F0" + gradeIn%100+" ." ;        
            }
        }
        
        @Override
        public int compareTo(Human o){
        int oldComparision = super.compareTo(o);
        if (oldComparision == 0 && o instanceof Fysiker){
            int diff = ((Fysiker) o).getGrade()-gradeIn;
            return diff;
        }
        else{
            return oldComparision;
        }
        
}
}