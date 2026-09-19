SUMMARY = "International phone number field for django models"
DESCRIPTION = "An international phone number field for django models."
LICENSE = "MIT"

PV = "8.4.0"

RPM_NAME = "python314-django-phonenumber-field-8.4.0-1.4.noarch.rpm"
RPM_HASH = "1bd68dabfa7591106deb0694374c660f92457dc37c141e48afe115ce0c3a8d20c40106b9a15dfe0b02a224ee4ad569daf18fd2f0e8d741b88711b7d35869a5f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-phonenumber-field \
python314-django-phonenumber-field \
python3dist-django-phonenumber-field"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
