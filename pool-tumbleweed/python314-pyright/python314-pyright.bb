SUMMARY = "Command line wrapper for pyright"
DESCRIPTION = "Command line wrapper for pyright"
LICENSE = "MIT"

PV = "1.1.411"

RPM_NAME = "python314-pyright-1.1.411-3.1.noarch.rpm"
RPM_HASH = "b6f9ab61f5606ae6284e4312c1425312388fb1dbf56cc3aaf1c61517a3ef496a3c18b6961f8aa8b2d30fb43db6b7813d5a89c5f774347317e27d1a9acde37d0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyright \
python314-pyright \
python3dist-pyright"

RDEPENDS:${PN} += "/usr/bin/node \
/usr/bin/python3.14 \
/usr/bin/sh \
alts \
nodejs \
nodejs-common \
python-abi"

inherit rpm
