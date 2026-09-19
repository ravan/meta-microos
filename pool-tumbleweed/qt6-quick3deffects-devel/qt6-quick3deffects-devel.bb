SUMMARY = "Qt6 Quick3DEffects library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DEffects library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3deffects-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "3772f0c1e8c532c8ab5616e539d032cd588eba24b6d846647d8572be6a6ca33e9c8f4071c68af65644c017c68300574f43c555a2f9e48ccc3528f37a58725411"

RPROVIDES:${PN} += "cmake-Qt6Quick3DEffects \
pkgconfig-Qt6Quick3DEffects \
qt6-quick3deffects-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6Quick3DPrivate \
libQt6Quick3DEffects6"

inherit rpm
