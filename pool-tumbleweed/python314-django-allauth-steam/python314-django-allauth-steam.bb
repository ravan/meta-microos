SUMMARY = "Django allauth - Steam provider (OpenID-compliant)"
DESCRIPTION = "Python extra dependency `steam` for python-django-allauth."
LICENSE = "MIT"

PV = "65.19.1"

RPM_NAME = "python314-django-allauth-steam-65.19.1-1.1.noarch.rpm"
RPM_HASH = "9cfcc3439e6b1ada52ae50d53b66f3a7559a45f4adde1dc681b61c4a931fd9f33751f4d806608f92058606c43e5c57b72425bd700b57db1a68c9ff051a2cbf83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-django-allauth-steam"

RDEPENDS:${PN} += "python314-django-allauth \
python314-python3-openid"

inherit rpm
