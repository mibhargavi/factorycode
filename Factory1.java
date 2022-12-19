public class Factory {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("add the no of jobs");
        int n=sc.nextInt();

        List<Integer> jobs=new ArrayList<>(Arrays.asList(new Integer[n]));
        List<JobDetails> jobDetail=new ArrayList<JobDetails>();
        System.out.println("enter startTime,endTime,profit for jobs of "+n);
        for(int i=0;i<n;i++) {
            String startTime=sc.next();
            String endTime=sc.next();
            Double profit=sc.nextDouble();
            jobDetail.add(new JobDetails(startTime,endTime,profit));
        }
        JobDetails[] arr = new JobDetails[jobDetail.size()];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = jobDetail.get(i);
        }
        Double max = arr[0].getProfit();
        Double sum=null;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].getProfit() > max) {
                max = arr[i].getProfit();
                System.out.println("Job is allocated"+max);

            }
            else {
                System.out.println("remaining jobs"+(n-1));
            }

        }
     }
}

public class JobDetails {
    private String startTime;
    private String endTime;
    private Double profit;

    public JobDetails(String startTime, String endTime, Double profit) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.profit = profit;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Double getProfit() {
        return profit;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }

}
