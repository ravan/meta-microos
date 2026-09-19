SUMMARY = "Qt 6 QuickControls2 library"
DESCRIPTION = "The Qt 6 QuickControls2 library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6QuickControls2-6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "60b0cc27e2945bd709ab7a6cfad4e9f70389c73cae1e594a50753dcd4a683545b85d4722cbfab55fb7c99d457721db765a1ea09deb6afdf71e4755a5b75101be"

RPROVIDES:${PN} += "libQt6QuickControls2-6 \
libQt6QuickControls2.so.6 \
libQt6QuickControls2Basic.so.6 \
libQt6QuickControls2Fusion.so.6 \
libQt6QuickControls2Imagine.so.6 \
libQt6QuickControls2Material.so.6 \
libQt6QuickControls2Universal.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickTemplates2.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
