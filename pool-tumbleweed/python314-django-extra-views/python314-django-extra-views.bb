SUMMARY = "Extra class-based views for Django"
DESCRIPTION = "Extra class-based views for Django."
LICENSE = "MIT"

PV = "0.15.0"

RPM_NAME = "python314-django-extra-views-0.15.0-2.5.noarch.rpm"
RPM_HASH = "1958ba369bc5cc404624d6e2d24af5e80a6843b4dc9e23dfc26e87b6a6cb38beae5edbf52fb0a02c0e61f358bb8e4e351d8284bd2bd2a63458ea3006b2ff8a1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-extra-views \
python314-django-extra-views \
python3dist-django-extra-views"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
