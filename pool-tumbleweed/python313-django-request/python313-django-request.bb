SUMMARY = "Django statistics app"
DESCRIPTION = "django-request is a statistics module for django. \
It stores requests in a database for admins to see, \
it can also be used to get statistics on who is online etc."
LICENSE = "BSD-2-Clause"

PV = "1.7.1"

RPM_NAME = "python313-django-request-1.7.1-1.2.noarch.rpm"
RPM_HASH = "ce18dec5c45eb5a4debe5cefb2c079f9ff2ace40d50fe7abb947e3b5c7222f2445334f866c2cd027c8f2e779dd7c79b5a9a572ee4a43a6b5fb9eab367933d6db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-request \
python3.13dist-django-request \
python313-django-request \
python3dist-django-request"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-python-dateutil"

inherit rpm
