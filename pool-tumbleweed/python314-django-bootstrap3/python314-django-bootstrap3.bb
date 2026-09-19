SUMMARY = "Bootstrap support for Django projects"
DESCRIPTION = "Bootstrap support for Django projects."
LICENSE = "BSD-3-Clause"

PV = "26.1"

RPM_NAME = "python314-django-bootstrap3-26.1-1.3.noarch.rpm"
RPM_HASH = "27e54a0493369634dd4a986f64d419ae0839255967548ccba0b6935f1802e5b4c1e7cb541f61dd4b018cd2963bdee96139067bd5faafe72cb025ac7db6bf8584"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-bootstrap3 \
python314-django-bootstrap3 \
python3dist-django-bootstrap3"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
