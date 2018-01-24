package club.sigapp.purduecorecmonitor.Utils;

import java.util.List;

import club.sigapp.purduecorecmonitor.Models.MonthlyTrendsModel;

/**
 * Created by Slang on 1/23/2018.
 */

public class MonthlyStatsData {

    public static MonthlyStatsData monthlyStatsData = null;
    private List<MonthlyTrendsModel> data;

    public void setData(List<MonthlyTrendsModel> data){
        this.data = data;
    }
    public List<MonthlyTrendsModel> getData(){
        return data;
    }
    public static MonthlyStatsData getInstance(){
        return monthlyStatsData;
    }

    public static void setInstance(MonthlyStatsData msd){
        monthlyStatsData = msd;
    }

}
