SUMMARY = "Provides a country field for Django models"
DESCRIPTION = "Provides a country field for Django models, including \
support for Django REST Framework."
LICENSE = "MIT"

PV = "8.2.0"

RPM_NAME = "python313-django-countries-8.2.0-1.4.noarch.rpm"
RPM_HASH = "0a4f98ddb57eb10c9b2bb8621838bde11f10a9d26e9d2710298004a889c9954bda2b5604fc9bd81cd77d9f8880f65acae65fa2c5db9eb3d68ca356263197614b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-countries \
python3.13dist-django-countries \
python313-django-countries \
python3dist-django-countries"

RDEPENDS:${PN} += "/usr/bin/env \
python-abi \
python313-Django \
python313-typing-extensions"

inherit rpm
