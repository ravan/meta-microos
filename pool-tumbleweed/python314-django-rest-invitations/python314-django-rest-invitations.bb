SUMMARY = "A set of Django REST API endpoints to handle invitations"
DESCRIPTION = "A set of Django REST API endpoints to handle invitations."
LICENSE = "GPL-3.0-only"

PV = "0.1.2"

RPM_NAME = "python314-django-rest-invitations-0.1.2-3.5.noarch.rpm"
RPM_HASH = "ff6688b796cc1785851dda220d55de17f3994cd27353f58638c2961cc983a395ea48a689de80574a0c4fa5368ab7ab5f36d61f95b50ee394750aacaee15aa9b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-rest-invitations \
python314-django-rest-invitations \
python3dist-django-rest-invitations"

RDEPENDS:${PN} += "python-abi \
python314-django-invitations \
python314-djangorestframework"

inherit rpm
