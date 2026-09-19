SUMMARY = "GAP: ncurses interface and browsing applications"
DESCRIPTION = "The Browse package provides three levels of functionality \
 \
* A GAP interface to the ncurses library. \
* A generic function for interactive browsing through two-dimensional \
  arrays of data. \
* Several applications of the first two, e.g., a method for browsing \
  character tables, browsing through the content of some data \
  collections, or some games."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.23"

RPM_NAME = "gap-browse-1.8.23-1.1.aarch64.rpm"
RPM_HASH = "bdc83576b40a502d09235f792ff4859e3be9687a21fe5a434665ff9fab6ac41377781a314e1fa1ef8752b0b5e87a189c6a8080b78532d47da4f3375da6d8932f"

RPROVIDES:${PN} += "gap-browse"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
gap-gapdoc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6"

inherit rpm
