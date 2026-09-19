SUMMARY = "Qt 6 Quick3D library"
DESCRIPTION = "The Qt 6 Quick3D library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Quick3D6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "69abe0d769db46552a6f97c532325e19045a57aa81441dc76f0ab7349bd026f12187f5ceacbe59cf19f1f211fcb6aa7e5a65e38ed93701036dd4a8dfd62c39d5"

RPROVIDES:${PN} += "libQt6Quick3D.so.6 \
libQt6Quick3D6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QmlModels.so.6 \
libQt6Quick.so.6 \
libQt6Quick3DRuntimeRender.so.6 \
libQt6Quick3DUtils.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
