SUMMARY = "Python bindings for libArcus"
DESCRIPTION = "Python bindings for the Arcus communication library."
LICENSE = "LGPL-3.0-only"

PV = "4.13.1"

RPM_NAME = "python3-Arcus-4.13.1-9.14.aarch64.rpm"
RPM_HASH = "d3114ed52ac2da7a5a2d70f4c47c01332b643ceaaca9449db357d282f7967f62c0e0c5515ca50efd1d2d97710d41731b849cf3b948f6411f357db27b2b8ea52e"

RPROVIDES:${PN} += "python3-Arcus \
python3.13dist-arcus \
python3dist-arcus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libArcus-Ultimaker \
libArcus.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libprotobuf.so.36.1.0 \
libstdc++.so.6 \
python-abi \
python3-qt5-sip"

inherit rpm
