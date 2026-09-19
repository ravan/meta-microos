SUMMARY = "Development files for the libcangjie IME"
DESCRIPTION = "libcangjie is a C library implementing the Cangjie input method, \
which is mainly used on Traditional Chinese inputing. \
 \
This package provides development files for libcangjie."
LICENSE = "LGPL-3.0+"

PV = "1.3"

RPM_NAME = "libcangjie-devel-1.3-1.33.aarch64.rpm"
RPM_HASH = "7ec6f15c2f464b732443094e1e4634efbe0b13757b08b5e3c49c1862fc373c17789b3cef705f2993f3cee1a88c01e65c1d2264b875c1872eaffd08e1f9f921ea"

RPROVIDES:${PN} += "libcangjie-devel \
pkgconfig-cangjie"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcangjie-tools \
libcangjie2 \
pkgconfig-sqlite3"

inherit rpm
