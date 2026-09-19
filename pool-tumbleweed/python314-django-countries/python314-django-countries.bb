SUMMARY = "Provides a country field for Django models"
DESCRIPTION = "Provides a country field for Django models, including \
support for Django REST Framework."
LICENSE = "MIT"

PV = "8.2.0"

RPM_NAME = "python314-django-countries-8.2.0-1.4.noarch.rpm"
RPM_HASH = "9684957a9c75c8c966bd17a15e38aec3a739ed5ee98c4c02cda7d484c828f80269f950057391f1147420b729a0c1afa2b005ec0e52e95e9c2c39cce4908bb072"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-countries \
python314-django-countries \
python3dist-django-countries"

RDEPENDS:${PN} += "/usr/bin/env \
python-abi \
python314-Django \
python314-typing-extensions"

inherit rpm
