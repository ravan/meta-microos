SUMMARY = "Development files for libadwaita-qt5"
DESCRIPTION = "The libadwaita-qt5-devel package contains libraries and header files for \
developing applications that use libadwaita-qt5-1."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.2"

RPM_NAME = "libadwaita-qt5-devel-1.4.2-4.11.aarch64.rpm"
RPM_HASH = "35101dc3ffb7f0f6c7d2b467bcd97f55aba146397d2e8783c872c91a60b618b1877a40add70193b882e186362993b29af0e4b751404edaea1a9d89810a566494"

RPROVIDES:${PN} += "cmake-AdwaitaQt \
libadwaita-qt5-devel \
libadwaitaqt-devel \
pkgconfig-adwaita-qt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libadwaitaqt5-1 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Widgets"

inherit rpm
