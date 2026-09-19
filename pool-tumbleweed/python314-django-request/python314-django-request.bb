SUMMARY = "Django statistics app"
DESCRIPTION = "django-request is a statistics module for django. \
It stores requests in a database for admins to see, \
it can also be used to get statistics on who is online etc."
LICENSE = "BSD-2-Clause"

PV = "1.7.1"

RPM_NAME = "python314-django-request-1.7.1-1.2.noarch.rpm"
RPM_HASH = "5aaccea95cda4b432291d29cf9d36d23e7cd0ad02b702b0bf543e919342044371141fe03bfe453cabe173b0599061ee14b0b9893f71483b174dacbf77b50f53e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-request \
python314-django-request \
python3dist-django-request"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-python-dateutil"

inherit rpm
