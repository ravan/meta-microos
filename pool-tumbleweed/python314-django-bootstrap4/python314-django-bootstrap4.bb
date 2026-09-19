SUMMARY = "Bootstrap support for Django projects"
DESCRIPTION = "Bootstrap support for Django projects."
LICENSE = "BSD-3-Clause"

PV = "26.1"

RPM_NAME = "python314-django-bootstrap4-26.1-1.3.noarch.rpm"
RPM_HASH = "608167d4b2318689955511b787c94bf543e2c9351c06950b427104fb73cfd0e7bf2eb0ce9bf2bf535b61af220d9fa7acce68ba1cd22c2b58932afb07708eeec1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-bootstrap4 \
python314-django-bootstrap4 \
python3dist-django-bootstrap4"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-beautifulsoup4"

inherit rpm
