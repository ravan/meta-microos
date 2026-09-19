SUMMARY = "Django model field that can hold a geoposition"
DESCRIPTION = "Django model field that can hold a geoposition, and corresponding admin widget."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python313-django-geoposition-0.3.0-3.9.noarch.rpm"
RPM_HASH = "adfc06e86be6caacdb2327253b445cf78bfeecea746cddfed5b2bf2d4b8e9fbb9fb80964cb2dd47cebf5bc72d72a14ec65e2e7b3d8db71100c57ce41620e1608"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-geoposition \
python3.13dist-django-geoposition \
python313-django-geoposition \
python3dist-django-geoposition"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
