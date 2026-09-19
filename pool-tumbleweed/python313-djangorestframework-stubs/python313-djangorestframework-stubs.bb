SUMMARY = "PEP-484 stubs for django-rest-framework"
DESCRIPTION = "Mypy stubs for Django REST Framework. Supports Python 3.10 and up."
LICENSE = "MIT"

PV = "3.18.1"

RPM_NAME = "python313-djangorestframework-stubs-3.18.1-1.1.noarch.rpm"
RPM_HASH = "176e14a16ea13f4e346dae0c54754842d87ccabf0a36ba914910c60272225e551d0e021ac5cc28a4a046ff833158b5d33c611c9e27f90ab5169dad8ad18dd0c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-djangorestframework-stubs \
python3.13dist-djangorestframework-stubs \
python313-djangorestframework-stubs \
python3dist-djangorestframework-stubs"

RDEPENDS:${PN} += "python-abi \
python313-django-stubs \
python313-types-PyYAML \
python313-typing-extensions"

inherit rpm
