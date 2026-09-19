SUMMARY = "Qt 6 QuickDialogs2Utils library"
DESCRIPTION = "The Qt 6 QuickDialogs2Utils library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6QuickDialogs2Utils6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "ca4f5994302e7f64170b891f930c8246d5449c0f4313aac7bc14354adb4d047e80cafb8d906033c4c7b971ab06d6285d308c06e528928b2ce20656082084b107"

RPROVIDES:${PN} += "libQt6QuickDialogs2Utils.so.6 \
libQt6QuickDialogs2Utils6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
