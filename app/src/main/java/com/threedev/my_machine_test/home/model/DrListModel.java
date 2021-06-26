package com.threedev.my_machine_test.home.model;

import java.util.ArrayList;

public class DrListModel {
    private String Status;

    private String Message;

    private Data Data;

    public String getStatus ()
    {
        return Status;
    }

    public void setStatus (String Status)
    {
        this.Status = Status;
    }

    public String getMessage ()
    {
        return Message;
    }

    public void setMessage (String Message)
    {
        this.Message = Message;
    }

    public Data getData ()
    {
        return Data;
    }

    public void setData (Data Data)
    {
        this.Data = Data;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Status = "+Status+", Message = "+Message+", Data = "+Data+"]";
    }
    public class Data
    {
        private String DoctorName;

        private String Slogun;

        private String ConsationFees;

        private String Message;

        private String Degree;

        private String AartasLocation;

        private String RegistrationID;

        private ArrayList<Specialist> Specialist;

        private String is_verify;

        private String Website;

        private String Profile;

        private String About;

        private String[] Mychannels;

        private String DoctorID;

        private String ConsactionDay;

        private ArrayList<Training> Training;

        private String GraduationYear;

        private String LocationFrom;

        private String Language;

        private String[] AchievementAndHonors;

        private String[] AvailableTime;

        private String Focus;

        private String[] additional_date;

        private String ContactNumber;

        public ArrayList<DrListModel.Data.Specialist> getSpecialist() {
            return Specialist;
        }

        public void setSpecialist(ArrayList<DrListModel.Data.Specialist> specialist) {
            Specialist = specialist;
        }

        public ArrayList<DrListModel.Data.Training> getTraining() {
            return Training;
        }

        public void setTraining(ArrayList<DrListModel.Data.Training> training) {
            Training = training;
        }

        public String getDoctorName ()
        {
            return DoctorName;
        }

        public void setDoctorName (String DoctorName)
        {
            this.DoctorName = DoctorName;
        }

        public String getSlogun ()
        {
            return Slogun;
        }

        public void setSlogun (String Slogun)
        {
            this.Slogun = Slogun;
        }

        public String getConsationFees ()
        {
            return ConsationFees;
        }

        public void setConsationFees (String ConsationFees)
        {
            this.ConsationFees = ConsationFees;
        }

        public String getMessage ()
        {
            return Message;
        }

        public void setMessage (String Message)
        {
            this.Message = Message;
        }

        public String getDegree ()
        {
            return Degree;
        }

        public void setDegree (String Degree)
        {
            this.Degree = Degree;
        }

        public String getAartasLocation ()
        {
            return AartasLocation;
        }

        public void setAartasLocation (String AartasLocation)
        {
            this.AartasLocation = AartasLocation;
        }

        public String getRegistrationID ()
        {
            return RegistrationID;
        }

        public void setRegistrationID (String RegistrationID)
        {
            this.RegistrationID = RegistrationID;
        }


        public String getIs_verify ()
        {
            return is_verify;
        }

        public void setIs_verify (String is_verify)
        {
            this.is_verify = is_verify;
        }

        public String getWebsite ()
        {
            return Website;
        }

        public void setWebsite (String Website)
        {
            this.Website = Website;
        }

        public String getProfile ()
        {
            return Profile;
        }

        public void setProfile (String Profile)
        {
            this.Profile = Profile;
        }

        public String getAbout ()
        {
            return About;
        }

        public void setAbout (String About)
        {
            this.About = About;
        }

        public String[] getMychannels ()
        {
            return Mychannels;
        }

        public void setMychannels (String[] Mychannels)
        {
            this.Mychannels = Mychannels;
        }

        public String getDoctorID ()
        {
            return DoctorID;
        }

        public void setDoctorID (String DoctorID)
        {
            this.DoctorID = DoctorID;
        }

        public String getConsactionDay ()
        {
            return ConsactionDay;
        }

        public void setConsactionDay (String ConsactionDay)
        {
            this.ConsactionDay = ConsactionDay;
        }



        public String getGraduationYear ()
        {
            return GraduationYear;
        }

        public void setGraduationYear (String GraduationYear)
        {
            this.GraduationYear = GraduationYear;
        }

        public String getLocationFrom ()
        {
            return LocationFrom;
        }

        public void setLocationFrom (String LocationFrom)
        {
            this.LocationFrom = LocationFrom;
        }

        public String getLanguage ()
        {
            return Language;
        }

        public void setLanguage (String Language)
        {
            this.Language = Language;
        }

        public String[] getAchievementAndHonors ()
        {
            return AchievementAndHonors;
        }

        public void setAchievementAndHonors (String[] AchievementAndHonors)
        {
            this.AchievementAndHonors = AchievementAndHonors;
        }

        public String[] getAvailableTime ()
        {
            return AvailableTime;
        }

        public void setAvailableTime (String[] AvailableTime)
        {
            this.AvailableTime = AvailableTime;
        }

        public String getFocus ()
        {
            return Focus;
        }

        public void setFocus (String Focus)
        {
            this.Focus = Focus;
        }

        public String[] getAdditional_date ()
        {
            return additional_date;
        }

        public void setAdditional_date (String[] additional_date)
        {
            this.additional_date = additional_date;
        }

        public String getContactNumber ()
        {
            return ContactNumber;
        }

        public void setContactNumber (String ContactNumber)
        {
            this.ContactNumber = ContactNumber;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [DoctorName = "+DoctorName+", Slogun = "+Slogun+", ConsationFees = "+ConsationFees+", Message = "+Message+", Degree = "+Degree+", AartasLocation = "+AartasLocation+", RegistrationID = "+RegistrationID+", Specialist = "+Specialist+", is_verify = "+is_verify+", Website = "+Website+", Profile = "+Profile+", About = "+About+", Mychannels = "+Mychannels+", DoctorID = "+DoctorID+", ConsactionDay = "+ConsactionDay+", Training = "+Training+", GraduationYear = "+GraduationYear+", LocationFrom = "+LocationFrom+", Language = "+Language+", AchievementAndHonors = "+AchievementAndHonors+", AvailableTime = "+AvailableTime+", Focus = "+Focus+", additional_date = "+additional_date+", ContactNumber = "+ContactNumber+"]";
        }


        public class Training
        {
            private String DoctorID;

            private String year;

            private String TrainingID;

            private String CreatedDate;

            private String degree;

            private String specialization;

            private String ThumbImage;

            private String type;

            private String CollegeName;

            public String getDoctorID ()
            {
                return DoctorID;
            }

            public void setDoctorID (String DoctorID)
            {
                this.DoctorID = DoctorID;
            }

            public String getYear ()
            {
                return year;
            }

            public void setYear (String year)
            {
                this.year = year;
            }

            public String getTrainingID ()
            {
                return TrainingID;
            }

            public void setTrainingID (String TrainingID)
            {
                this.TrainingID = TrainingID;
            }

            public String getCreatedDate ()
            {
                return CreatedDate;
            }

            public void setCreatedDate (String CreatedDate)
            {
                this.CreatedDate = CreatedDate;
            }

            public String getDegree ()
            {
                return degree;
            }

            public void setDegree (String degree)
            {
                this.degree = degree;
            }

            public String getSpecialization ()
            {
                return specialization;
            }

            public void setSpecialization (String specialization)
            {
                this.specialization = specialization;
            }

            public String getThumbImage ()
            {
                return ThumbImage;
            }

            public void setThumbImage (String ThumbImage)
            {
                this.ThumbImage = ThumbImage;
            }

            public String getType ()
            {
                return type;
            }

            public void setType (String type)
            {
                this.type = type;
            }

            public String getCollegeName ()
            {
                return CollegeName;
            }

            public void setCollegeName (String CollegeName)
            {
                this.CollegeName = CollegeName;
            }

            @Override
            public String toString()
            {
                return "ClassPojo [DoctorID = "+DoctorID+", year = "+year+", TrainingID = "+TrainingID+", CreatedDate = "+CreatedDate+", degree = "+degree+", specialization = "+specialization+", ThumbImage = "+ThumbImage+", type = "+type+", CollegeName = "+CollegeName+"]";
            }
        }

        public class Specialist
        {
            private String SpecialistID;

            private String updated_at;

            private String UpdatedDate;

            private String CreatedDate;

            private String IconType;

            private String SpecialistName;

            public String getSpecialistID ()
            {
                return SpecialistID;
            }

            public void setSpecialistID (String SpecialistID)
            {
                this.SpecialistID = SpecialistID;
            }

            public String getUpdated_at ()
            {
                return updated_at;
            }

            public void setUpdated_at (String updated_at)
            {
                this.updated_at = updated_at;
            }

            public String getUpdatedDate ()
            {
                return UpdatedDate;
            }

            public void setUpdatedDate (String UpdatedDate)
            {
                this.UpdatedDate = UpdatedDate;
            }

            public String getCreatedDate ()
            {
                return CreatedDate;
            }

            public void setCreatedDate (String CreatedDate)
            {
                this.CreatedDate = CreatedDate;
            }

            public String getIconType ()
            {
                return IconType;
            }

            public void setIconType (String IconType)
            {
                this.IconType = IconType;
            }

            public String getSpecialistName ()
            {
                return SpecialistName;
            }

            public void setSpecialistName (String SpecialistName)
            {
                this.SpecialistName = SpecialistName;
            }

            @Override
            public String toString()
            {
                return "ClassPojo [SpecialistID = "+SpecialistID+", updated_at = "+updated_at+", UpdatedDate = "+UpdatedDate+", CreatedDate = "+CreatedDate+", IconType = "+IconType+", SpecialistName = "+SpecialistName+"]";
            }
        }


    }


}
