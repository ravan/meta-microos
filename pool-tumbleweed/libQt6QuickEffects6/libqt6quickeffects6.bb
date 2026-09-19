SUMMARY = "Qt 6 QuickEffects library"
DESCRIPTION = "The Qt 6 QuickEffects library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6QuickEffects6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "ad3ed8958f8856353f31e8ea77a006f5119a9c98f969020d674bd6510f7f814fe04569c16bb2f60b2d23a960580c17613a9743e30ebe36048437dccf3b853b2b"

RPROVIDES:${PN} += "libQt6QuickEffects.so.6 \
libQt6QuickEffects6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
