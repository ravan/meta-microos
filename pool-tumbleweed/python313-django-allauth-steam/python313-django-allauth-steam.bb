SUMMARY = "Django allauth - Steam provider (OpenID-compliant)"
DESCRIPTION = "Python extra dependency `steam` for python-django-allauth."
LICENSE = "MIT"

PV = "65.19.1"

RPM_NAME = "python313-django-allauth-steam-65.19.1-1.1.noarch.rpm"
RPM_HASH = "c061dd2872a9bcede88974c0ea3da0b7e026cea9e226e7ebbc7201f3ca6e91708c4baa40cdb7b248bff529456fc6d083c96aa808248def684bafa0a35481dbd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-allauth-steam \
python313-django-allauth-steam"

RDEPENDS:${PN} += "python313-django-allauth \
python313-python3-openid"

inherit rpm
