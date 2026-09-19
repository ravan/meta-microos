SUMMARY = "A CSS Cascading Style Sheets library for Python"
DESCRIPTION = "A Python package to parse and build CSS Cascading Style Sheets. DOM only, not any rendering facilities!"
LICENSE = "LGPL-3.0-or-later"

PV = "2.15.0"

RPM_NAME = "python313-cssutils-2.15.0-1.2.noarch.rpm"
RPM_HASH = "b6c7f5318fd4fef2fd00e38daea2cd3219d1b017f34e922c0f9b5ce30a20838e7ffc347b62c4a27eed71c649f42879869d3275a999e9857fbc3c73d0af3b3026"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cssutils \
python3.13dist-cssutils \
python313-cssutils \
python3dist-cssutils"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-encutils \
python313-more-itertools"

inherit rpm
