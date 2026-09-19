SUMMARY = "Django app providing database and form fields for pytz timezone objects"
DESCRIPTION = "A Django app providing database and form fields for pytz timezone objects."
LICENSE = "BSD-2-Clause"

PV = "7.2.2"

RPM_NAME = "python314-django-timezone-field-7.2.2-1.1.noarch.rpm"
RPM_HASH = "9d3284d48461305e6280751e74db06ff4d28606de8b4baea65cb0139fb4e0cf8f8371e708627dbe5216157d0f89602051a3842abce05444eddbdbe87db29cf51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-timezone-field \
python314-django-timezone-field \
python3dist-django-timezone-field"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
