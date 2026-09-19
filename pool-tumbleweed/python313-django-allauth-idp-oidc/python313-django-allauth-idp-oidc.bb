SUMMARY = "Django allauth - Identity Provider"
DESCRIPTION = "Python extra dependency `idp-oidc` for python-django-allauth."
LICENSE = "MIT"

PV = "65.19.1"

RPM_NAME = "python313-django-allauth-idp-oidc-65.19.1-1.1.noarch.rpm"
RPM_HASH = "849c02a8a83db1e3ce7cb5ccac72b754d65462a9a98d866a4445061a036e19d70301d495d1e6196f7a9cf509d6af882fea5eb9299db63acd27d2304cd3f9eab0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-allauth-idp-oidc \
python313-django-allauth-idp-oidc"

RDEPENDS:${PN} += "python313-PyJWT \
python313-cryptography \
python313-django-allauth \
python313-oauthlib"

inherit rpm
