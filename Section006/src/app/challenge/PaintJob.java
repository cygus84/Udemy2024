package app.challenge;

public class PaintJob {
	
	public PaintJob() {
		System.out.println("Start paint Job!");
		getBucketCount(5.55, 6.45, 1.32, 2);
		
	}
	
	public int getBucketCount(double width, double height,
			double areaPerBucket,int extraBuckets) {
		if(width <= 0 || height <= 0 || extraBuckets < 0) {
			return -1;
		}
		
		double area = width * height;
		double remainingArea = area - extraBuckets * areaPerBucket;
		return getBucketCourt(remainingArea, areaPerBucket);
	}

	private int getBucketCourt(double area, double areaPerBucket) {
		if( area <= 0 || areaPerBucket <= 0) {
			return -1;
		}
		double numberOfBuckets = area / areaPerBucket;
		return (int)Math.ceil(numberOfBuckets);
	}

	
}
