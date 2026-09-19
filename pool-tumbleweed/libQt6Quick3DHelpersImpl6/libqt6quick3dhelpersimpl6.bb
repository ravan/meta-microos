SUMMARY = "Qt 6 Quick3DHelpersImpl library"
DESCRIPTION = "The Qt 6 Quick3DHelpersImpl library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Quick3DHelpersImpl6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "8c0b7c23f8d7068572fedfbd791b4314df0d0930e718f9cbc90e1e2bcb35cce421a7d2a73505bb7809090c7e91ff6dd8990b0b784379880fe201d670471f7138"

RPROVIDES:${PN} += "libQt6Quick3DHelpersImpl.so.6 \
libQt6Quick3DHelpersImpl6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6Quick3D.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
