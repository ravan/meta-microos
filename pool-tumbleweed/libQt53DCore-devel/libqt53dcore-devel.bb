SUMMARY = "Development files for the Qt 5 Core 3D library"
DESCRIPTION = "Development files for the Qt 5 Core 3D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt53DCore-devel-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "36a3fca483a78152050f6262b37963be73f608db36891fa1b786ca3fc18998e0c29dd3f8fd75a2001ab3add03c74c27adba976b50c9ebec2bf3282b3c48dc7e6"

RPROVIDES:${PN} += "cmake-Qt53DCore \
libQt53DCore-devel \
pkgconfig-Qt53DCore"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DCore5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Network"

inherit rpm
