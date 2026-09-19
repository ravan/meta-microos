SUMMARY = "OAuth2 Provider for Django"
DESCRIPTION = "If you are facing one or more of the following: \
* Your Django app exposes a web API you want to protect with OAuth2 authentication, \
* You need to implement an OAuth2 authorization server to provide tokens management for your infrastructure, \
 \
Django OAuth Toolkit can help you providing out of the box all the endpoints, data and logic needed to add OAuth2 capabilities to your Django projects. Django OAuth Toolkit makes extensive use of the excellent OAuthLib, so that everything is rfc-compliant."
LICENSE = "BSD-2-Clause"

PV = "3.4.1"

RPM_NAME = "python314-django-oauth-toolkit-3.4.1-1.1.noarch.rpm"
RPM_HASH = "53c5b305a3a352d2fbafe437b53faba18ca961f1d0a99c0d09e3f7abbc2336e891e009551212a653c3c6159c03394b0cd07419e241314f9f3069ae9110875b6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-oauth-toolkit \
python314-django-oauth-toolkit \
python3dist-django-oauth-toolkit"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-jwcrypto \
python314-oauthlib \
python314-requests"

inherit rpm
