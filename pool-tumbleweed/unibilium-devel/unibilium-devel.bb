SUMMARY = "Development files for unibilium, a terminfo parsing library"
DESCRIPTION = "Unibilium is a very basic terminfo library. It doesn't depend on curses or any \
other library. It also doesn't use global variables, so it should be \
thread-safe. \
 \
This package holds the development files."
LICENSE = "LGPL-3.0-or-later"

PV = "2.1.2"

RPM_NAME = "unibilium-devel-2.1.2-1.5.aarch64.rpm"
RPM_HASH = "ecda3a361cd311ca77e3bbc85bb7d6db2b749cf821f45d91ddcc5a6d3bb23c7bd14b365a0448a9957b7a457073969ca234b4537537603c83cf86e39afdf0c943"

RPROVIDES:${PN} += "pkgconfig-unibilium \
unibilium-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libunibilium4"

inherit rpm
