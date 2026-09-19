SUMMARY = "Tools for Manipulating PNG Images"
DESCRIPTION = "Package consists of low level tools for manipulating and fixing particular \
PNG files."
LICENSE = "libpng-2.0"

PV = "1.6.58"

RPM_NAME = "libpng16-tools-1.6.58-2.1.aarch64.rpm"
RPM_HASH = "34413d8e215fb4cc844812c6798c053f90bc4d2f30e034944a3f06c6673ac2897b793e2506e6b646cda56a0ef88fbf3ae13494859b88eb785c4bd60a70cab136"

RPROVIDES:${PN} += "libpng-tools \
libpng16-tools \
rpm-macro-png-fix \
rpm-macro-png-fix-dir"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpng16.so.16 \
libz.so.1"

inherit rpm
