SUMMARY = "Development files for libfm-qt"
DESCRIPTION = "Libfm-Qt libraries for development"
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "libfm-qt5-devel-1.4.0-1.13.aarch64.rpm"
RPM_HASH = "a15190fff23759a1755d090ccf0de23e7fde47a031fcc8bfe120832c4ed47031c3d5d9c960d8c0e66901469a224cc9d1921ae0aa15a0b86861934acf9d71b674"

RPROVIDES:${PN} += "cmake-fm-qt \
libfm-qt5-devel \
pkgconfig-libfm-qt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfm-qt5-14 \
pkgconfig \
pkgconfig-Qt5Widgets \
pkgconfig-Qt5X11Extras \
pkgconfig-libmenu-cache"

inherit rpm
