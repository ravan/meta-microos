SUMMARY = "A non-persistent in-memory data storage backend for Django"
DESCRIPTION = "An in-memory data storage backend for Django. \
 \
Compatible with Django's storage API."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python314-django-dj-inmemorystorage-2.1.0-5.5.noarch.rpm"
RPM_HASH = "e175784928d46d7583d67cc21500656da027ed9e93aedd476939fd5a2144f4d3a8626cd735fafb5491c263405db1db0fb2f92473a6f89e15ef35c748feffe76d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dj-inmemorystorage \
python314-django-dj-inmemorystorage \
python3dist-dj-inmemorystorage"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-six"

inherit rpm
