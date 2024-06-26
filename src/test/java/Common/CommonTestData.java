package Common;

import static Common.RequestBuilder.APIKey;

public class CommonTestData {

    //REQRES STATUS CODES
    public static int Create_Success_Status_Code = 201;
    public static int GetUser_List_Success_Status_Code = 200;
    public static int Get_Single_User_Success_Status_Code = 200;
    public static int Update_Single_User_Success_Status_Code = 200;
    public static int delete_Single_User_Success_Status_Code = 200;
    public static int get_Single_User_Not_Found_Status_Code = 404;
    public static int display_Successful_Registration_Status_Code = 200;
    public static int display_Unsuccessful_Registration_Status_Code = 400;
    public static int display_Successful_Login_Status_Code = 200;
    public static int display_Unsuccessful_Login_Status_Code = 400;
    public static int display_Single_Resource_Status_Code = 200;
    public static int display_Single_Resource_Not_Found_Status_Code = 404;
    public static int display_List_Resources_Status_Code = 200;

    //STARTING DOGS API STATUS CODES

    public static int get_List_of_All_Breeds_Status_Code = 200;
    public static int display_Single_Random_Image_Status_Code = 200;
    public static int display_Multiple_Random_Image_Status_Code = 200;
    public static int display_All_Images_By_Breed_Status_Code = 200;
    public static int display_Radom_Image_from_Breed_Status_Code = 200;
    public static int display_Multiple_Images_from_Breed_Status_Code = 200;
    public static int display_List_All_Sub_Breeds_Status_Code = 200;
    public static int display_List_All_Sub_Breeds_Images_Status_Code = 200;
    public static int display_Single_Random_Image_From_Sub_Breed_Status_Code = 200;
    public static int display_Multiple_Images_From_Sub_Breed_Status_Code = 200;
    public static int display_Images_Of_Breed_List_Status_Code = 404;


//STARTING THE WEATHER API STATUS CODES
    public static int register_Weather_Station = 201;
    public static int get_Newly_Registered_Weather_Station = 200;
    public static int update_Weather_Station_Info = 200;
    public static int delete_Weather_Station_Info = 200;
    public static int negative_Register_Weather_Station_Info = 400;
    public static int invalid_APIKey_Weather_Registration = 400;

}