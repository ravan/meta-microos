SUMMARY = "OpenID Connect Identity (OIDC) and OAuth 2.0 Provider with Pluggable Connectors"
DESCRIPTION = "Dex is an identity service that uses OpenID Connect to drive authentication for other apps. \
 \
Dex is NOT a user-management system, but acts as a portal to other identity providers through 'connectors.' \
This lets dex defer authentication to LDAP servers, SAML providers, or established identity providers like \
GitHub, Google, and Active Directory. Clients write their authentication logic once to talk to dex, then \
dex handles the protocols for a given backend."
LICENSE = "Apache-2.0"

PV = "2.35.3"

RPM_NAME = "dex-oidc-2.35.3-1.21.aarch64.rpm"
RPM_HASH = "2507ec6ce27a114afb38e156a92246aa85fa921b7f815ac6e907080e488c8935e3f68fda5ef8f17f45d54f5e6985860e147a6f076a6acc7cb4857933c17e9c42"

RPROVIDES:${PN} += "caasp-dex \
dex-oidc"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/touch \
fillup"

inherit rpm
