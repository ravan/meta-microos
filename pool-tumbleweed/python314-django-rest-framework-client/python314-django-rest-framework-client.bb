SUMMARY = "Python client for a Django REST Framework based web site"
DESCRIPTION = "Python client for a Django REST Framework based web site."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python314-django-rest-framework-client-0.13.0-1.3.noarch.rpm"
RPM_HASH = "03fb5c634ed949f6ae06df85c0403dbd4a7ad230c0f0571270bbe9dbecd11d18972559d3c5aca885d5e1984b7a36df9c14f33ca3a7412274372abd29d8130aa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-rest-framework-client \
python314-django-rest-framework-client \
python3dist-django-rest-framework-client"

RDEPENDS:${PN} += "python-abi \
python314-httpx \
python314-requests \
python314-respx"

inherit rpm
