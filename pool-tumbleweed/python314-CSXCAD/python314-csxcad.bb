SUMMARY = "Python 3.14 bindings for CSXCAD"
DESCRIPTION = "This package contains Python 3.14 bindings for the CSXCAD \
library."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.3"

RPM_NAME = "python314-CSXCAD-0.6.3-5.1.aarch64.rpm"
RPM_HASH = "80010f2ecbaefa5529ada97f137393394c8ec65e8fa8ef40d59aab002ca236bcff05347fc634de4a5620f59d4ce7601b2b5235e5a314f7d6bc449de4218d3b18"

RPROVIDES:${PN} += "python3.14dist-csxcad \
python314-CSXCAD \
python3dist-csxcad"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libCSXCAD.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python314-matplotlib \
python314-numpy"

inherit rpm
