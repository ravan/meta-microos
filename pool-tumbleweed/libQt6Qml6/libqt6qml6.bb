SUMMARY = "Qt 6 Qml library"
DESCRIPTION = "The Qt 6 Qml library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Qml6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "c626d64a6d17cbed6803d325c8a17bda9e9a4cd253675ae99edee7542ea7cbf01e8fa6d45f9216a372375b8e780e768bca26e40d658e5a3d82278959841cd986"

RPROVIDES:${PN} += "libQt6Qml.so.6 \
libQt6Qml6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
qt6-declarative-imports"

inherit rpm
