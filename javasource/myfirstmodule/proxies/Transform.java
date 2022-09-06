// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Transform
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject transformMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Transform";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		OutputFileName("OutputFileName"),
		Transform_Xslt("MyFirstModule.Transform_Xslt"),
		Transform_Xml("MyFirstModule.Transform_Xml");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Transform(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Transform"));
	}

	protected Transform(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject transformMendixObject)
	{
		if (transformMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Transform", transformMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Transform");

		this.transformMendixObject = transformMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Transform.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.Transform initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Transform.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Transform initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Transform(context, mendixObject);
	}

	public static myfirstmodule.proxies.Transform load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Transform.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of OutputFileName
	 */
	public final java.lang.String getOutputFileName()
	{
		return getOutputFileName(getContext());
	}

	/**
	 * @param context
	 * @return value of OutputFileName
	 */
	public final java.lang.String getOutputFileName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.OutputFileName.toString());
	}

	/**
	 * Set value of OutputFileName
	 * @param outputfilename
	 */
	public final void setOutputFileName(java.lang.String outputfilename)
	{
		setOutputFileName(getContext(), outputfilename);
	}

	/**
	 * Set value of OutputFileName
	 * @param context
	 * @param outputfilename
	 */
	public final void setOutputFileName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String outputfilename)
	{
		getMendixObject().setValue(context, MemberNames.OutputFileName.toString(), outputfilename);
	}

	/**
	 * @return value of Transform_Xslt
	 */
	public final myfirstmodule.proxies.Xslt getTransform_Xslt() throws com.mendix.core.CoreException
	{
		return getTransform_Xslt(getContext());
	}

	/**
	 * @param context
	 * @return value of Transform_Xslt
	 */
	public final myfirstmodule.proxies.Xslt getTransform_Xslt(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Xslt result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Transform_Xslt.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Xslt.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Transform_Xslt
	 * @param transform_xslt
	 */
	public final void setTransform_Xslt(myfirstmodule.proxies.Xslt transform_xslt)
	{
		setTransform_Xslt(getContext(), transform_xslt);
	}

	/**
	 * Set value of Transform_Xslt
	 * @param context
	 * @param transform_xslt
	 */
	public final void setTransform_Xslt(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Xslt transform_xslt)
	{
		if (transform_xslt == null)
			getMendixObject().setValue(context, MemberNames.Transform_Xslt.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Transform_Xslt.toString(), transform_xslt.getMendixObject().getId());
	}

	/**
	 * @return value of Transform_Xml
	 */
	public final myfirstmodule.proxies.Xml getTransform_Xml() throws com.mendix.core.CoreException
	{
		return getTransform_Xml(getContext());
	}

	/**
	 * @param context
	 * @return value of Transform_Xml
	 */
	public final myfirstmodule.proxies.Xml getTransform_Xml(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Xml result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Transform_Xml.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Xml.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Transform_Xml
	 * @param transform_xml
	 */
	public final void setTransform_Xml(myfirstmodule.proxies.Xml transform_xml)
	{
		setTransform_Xml(getContext(), transform_xml);
	}

	/**
	 * Set value of Transform_Xml
	 * @param context
	 * @param transform_xml
	 */
	public final void setTransform_Xml(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Xml transform_xml)
	{
		if (transform_xml == null)
			getMendixObject().setValue(context, MemberNames.Transform_Xml.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Transform_Xml.toString(), transform_xml.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return transformMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.Transform that = (myfirstmodule.proxies.Transform) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MyFirstModule.Transform";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
