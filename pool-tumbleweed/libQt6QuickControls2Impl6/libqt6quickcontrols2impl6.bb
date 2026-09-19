SUMMARY = "Qt 6 QuickControls2Impl library"
DESCRIPTION = "The Qt 6 QuickControls2Impl library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6QuickControls2Impl6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "3f45970a091b4d39cc51feeb9e248a259c619cfa4076512b9f45779115867f1d647439396d05233acf33e62a2981896e4db2fcf5ef602aa8ff44dd841a5ace94"

RPROVIDES:${PN} += "libQt6QuickControls2BasicStyleImpl.so.6 \
libQt6QuickControls2FluentWinUI3StyleImpl.so.6 \
libQt6QuickControls2FusionStyleImpl.so.6 \
libQt6QuickControls2ImagineStyleImpl.so.6 \
libQt6QuickControls2Impl.so.6 \
libQt6QuickControls2Impl6 \
libQt6QuickControls2MaterialStyleImpl.so.6 \
libQt6QuickControls2UniversalStyleImpl.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickTemplates2.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
