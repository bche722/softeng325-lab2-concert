package nz.ac.auckland.concert.services;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/services")
public class ConcertApplication extends Application{
	private Set<Class<?>> _classes = new HashSet<Class<?>>();
	private Set<Object> _singletons = new HashSet<Object>();

	public ConcertApplication() {
		_classes.add(SerializationMessageBodyReaderAndWriter.class);
		_singletons.add(new ConcertResource());
	}
	@Override
	public Set<Class<?>> getClasses() {
		return _classes;
	}

	@Override
	public Set<Object> getSingletons()
	{
		return _singletons;
	}
}
