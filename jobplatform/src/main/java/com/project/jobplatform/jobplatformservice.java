package com.project.jobplatform;

import java.util.List;

public interface jobplatformservice {
     public String createjobplatform(jobplatformdetails details);

     public String updatejobplatform(jobplatformdetails details);

     public String getjobplatform(String jobid);

     public String deletejobplatform(String jobid);

     public List<jobplatformdetails> getalljobplatformdetails();

}
