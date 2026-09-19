SUMMARY = "A set of Django REST API endpoints to handle invitations"
DESCRIPTION = "A set of Django REST API endpoints to handle invitations."
LICENSE = "GPL-3.0-only"

PV = "0.1.2"

RPM_NAME = "python313-django-rest-invitations-0.1.2-3.5.noarch.rpm"
RPM_HASH = "d995d82e166e7ad271992f72167587ac9070e7d96e1f656a1d802ba88ee699d8f5eaa455ab65196693c904fb0c537cf5c9c7d4e1b20f1d079df1274b3c5c64c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-rest-invitations \
python3.13dist-django-rest-invitations \
python313-django-rest-invitations \
python3dist-django-rest-invitations"

RDEPENDS:${PN} += "python-abi \
python313-django-invitations \
python313-djangorestframework"

inherit rpm
