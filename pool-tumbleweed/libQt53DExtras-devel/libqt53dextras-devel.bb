SUMMARY = "Development files for the Qt 5 3D Extras libary"
DESCRIPTION = "Development files for the Qt 5 3D Extras library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt53DExtras-devel-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "7fa0ac58f61ac0f013477343e281ddda468c8a348c0468403df4a1828807f741b5c310733b6b22482508bd3a2574bf6886649786a922b24926a45de65f4c0e2d"

RPROVIDES:${PN} += "cmake-Qt53DExtras \
libQt53DExtras-devel \
pkgconfig-Qt53DExtras"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DExtras5 \
pkgconfig-Qt53DCore \
pkgconfig-Qt53DInput \
pkgconfig-Qt53DLogic \
pkgconfig-Qt53DRender \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui"

inherit rpm
