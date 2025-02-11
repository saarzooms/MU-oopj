class GSTCalc {
    void calcGst(double amt, double gstper) {
        double igst = amt * gstper * 0.01;
        double total = amt + igst;
        double cgst = igst / 2;
        double sgst = cgst;
        System.out.println("Total:" + total);
        System.out.println("Amnt:" + amt);
        System.out.println("IGST:" + igst);
        System.out.println("CGST:" + cgst);
        System.out.println("SGST:" + sgst);
    }

    void revCalcGST(double total, double gstper) {
        double amt = total / (1 + gstper * 0.01);
        double igst = amt * gstper * 0.01;
        double cgst = igst / 2;
        double sgst = cgst;
        System.out.println("Total:" + total);
        System.out.println("Amnt:" + amt);
        System.out.println("IGST:" + igst);
        System.out.println("CGST:" + cgst);
        System.out.println("SGST:" + sgst);

    }

    public static void main(String[] args) {
        GSTCalc obj = new GSTCalc();
        obj.calcGst(436, 18);
        obj.revCalcGST(118.0, 18);
    }
}