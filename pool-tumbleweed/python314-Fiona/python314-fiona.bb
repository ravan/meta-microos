SUMMARY = "Module for reading and writing spatial data files"
DESCRIPTION = "Fiona is OGR's spatial data API for Python programmers."
LICENSE = "BSD-3-Clause"

PV = "1.10.1"

RPM_NAME = "python314-Fiona-1.10.1-3.1.aarch64.rpm"
RPM_HASH = "b7479dc8b57e19201c506d3fd224c2a3a01fc38572db555cdaa2676bfe48d70c390adbdb96f1c9b02bd4ccd86ce6746c56594c7e18c80affe441905c541d5c69"

RPROVIDES:${PN} += "python3.14dist-fiona \
python314-Fiona \
python3dist-fiona"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdal.so.39 \
libstdc++.so.6 \
python-abi \
python314-attrs \
python314-certifi \
python314-click \
python314-click-plugins \
python314-cligj"

inherit rpm
