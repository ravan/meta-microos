SUMMARY = "International phone number field for django models"
DESCRIPTION = "An international phone number field for django models."
LICENSE = "MIT"

PV = "8.4.0"

RPM_NAME = "python313-django-phonenumber-field-8.4.0-1.4.noarch.rpm"
RPM_HASH = "138239405d1b80bfb14033e49bc2ab8dbc69cec9001fa48a4864bed854cdb88eab12f6450dc3f3cd27f355823c61e4395584b9d482af50491d7e0ba3f1b0444c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-phonenumber-field \
python3.13dist-django-phonenumber-field \
python313-django-phonenumber-field \
python3dist-django-phonenumber-field"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
