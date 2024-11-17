package defaultPackages;

public class Time {

	private int hours, minutes, seconds;
	
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public Time() {
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
	}
	
	public Time(int hours) {
		this.hours = hours;
		this.minutes = 0;
		this.seconds = 0;
	}
	
	public Time(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = 0;
	}
	
	public Time(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public Time clone() {
		return new Time(this.hours, this.minutes, this.seconds);
	}
	
	public boolean isSameTime(Time toCompare) {
		return this.hours==toCompare.getHours() &&
				this.minutes==toCompare.getMinutes() &&
				this.seconds==toCompare.getSeconds();
	}
	
	public void setTime(Time toSet) {
		
		this.hours=toSet.getHours();
		this.minutes=toSet.getMinutes();
		this.seconds=toSet.getSeconds();
		
	}
	
	public void tick() {
		if(this.seconds == 59) {
			this.seconds=0;
			if(this.minutes == 59) {
				this.minutes=0;
				if(this.hours==23) {
					this.hours=0;
				}else {
					this.hours+=1;
				}
			}
			else {
				this.minutes+=1;
			}
		}else {
			this.seconds+=1;
		}
		
	}
	
	public boolean isNextDay(Time timeAfter) {
		if(timeAfter.getHours()<this.hours)
			return true;
		if(timeAfter.getHours()==this.hours && this.minutes > timeAfter.getMinutes())
			return true;
		if(timeAfter.getHours()==this.hours 
				&& this.minutes == timeAfter.getMinutes()
				&& this.seconds>timeAfter.getSeconds())
			return true;
		
		return false;
	}
	
	public Time getTimeUntilMidNight() {
	    int temporarySecond = (this.seconds > 0) ? 60 - this.seconds : 0;
	    int temporaryMinute = (this.seconds > 0) 
	    		? 59 - this.minutes : 60 - this.minutes;
	    int temporaryHour = (this.minutes > 0 || this.seconds > 0) 
	    		? 23 - this.hours : 24 - this.hours;
	    
		return new Time(temporaryHour, temporaryMinute, temporarySecond);
	}
	
	private Time calculateAfterMidNight(Time beforeMidNightTime, Time timeAfter) {
		int leftoverTime=0;
		
		leftoverTime=(beforeMidNightTime.getSeconds() + timeAfter.getSeconds()) 
				/60;
		int tempSeconds= (beforeMidNightTime.getSeconds() + timeAfter.getSeconds()) 
				%60;
		
		leftoverTime=(beforeMidNightTime.getMinutes() + timeAfter.getMinutes()+ leftoverTime) 
				/60;
		int tempMinutes= (beforeMidNightTime.getMinutes() + timeAfter.getMinutes() + leftoverTime) 
				%60;
		
		
		int tempHours= beforeMidNightTime.getHours() + timeAfter.getHours() + leftoverTime;
		
		return new Time(tempHours, tempMinutes, tempSeconds);
		
	}
	
	public Time calculateTimeIfDuringTheSameDay(Time timeAfter) {
		int secondsDiff = timeAfter.getSeconds() - this.getSeconds();
        int minutesBorrow = 0;
        if (secondsDiff < 0) {
            secondsDiff += 60;
            minutesBorrow = 1;
        }

        int minutesDiff = timeAfter.getMinutes() - this.getMinutes() - minutesBorrow;
        int hoursBorrow = 0;
        if (minutesDiff < 0) {
            minutesDiff += 60;
            hoursBorrow = 1;
        }

        int hoursDiff = timeAfter.getHours() - this.getHours() - hoursBorrow;
        
        return new Time(hoursDiff, minutesDiff, secondsDiff);
	}
	
	
	public Time getTimeDifference(Time timeAfter) {
		if(this.isSameTime(timeAfter))
			return new Time(0, 0, 0);
		
		if(isNextDay(timeAfter)) {
			return calculateAfterMidNight(getTimeUntilMidNight(), timeAfter);
		}else {
			
			return calculateTimeIfDuringTheSameDay(timeAfter);
			
		}
		
	}
	
	@Override
	public String toString() {
	    return String.format(
	        "Time (hours: %d, minutes: %d, seconds: %d)",
	        hours,
	        minutes,
	        seconds
	    );
	}
	
	
	
}
