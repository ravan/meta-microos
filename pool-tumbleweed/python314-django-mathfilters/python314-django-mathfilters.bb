SUMMARY = "Django math filters"
DESCRIPTION = "A set of math filters for Django."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-django-mathfilters-1.0.0-3.5.noarch.rpm"
RPM_HASH = "a2b9ebab139070a84e61e9d50565f1b073f7d74088326c82cfb9464ac8c261e31569f8c0ea066de5759c5f1b794a3d687f7486fa50e3f8dafb99ad8d2bc9dede"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-mathfilters \
python314-django-mathfilters \
python3dist-django-mathfilters"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
