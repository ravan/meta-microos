SUMMARY = "Qt 6 3DAnimation library"
DESCRIPTION = "The Qt 6 3DAnimation library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt63DAnimation6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "7c84e4dc8b56a3384298af36a110c5348d838e35ba577145e4d0b37ad1aed56057a4d5285df3276553c6dbc532a9a42566d6dfaa9ebe1e67a13b269b4eb26b5d"

RPROVIDES:${PN} += "libQt63DAnimation.so.6 \
libQt63DAnimation6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt63DCore.so.6 \
libQt63DRender.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
