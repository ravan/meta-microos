SUMMARY = "Qt 6 LabsSynchronizer library"
DESCRIPTION = "The Qt 6 LabsSynchronizer library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6LabsSynchronizer6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "6daad5404a9a45dbf43eccdd0f66c07e91735ecee85c97cb2dad564c98648296535916885399aa765447dc835e4da8971dd1362d0692229963770a7ef75b561a"

RPROVIDES:${PN} += "libQt6LabsSynchronizer.so.6 \
libQt6LabsSynchronizer6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
