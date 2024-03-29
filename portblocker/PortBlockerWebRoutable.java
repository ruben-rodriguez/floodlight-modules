package net.floodlightcontroller.portblocker;

import org.restlet.Context;
import org.restlet.Restlet;
import org.restlet.routing.Router;

import net.floodlightcontroller.restserver.RestletRoutable;

public class PortBlockerWebRoutable implements RestletRoutable {

	@Override
	public Restlet getRestlet(Context context) {
		Router router = new Router(context);
		router.attach("/list/json", PortBlockerResource.class);
		router.attach("/enable/json", PortBlockerEnableResource.class);
		router.attach("/disable/json", PortBlockerDisableResource.class);
		return router;
	}

	@Override
	public String basePath() {
		return "/wm/portblocker";
	}

}
