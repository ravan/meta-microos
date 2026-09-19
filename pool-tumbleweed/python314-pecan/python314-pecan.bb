SUMMARY = "A WSGI object-dispatching web framework"
DESCRIPTION = "A WSGI object-dispatching web framework."
LICENSE = "BSD-3-Clause"

PV = "1.8.0"

RPM_NAME = "python314-pecan-1.8.0-1.2.noarch.rpm"
RPM_HASH = "1c3876099d53b790d41c21f3680d571e110053ef7c1af6d789cdea33268d6d0593f7f2c15c4ac26564e5978c4f81b03c41bf74c7f79a101853f77d734576f4cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pecan \
python314-pecan \
python3dist-pecan"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Mako \
python314-WebOb \
python314-WebTest \
python314-setuptools"

inherit rpm
