SUMMARY = "Keep track of failed login attempts in Django-powered sites"
DESCRIPTION = "Keep track of failed login attempts in Django-powered sites."
LICENSE = "MIT"

PV = "8.3.1"

RPM_NAME = "python314-django-axes-8.3.1-1.3.noarch.rpm"
RPM_HASH = "69a6268a03dababcdd2e0dd2f4373fca700202cab295c97617e3aabc9caf084f9d919f1317536e992e64e8b424e2e6df8eac910622302655671a31c130024129"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-axes \
python314-django-axes \
python3dist-django-axes"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-asgiref"

inherit rpm
