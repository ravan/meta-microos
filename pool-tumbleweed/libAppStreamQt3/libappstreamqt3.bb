SUMMARY = "Qt 6 bindings for AppStream"
DESCRIPTION = "The Qt 6 bindings for AppStream."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.5"

RPM_NAME = "libAppStreamQt3-1.1.5-1.1.aarch64.rpm"
RPM_HASH = "c39c8618a7383874dc2655da4e7ac3e436e85fbda15fec2ff82f13b87696811b33175ba9879f957c2260bec6e6b665b03de6bc144d43b9b182a71fb22c50ff48"

RPROVIDES:${PN} += "libAppStreamQt.so.3 \
libAppStreamQt3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libappstream.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6"

inherit rpm
