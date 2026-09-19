SUMMARY = "A non-persistent in-memory data storage backend for Django"
DESCRIPTION = "An in-memory data storage backend for Django. \
 \
Compatible with Django's storage API."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python313-django-dj-inmemorystorage-2.1.0-5.5.noarch.rpm"
RPM_HASH = "f643d4a15bb5f62c19eb57491cbe3b66f3f5d31d468c41dc10b39296971904aa904bceba1bf4dac01eafbeae2b1a4c7122cd50981a30c9d08a19c1dca975ea71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-dj-inmemorystorage \
python3.13dist-dj-inmemorystorage \
python313-django-dj-inmemorystorage \
python3dist-dj-inmemorystorage"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-six"

inherit rpm
