SUMMARY = "Qt 6 PositioningQuick library"
DESCRIPTION = "The Qt 6 PositioningQuick library."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "libQt6PositioningQuick6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "ba5d70a34be0778447b28b21e113957be85bbc06ef09efc96025afc9e01315bdd6b7c2fcebd0858147f87d6ab5d552440e438e724bc7d92fcde7b3d924255b59"

RPROVIDES:${PN} += "libQt6PositioningQuick.so.6 \
libQt6PositioningQuick6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Positioning.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
