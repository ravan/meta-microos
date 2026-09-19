SUMMARY = "OAuth2 Provider for Django"
DESCRIPTION = "If you are facing one or more of the following: \
* Your Django app exposes a web API you want to protect with OAuth2 authentication, \
* You need to implement an OAuth2 authorization server to provide tokens management for your infrastructure, \
 \
Django OAuth Toolkit can help you providing out of the box all the endpoints, data and logic needed to add OAuth2 capabilities to your Django projects. Django OAuth Toolkit makes extensive use of the excellent OAuthLib, so that everything is rfc-compliant."
LICENSE = "BSD-2-Clause"

PV = "3.4.1"

RPM_NAME = "python313-django-oauth-toolkit-3.4.1-1.1.noarch.rpm"
RPM_HASH = "0b4ddf03c9e4f5c58fbe150173837c6211550d66839a585291dc7a198b55fda8d06a63fc5b79d80475e887db84f1fc92c56e25d0cc50b04bdd6048d58cf400e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-oauth-toolkit \
python3.13dist-django-oauth-toolkit \
python313-django-oauth-toolkit \
python3dist-django-oauth-toolkit"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-jwcrypto \
python313-oauthlib \
python313-requests"

inherit rpm
