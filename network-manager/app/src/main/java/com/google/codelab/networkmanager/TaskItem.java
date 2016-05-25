package com.google.codelab.networkmanager;

public class TaskItem {
    public static final String ONEOFF_TASK = "Oneoff Task";
    public static final String NOW_TASK = "Now Task";
    public static final String PENDING_STATUS = "Pending";
    public static final String EXECUTED_STATUS = "Executed";
    public static final String FAILED_STATUS = "Failed";
    private String mId;
    private String mType;
    private String mStatus;
    public TaskItem(String id, String label, String status) {
        mId = id;
        mType = label;
        mStatus = status;
    }
    public String getId() {return mId;}
    public void setId(String id) {this.mId = id;}
    public String getType() {return mType;}
    public String getStatus() {return mStatus;}
    public void setStatus(String stat) {this.mStatus = stat;}
}
