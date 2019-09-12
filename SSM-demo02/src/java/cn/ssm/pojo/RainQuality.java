package cn.ssm.pojo;

import java.util.Date;

public class RainQuality {

	private Integer id;
	private String districtName;
	private Date moniTor;
	private Integer rain;
	private String monitoringStation;
	private String monitoringAddress;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public Date getMoniTor() {
		return moniTor;
	}
	public void setMoniTor(Date moniTor) {
		this.moniTor = moniTor;
	}
	public Integer getRain() {
		return rain;
	}
	public void setRain(Integer rain) {
		this.rain = rain;
	}
	public String getMonitoringStation() {
		return monitoringStation;
	}
	public void setMonitoringStation(String monitoringStation) {
		this.monitoringStation = monitoringStation;
	}
	public String getMonitoringAddress() {
		return monitoringAddress;
	}
	public void setMonitoringAddress(String monitoringAddress) {
		this.monitoringAddress = monitoringAddress;
	}
	public RainQuality(Integer id, String districtName, Date moniTor, Integer rain, String monitoringStation,
                       String monitoringAddress) {
		super();
		this.id = id;
		this.districtName = districtName;
		this.moniTor = moniTor;
		this.rain = rain;
		this.monitoringStation = monitoringStation;
		this.monitoringAddress = monitoringAddress;
	}
	public RainQuality() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "rainQuality [id=" + id + ", districtName=" + districtName + ", moniTor=" + moniTor + ", rain=" + rain
				+ ", monitoringStation=" + monitoringStation + ", monitoringAddress=" + monitoringAddress + "]";
	}
	
}
