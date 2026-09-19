SUMMARY = "Extensions for Django"
DESCRIPTION = "Django-extensions bundles several useful \
additions for Django projects."
LICENSE = "BSD-3-Clause"

PV = "4.1"

RPM_NAME = "python314-django-extensions-4.1-2.1.noarch.rpm"
RPM_HASH = "300631d5bc70985de5d3e273aa1a6c94d448e8553dfdec20bbe10f79bf0c088cd08140d03fefa0ae6af6943dd75dfa51bfe8c7ccd3cc0e300eac1c4f6c4fae55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-extensions \
python314-django-extensions \
python3dist-django-extensions"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
