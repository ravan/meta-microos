SUMMARY = "Qt 6 Multimedia library - Development files"
DESCRIPTION = "Development files for the Qt 6 Multimedia library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-multimedia-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "af1bd4f5a056a53ec4b6b9569aaabd554478cfc599df19c014e1f702288ef455c8c8ed46f5388f0dbabeb8781c8e84e6f642e3fb718e69b40ec47e2363e286a8"

RPROVIDES:${PN} += "cmake-Qt6Multimedia \
pkgconfig-Qt6Multimedia \
qt6-multimedia-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Concurrent \
cmake-Qt6Gui \
cmake-Qt6Network \
libQt6Multimedia6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Network"

inherit rpm
