package assignment04;

public class TVRemote {
	private TV tv;

	public TVRemote(TV tvIn) {
		tv = tvIn;
		// TODO
		// make calls to tv.down() to set the TV channel to 2; notice that
		// this test driver raises the channel before connecting the remote.
		while (tv.getChannel() != 2){
			tv.down();
		}
	}
	

	public void setChannel(int newChannel) {
		// TODO
		// write this method using multiple calls to tv.up() or
		// tv.down() as appropriate
		while (tv.getChannel() != newChannel){
			if (tv.getChannel() < newChannel){
				tv.up();
			}
			if (tv.getChannel() > newChannel){
				tv.down();
			}
			if (tv.getChannel() == 2 || tv.getChannel() == 500) break;
		}
	}
}

