SUMMARY = "Django allauth - Identity Provider"
DESCRIPTION = "Python extra dependency `idp-oidc` for python-django-allauth."
LICENSE = "MIT"

PV = "65.19.1"

RPM_NAME = "python314-django-allauth-idp-oidc-65.19.1-1.1.noarch.rpm"
RPM_HASH = "bfe6fd9416106f365cdbeeede0645ad096ea40f5324e8e662803589340c32d8290dabbdea51c43c2691f5a4281a4820164c231985297c7c04e6cc7eeb5b3102b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-django-allauth-idp-oidc"

RDEPENDS:${PN} += "python314-PyJWT \
python314-cryptography \
python314-django-allauth \
python314-oauthlib"

inherit rpm
