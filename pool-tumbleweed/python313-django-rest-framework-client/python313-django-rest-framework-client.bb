SUMMARY = "Python client for a Django REST Framework based web site"
DESCRIPTION = "Python client for a Django REST Framework based web site."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python313-django-rest-framework-client-0.13.0-1.3.noarch.rpm"
RPM_HASH = "5e567e0dc8a51ffe0601fa9e987ecdb2eaa38982bfffe0058a5dd6354245e1f3070ddc0fc709c098a77135efa8e2573e640d6d77c41b6fba4e6d015d76074bec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-rest-framework-client \
python3.13dist-django-rest-framework-client \
python313-django-rest-framework-client \
python3dist-django-rest-framework-client"

RDEPENDS:${PN} += "python-abi \
python313-httpx \
python313-requests \
python313-respx"

inherit rpm
