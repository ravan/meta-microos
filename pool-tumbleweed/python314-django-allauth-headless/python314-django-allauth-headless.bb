SUMMARY = "Django allauth - Headless"
DESCRIPTION = "Python extra dependency `headless-spec` for python-django-allauth."
LICENSE = "MIT"

PV = "65.19.1"

RPM_NAME = "python314-django-allauth-headless-65.19.1-1.1.noarch.rpm"
RPM_HASH = "e56b5f1316bf216d049409968a6840acc338aee78ac2a610abaaaae7b727aa3c85c66c2dcc6826272cbce38a5646caa2fcccc407b47369699c3789d6fa6df4c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-django-allauth-headless"

RDEPENDS:${PN} += "python314-PyYAML \
python314-django-allauth"

inherit rpm
