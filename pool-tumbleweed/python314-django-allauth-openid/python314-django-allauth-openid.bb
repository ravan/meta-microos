SUMMARY = "Django allauth - OpenID provider"
DESCRIPTION = "Python extra dependency `openid` for python-django-allauth."
LICENSE = "MIT"

PV = "65.19.1"

RPM_NAME = "python314-django-allauth-openid-65.19.1-1.1.noarch.rpm"
RPM_HASH = "58910931c052e83025e53542b89013c5b328d633a3f57882491ac19aaed693e2fa2a56ab153b26408650131518a33ccaa9e7806ad58bb37306a75338c698019f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-django-allauth-openid"

RDEPENDS:${PN} += "python314-django-allauth \
python314-python3-openid"

inherit rpm
