SUMMARY = "Libyui - Header fles for the NCurses (text based) user interface"
DESCRIPTION = "This package contains the header files for the NCurses \
(text based) user interface component for libyui. \
 \
This package is not needed to develop libyui-based applications, \
only to develop extensions for libyui-ncurses."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.7.7"

RPM_NAME = "libyui-ncurses-devel-4.7.7-1.2.aarch64.rpm"
RPM_HASH = "dbb6c8facf1069411544454eb2df1f3b9d1aa836ecfab26b1656769da4c9d7372f151c881938da47289be99398f870bcf5f100e71adb0ced2f78e3883a71c262"

RPROVIDES:${PN} += "libyui-ncurses-devel \
pkgconfig-libyui-ncurses"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
boost-devel \
glibc-devel \
libstdc++-devel \
libyui-devel \
libyui-ncurses16 \
ncurses-devel"

inherit rpm
