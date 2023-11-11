class BankAccount {
    private String CustomerFullName;
    private int AccountId;
    private static int NumofAcct = 0;
    private double CustomerAcctBalance;
    private String CustLoginId;
    private String CustLogPass;

    public BankAccount(String CustomerFullName, String CustLoginId, String CustLogPass) {
        this.CustomerFullName = CustomerFullName;
        this.CustLoginId = CustLoginId;
        this.CustLogPass = CustLogPass;
        this.CustomerAcctBalance = 0;
        this.AccountId = ++NumofAcct;
    }

    public String getCustomerFullName{
        return CustomerFullName;
    }

    public String setCustomerFullName{
        this.CustomerFullName = CustomerFullName;
    }

    public int getAccountId{
        return AccountId;
    }




















}