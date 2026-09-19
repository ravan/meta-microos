SUMMARY = "Embeddable Common-Lisp -- shared library"
DESCRIPTION = "This package contains the ECL shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "26.3.27"

RPM_NAME = "libecl26_3-26.3.27-1.6.aarch64.rpm"
RPM_HASH = "f12a0174f57399afa2d15d31c84f8ff66dc6fee0c47e2d5c96ac288c00d3c42a616c2c494ade2e6cd7a3a64a25ed15f62d74368a3c7ec1c99eadf27fddbd69aa"

RPROVIDES:${PN} += "libecl.so.26.3 \
libecl26-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6"

inherit rpm
