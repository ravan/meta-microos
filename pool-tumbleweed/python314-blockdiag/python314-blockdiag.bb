SUMMARY = "Program to generate block-diagram images from text"
DESCRIPTION = "The blockdiag package generates block-diagram image files \
from spec-text files."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python314-blockdiag-3.0.0-6.5.noarch.rpm"
RPM_HASH = "7b9c132ac454ce51af9c74fbb6558efddcad149dd1b89862e34e25819992d67a727611ffc1b3972d6b6e80e7c05cfc4399c829cbc8c756db25c66dae6c3be812"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-blockdiag \
python314-blockdiag \
python3dist-blockdiag"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Pillow \
python314-funcparserlib \
python314-setuptools \
python314-webcolors"

inherit rpm
