SUMMARY = "Qt 6 LabsAnimation library"
DESCRIPTION = "The Qt 6 LabsAnimation library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6LabsAnimation6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "96cc0ecdd3e5417f310d9f575e2ff3cb77a2f06cd80164f031860d6454c5fd7da6906f8292e727fd145da283d35953d93466323285fe4c61286548800ca73360"

RPROVIDES:${PN} += "libQt6LabsAnimation.so.6 \
libQt6LabsAnimation6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
