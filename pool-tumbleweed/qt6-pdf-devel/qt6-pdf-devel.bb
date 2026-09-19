SUMMARY = "Development files for the Qt 6 Pdf library"
DESCRIPTION = "Development files for the Qt 6 Pdf library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-pdf-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "58a61a0f556fe2c121e738030b6339f6785df5ca05465732edb4853b6e9bc79bcc4193f0434dfe129f30fad8f1add8165919fe03d53862e63790a1051d500237"

RPROVIDES:${PN} += "cmake-Qt6Pdf \
pkgconfig-Qt6Pdf \
qt6-pdf-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Network \
libQt6Pdf6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
