SUMMARY = "Date parsing library designed to parse dates from HTML pages"
DESCRIPTION = "Date parsing library designed to parse dates from HTML pages"
LICENSE = "BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "python314-dateparser-1.4.2-1.1.noarch.rpm"
RPM_HASH = "fcfa5a47110c40fb4286322bab0913ce6034ea6e7044ef90faffd24d16774531891bf53e31e43fe407c318d63ae8c8e309fe015dd35d64c569860281c5431531"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dateparser \
python314-dateparser \
python3dist-dateparser"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-python-dateutil \
python314-pytz \
python314-regex \
python314-tzlocal"

inherit rpm
