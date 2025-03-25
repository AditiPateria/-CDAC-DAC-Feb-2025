class PrimitiveDataTypes {
    static byte defaultByte;
    static short defaultShort;
    static int defaultInt;
    static long defaultLong;
    static float defaultFloat;
    static double defaultDouble;
    static char defaultChar;
    static boolean defaultBoolean;

    public static void main(String[] args) {
        byte assignedByte = 10;
        short assignedShort = 200;
        int assignedInt = 1000;
        long assignedLong = 100000L;
        float assignedFloat = 10.5f;
        double assignedDouble = 123.456;
        char assignedChar = 'A';
        boolean assignedBoolean = true;

        System.out.println("byte Default: " + defaultByte);
        System.out.println("byte Assigned: " + assignedByte);
 
        System.out.println("short Default: " + defaultShort);
        System.out.println("short Assigned: " + assignedShort);

        System.out.println("int Default: " + defaultInt);
        System.out.println("int Assigned: " + assignedInt);

        System.out.println("long Default: " + defaultLong);
        System.out.println("long Assigned: " + assignedLong);

        System.out.println("float Default: " + defaultFloat);
        System.out.println("float Assigned: " + assignedFloat);

        System.out.println("double Default: " + defaultDouble);
        System.out.println("double Assigned: " + assignedDouble);

        System.out.println("char Default: [" + defaultChar + "]");
        System.out.println("char Assigned: " + assignedChar);

        System.out.println("boolean Default: " + defaultBoolean);
        System.out.println("boolean Assigned: " + assignedBoolean);
    }
}

/* Output - 
byte Default: 0
byte Assigned: 10
short Default: 0
short Assigned: 200
int Default: 0
int Assigned: 1000
long Default: 0
long Assigned: 100000
float Default: 0.0
float Assigned: 10.5
double Default: 0.0
double Assigned: 123.456
char Default: []
char Assigned: A
boolean Default: false
boolean Assigned: true  */