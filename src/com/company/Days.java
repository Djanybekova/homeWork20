package com.company;

public enum Days {
    MONDAY{
        @Override
        public void method() {
            System.out.println("Дуйшомбу куну жава окуйм");
        }
    },
    TUESDAY{
        @Override
        public void method() {
            System.out.println("Шейшемби куну англис тили сабагын окуйм");
        }
    },
    WEDNESDAY{
        @Override
        public void method() {
            System.out.println("Щаршемби куну жава окуйм ");
        }
    },
    THURSDAY{
        @Override
        public void method() {
            System.out.println("Бейшемби куну англис тили сабагын окуйм");
        }
    },
    FRIDAY{
        @Override
        public void method() {
            System.out.println("Жума куну жава окуйм");
        }
    },
    SATURDAY{
        @Override
        public void method() {
            System.out.println("Ишемби дем алыш куну");
        }
    },
    SUNDAY{
        @Override
        public void method() {
            System.out.println("Жекшемби дем алыш куну");
        }
    };

public abstract void method();
}
