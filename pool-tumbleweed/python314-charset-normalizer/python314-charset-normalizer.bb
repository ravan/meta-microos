SUMMARY = "Python Universal Charset detector"
DESCRIPTION = "Python Universal Charset detector."
LICENSE = "MIT"

PV = "3.4.9"

RPM_NAME = "python314-charset-normalizer-3.4.9-1.1.noarch.rpm"
RPM_HASH = "b07de972723cb5ce87f382c3b27bdc3fa7707d749cece8e9f94e6d0b9a667823db35ea13a601ceafb8bcbed6cbded151528907321f11814954e7f23c31dde4f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-charset-normalizer \
python314-charset-normalizer \
python3dist-charset-normalizer"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
