SUMMARY = "Exception handling library for OpenEXR"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains shared library libIex"
LICENSE = "BSD-3-Clause"

PV = "3.4.14"

RPM_NAME = "libIex-3_4-33-3.4.14-1.1.aarch64.rpm"
RPM_HASH = "ed3005504fd75c4cf4cc08f925de12d18a671ff6a89c5dd5828bfe47cc578402b7d9134f42807a37a8b4ec7a88f005e2893f23b833eb72a13856afa8ffed9ea5"

RPROVIDES:${PN} += "libIex-3-4-33 \
libIex-3-4.so.33"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
