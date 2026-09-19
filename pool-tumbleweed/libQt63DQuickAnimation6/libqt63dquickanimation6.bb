SUMMARY = "Qt 6 3DQuickAnimation library"
DESCRIPTION = "The Qt 6 3DQuickAnimation library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt63DQuickAnimation6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "b0c305d4ecd7ee91b07ee98496d5f280a73d94f86771993055c9e49e5103f22fde5591eeb49f851e8eff844244a16dbfaba60ffd93892fcbd8efc20190618318"

RPROVIDES:${PN} += "libQt63DQuickAnimation.so.6 \
libQt63DQuickAnimation6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt63DAnimation.so.6 \
libQt63DCore.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
