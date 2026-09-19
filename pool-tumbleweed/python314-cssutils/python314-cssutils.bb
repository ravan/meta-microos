SUMMARY = "A CSS Cascading Style Sheets library for Python"
DESCRIPTION = "A Python package to parse and build CSS Cascading Style Sheets. DOM only, not any rendering facilities!"
LICENSE = "LGPL-3.0-or-later"

PV = "2.15.0"

RPM_NAME = "python314-cssutils-2.15.0-1.2.noarch.rpm"
RPM_HASH = "245370d11a62638546e83a1e253a20d4a9bf56a6432a238721b254bb54540ca98a8bfbfa775401fa105748155c7dc20fa35b4488d6f3987bee5baf4725f45d4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cssutils \
python314-cssutils \
python3dist-cssutils"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-encutils \
python314-more-itertools"

inherit rpm
