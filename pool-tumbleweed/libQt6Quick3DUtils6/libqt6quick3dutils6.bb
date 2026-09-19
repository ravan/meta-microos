SUMMARY = "Qt 6 Quick3DUtils library"
DESCRIPTION = "The Qt 6 Quick3DUtils library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Quick3DUtils6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "387e8bba73ef486961a7e74a50faf21f40d1bfe7f23060fd0ff24567b8f9769d25a064fa7fb52250adb2d168706c0232ca495622491e5dd0dd6c93cd9f7d4df3"

RPROVIDES:${PN} += "libQt6Quick3DUtils.so.6 \
libQt6Quick3DUtils6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
