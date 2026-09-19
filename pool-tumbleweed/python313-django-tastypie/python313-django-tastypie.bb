SUMMARY = "A webservice API framework layer for Django"
DESCRIPTION = "Tastypie is a webservice API framework for Django. It provides a \
customizable abstraction for creating REST-style interfaces."
LICENSE = "BSD-3-Clause"

PV = "0.15.1"

RPM_NAME = "python313-django-tastypie-0.15.1-1.5.noarch.rpm"
RPM_HASH = "ecd2057fe3beeef5505fab2dca98a46ad6d9f57bcb195f353b2cfd68ae6cd62ac5b10a3c54610456cd352351999443e05762323f4e5fa8be43a63bcd3f8f7865"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-tastypie \
python3.13dist-django-tastypie \
python313-django-tastypie \
python3dist-django-tastypie"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-python-dateutil \
python313-python-mimeparse"

inherit rpm
