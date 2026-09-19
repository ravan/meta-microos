SUMMARY = "Development files for libofx, an OFX Command Parser and API"
DESCRIPTION = "LibOFX is a parser and API for applications to support \
OFX command responses, usually provided by financial institutions for \
statement downloads. \
 \
This subpackage contains the header files for the C API."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.9"

RPM_NAME = "libofx-devel-0.10.9-2.1.aarch64.rpm"
RPM_HASH = "8a0e4155b5e217557d5c51519260991830827a7ba5f2afec2565c0620af8a48aae1eb412497737ceba54f04282ac1b45d2deba262d9d02638f45b3bba3b0b946"

RPROVIDES:${PN} += "cmake-LibOFX \
libofx-devel \
pkgconfig-libofx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libofx \
libofx7 \
opensp-devel"

inherit rpm
