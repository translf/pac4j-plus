package org.pac4j.openid.profile.yahoo;

import java.util.Locale;

import org.pac4j.core.profile.AttributesDefinition;
import org.pac4j.openid.client.YahooOpenIdClient;
import org.pac4j.openid.profile.OpenIdProfile;

/**
 * <p>This class is the user profile for Yahoo using OpenID with appropriate getters.</p>
 * <p>It is returned by the {@link YahooOpenIdClient}.</p>
 *
 * @author Patrice de Saint Steban
 * @since 1.6.0
 */
public class YahooOpenIdProfile extends OpenIdProfile {
    
    private static final long serialVersionUID = 7866288887408897456L;

    private transient final static AttributesDefinition ATTRIBUTES_DEFINITION = new YahooOpenIdAttributesDefinition();

    @Override
    public AttributesDefinition getAttributesDefinition() {
        return ATTRIBUTES_DEFINITION;
    }
    
    @Override
    public Locale getLocale() {
        return (Locale) getAttribute(YahooOpenIdAttributesDefinition.LANGUAGE);
    }
    
    @Override
    public String getDisplayName() {
        return (String) getAttribute(YahooOpenIdAttributesDefinition.FULLNAME);
    }
}
