SUMMARY = "Extensions for Django"
DESCRIPTION = "Django-extensions bundles several useful \
additions for Django projects."
LICENSE = "BSD-3-Clause"

PV = "4.1"

RPM_NAME = "python311-django-extensions-4.1-1.3.noarch.rpm"
RPM_HASH = "48246bdc218c4dc5435bc248bb5f3d1b8972723c0774ce28acfcdfe5f218677457434f92335e0d9af940a8ca9d7a26418d7e6c99173602d2dc109973cc4008af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-django-extensions \
python311-django-extensions \
python3dist-django-extensions"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
