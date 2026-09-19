SUMMARY = "Django allauth - OpenID provider"
DESCRIPTION = "Python extra dependency `openid` for python-django-allauth."
LICENSE = "MIT"

PV = "65.19.1"

RPM_NAME = "python313-django-allauth-openid-65.19.1-1.1.noarch.rpm"
RPM_HASH = "8bef35820cd3d6ec545b5c0a6d491cc295309ddf235eb71c69e5610dc03e14bbcc5accf632fe42c4237a69809d9bcdbb039d5de7625ed19cb2d7dabb8010b3f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-allauth-openid \
python313-django-allauth-openid"

RDEPENDS:${PN} += "python313-django-allauth \
python313-python3-openid"

inherit rpm
