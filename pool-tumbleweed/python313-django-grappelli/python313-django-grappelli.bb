SUMMARY = "A skin for the Django Admin-Interface"
DESCRIPTION = "A jazzy skin for the Django Admin-Interface."
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later"

PV = "5.0.0"

RPM_NAME = "python313-django-grappelli-5.0.0-1.2.noarch.rpm"
RPM_HASH = "7262a10c7a788b8cd99a347b1a033206a01a310a95dbbc751afc6008525e3d2e3686fcbeab3d213ac39629b57bfe6ce8d8ef60608e878bdd7142743b9f97679e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-grappelli \
python3.13dist-django-grappelli \
python313-django-grappelli \
python3dist-django-grappelli"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
