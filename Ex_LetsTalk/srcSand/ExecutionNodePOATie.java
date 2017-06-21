/**
 * ExecutionNodePOATie.java . Generated by the IDL-to-Java compiler (portable),
 * version "3.2" from deployment.idl Saturday, December 10, 2005 1:24:06 AM GMT
 */

public class ExecutionNodePOATie extends ExecutionNodePOA {

	// Constructors

	public ExecutionNodePOATie(ExecutionNodeOperations delegate) {
		this._impl = delegate;
	}

	public ExecutionNodePOATie(ExecutionNodeOperations delegate,
			org.omg.PortableServer.POA poa) {
		this._impl = delegate;
		this._poa = poa;
	}

	public ExecutionNodeOperations _delegate() {
		return this._impl;
	}

	public void _delegate(ExecutionNodeOperations delegate) {
		this._impl = delegate;
	}

	public org.omg.PortableServer.POA _default_POA() {
		if (_poa != null) {
			return _poa;
		} else {
			return super._default_POA();
		}
	}

	public String name() {
		return _impl.name();
	} // name

	public void startContainer(ContainerDescription container) {
		_impl.startContainer(container);
	} // startContainer

	public ContainerDescription[] getContainers() {
		return _impl.getContainers();
	} // getContainers

	private ExecutionNodeOperations _impl;

	private org.omg.PortableServer.POA _poa;

} // class ExecutionNodePOATie