package met.tns.heirarchicalinheritance;

public class SnowCone extends Android {
	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "SnowCone [version=" + version + ", toString()=" + super.toString() + "]";
	}

	public SnowCone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SnowCone(String brandName, String slotType, int version) {
		super(brandName, slotType);
		// TODO Auto-generated constructor stub
		this.version = version;
	}

	//@Override
//	public String toString() {
//		return "SnowCone [version=" + version + ", toString()=" + super.toString() + "]";
//	}
//
//	public SnowCone() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	
	
	

}
