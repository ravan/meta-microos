SUMMARY = "Devel files for libQt6XdgIconLoader"
DESCRIPTION = "Development files for QtXDG icon loader libraries used in LXQt"
LICENSE = "LGPL-2.1-only & SUSE-LGPL-2.1-with-digia-exception-1.1"

PV = "4.4.0"

RPM_NAME = "libQt6XdgIconLoader-devel-4.4.0-1.7.aarch64.rpm"
RPM_HASH = "ef6964d0ec6c0560040b9acb7ec30254c6a9e7f7180a577f8617001a41ba07668688d499630ece514f0d348827138acb245570c63e81fde1e95b8b28748cf79c"

RPROVIDES:${PN} += "cmake-qt6xdgiconloader \
libQt6XdgIconLoader-devel \
pkgconfig-Qt6XdgIconLoader"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt6XdgIconLoader4 \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Svg"

inherit rpm
