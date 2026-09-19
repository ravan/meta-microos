SUMMARY = "Program used to verify the code of your python project"
DESCRIPTION = "Inspektor is a program used to verify the code of a Python project. \
It checks code with the help of pylint, checks indentation with \
pycodestyle, and checks for PEP8 compliance. \
 \
Inspektor can work with Git and SVN checkouts."
LICENSE = "GPL-2.0-only"

PV = "0.5.3"

RPM_NAME = "python3-inspektor-0.5.3-1.2.noarch.rpm"
RPM_HASH = "ccf27b62c599eac2a98b62248bab96556cf91bbf674047012948a604d37c9b01723d430f41d51a818609367f2f38aa44a7ed30012a46a1312128eba6955689a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-inspektor \
python3.13dist-inspektor \
python3dist-inspektor"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python3-cliff \
python3-pycodestyle \
python3-pylint \
python3-six \
update-alternatives"

inherit rpm
