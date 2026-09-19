SUMMARY = "Bootstrap support for Django projects"
DESCRIPTION = "Bootstrap support for Django projects."
LICENSE = "BSD-3-Clause"

PV = "26.1"

RPM_NAME = "python313-django-bootstrap4-26.1-1.3.noarch.rpm"
RPM_HASH = "1695991777ba14ed565a4ad79e69528d4c3ae988c57b7531572beec8467dd82fc66412630fa85e0904aa8ea17443b009ba528615abf9d78ecdbc3f55fb2a38a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-bootstrap4 \
python3.13dist-django-bootstrap4 \
python313-django-bootstrap4 \
python3dist-django-bootstrap4"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-beautifulsoup4"

inherit rpm
