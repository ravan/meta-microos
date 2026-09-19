SUMMARY = "Development files for libsmraw, a (split) RAW image file library"
DESCRIPTION = "libsmraw is a library to access the storage media RAW format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libsmraw."
LICENSE = "LGPL-3.0-or-later"

PV = "20260902"

RPM_NAME = "libsmraw-devel-20260902-1.1.aarch64.rpm"
RPM_HASH = "dd0d2ac26813b583915084885a9ded0d486f2483df82fe88c22bcb6c0b59153b423f6a559955f393d92086a5588bf95408546d0b51ac1450fb0bd6778912d25b"

RPROVIDES:${PN} += "libsmraw-devel \
pkgconfig-libsmraw"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libsmraw1"

inherit rpm
