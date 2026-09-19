SUMMARY = "Pure python implementation of magic file detection"
DESCRIPTION = "Pure python implementation of magic file detection"
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python314-puremagic-2.2.0-2.2.noarch.rpm"
RPM_HASH = "c029c5fccea1165ccb14e69ede753f7c5af0637fff3094371a1bb15272db6d17b5c00ed30b2d0f9e5e0bba2336b7342a82e130df8b86c59dd80a9d226c201fd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-puremagic \
python314-puremagic \
python3dist-puremagic"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
