SUMMARY = "Library for the GNU Objective C Compiler"
DESCRIPTION = "The library for the GNU Objective C compiler."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "15.3.0+git11272"

RPM_NAME = "libobjc4-gcc15-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "537fbc754c95172ad048e1a4b1661bdeb400359e1b3876d7a739c4faf16e5976430aa857b7cead64c17082e9c4d9c3d88690e27a5c027b6ea615f30154ef8cd6"

RPROVIDES:${PN} += "libobjc.so.4 \
libobjc4 \
libobjc4-gcc15"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
