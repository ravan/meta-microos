SUMMARY = "A webservice API framework layer for Django"
DESCRIPTION = "Tastypie is a webservice API framework for Django. It provides a \
customizable abstraction for creating REST-style interfaces."
LICENSE = "BSD-3-Clause"

PV = "0.15.1"

RPM_NAME = "python314-django-tastypie-0.15.1-1.5.noarch.rpm"
RPM_HASH = "ee8b7ec013eb1ae1ed14b6f244685ca3f32811dcb8a2755424039691f3ddc98c551e04402d4627f30de89029e311ea018260776b7e091f1fc6c55e6d77db9cbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-tastypie \
python314-django-tastypie \
python3dist-django-tastypie"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-python-dateutil \
python314-python-mimeparse"

inherit rpm
