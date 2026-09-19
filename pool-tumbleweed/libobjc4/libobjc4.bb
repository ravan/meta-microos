SUMMARY = "Library for the GNU Objective C Compiler"
DESCRIPTION = "The library for the GNU Objective C compiler."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "16.2.0+git9497"

RPM_NAME = "libobjc4-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "2e8cad993f6cfc56db57336a11b3e2f0f0e2c745db98b42ac6ab4fb177845c4251969a29f1a02f579cbbd33544b78aae0a4516e0ac070cac4886a8452a1389a4"

RPROVIDES:${PN} += "libobjc.so.4 \
libobjc4"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
