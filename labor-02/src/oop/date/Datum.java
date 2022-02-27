package oop.date;

public class Datum {
        private int year;
        private int month;
        private int day;

        public Datum(int year,int month,int day){
            this.day=day;
            this.month=month;
            this.year=year;
        }

        public int getDay() {
            return day;
        }

        public int getMonth() {
            return month;
        }

        public int getYear() {
            return year;
        }

        @Override
        public String toString() {
            return "MyDate{" +
                    "year=" + year +
                    ", month=" + month +
                    ", day=" + day +
                    '}';
        }
        public static boolean szokoev(int year){
            return year % 4 == 0;
        }
        public  static boolean helyesDatum(int year,int month,int day){
            if(year>=1){
                if(month==4 || month==6 || month==9 || month==11){
                    return day >= 1 && day <= 30;
                }
                else if(month==2){
                    if (szokoev(year)){
                        return day >= 1 && day <= 29;
                    }
                    else return day >= 1 && day <= 28;
                }
                else return day >= 1 && day <= 31;
            }
            else return false;
        }
    }

