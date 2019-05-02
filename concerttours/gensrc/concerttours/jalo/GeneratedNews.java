/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 18 mars 2019 17:04:42                       ---
 * ----------------------------------------------------------------
 */
package concerttours.jalo;

import concerttours.constants.ConcerttoursConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem News}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedNews extends GenericItem
{
	/** Qualifier of the <code>News.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>News.headline</code> attribute **/
	public static final String HEADLINE = "headline";
	/** Qualifier of the <code>News.content</code> attribute **/
	public static final String CONTENT = "content";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DATE, AttributeMode.INITIAL);
		tmp.put(HEADLINE, AttributeMode.INITIAL);
		tmp.put(CONTENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>News.content</code> attribute.
	 * @return the content - fuller description of the news item
	 */
	public String getContent(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>News.content</code> attribute.
	 * @return the content - fuller description of the news item
	 */
	public String getContent()
	{
		return getContent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>News.content</code> attribute. 
	 * @param value the content - fuller description of the news item
	 */
	public void setContent(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>News.content</code> attribute. 
	 * @param value the content - fuller description of the news item
	 */
	public void setContent(final String value)
	{
		setContent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>News.date</code> attribute.
	 * @return the date - date of news item
	 */
	public Date getDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>News.date</code> attribute.
	 * @return the date - date of news item
	 */
	public Date getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>News.date</code> attribute. 
	 * @param value the date - date of news item
	 */
	public void setDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>News.date</code> attribute. 
	 * @param value the date - date of news item
	 */
	public void setDate(final Date value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>News.headline</code> attribute.
	 * @return the headline - short headline for the news item
	 */
	public String getHeadline(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HEADLINE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>News.headline</code> attribute.
	 * @return the headline - short headline for the news item
	 */
	public String getHeadline()
	{
		return getHeadline( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>News.headline</code> attribute. 
	 * @param value the headline - short headline for the news item
	 */
	public void setHeadline(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HEADLINE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>News.headline</code> attribute. 
	 * @param value the headline - short headline for the news item
	 */
	public void setHeadline(final String value)
	{
		setHeadline( getSession().getSessionContext(), value );
	}
	
}
