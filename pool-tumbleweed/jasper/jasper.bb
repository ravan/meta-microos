SUMMARY = "An Implementation of the JPEG-2000 Standard, Part 1"
DESCRIPTION = "This package contains an implementation of the image compression \
standard, JPEG-2000, Part 1. It consists of tools for conversion to and \
from the JP2 and JPC formats."
LICENSE = "JasPer-2.0"

PV = "4.2.9"

RPM_NAME = "jasper-4.2.9-1.4.aarch64.rpm"
RPM_HASH = "2f6127e574337c939b14aab256e87ab2a08abdf4b507a813139256130081142b781718398ece712f44b08ce8d309b2aee011ec9c93899fee8c46ccdc455a38b9"

RPROVIDES:${PN} += "jasper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLU.so.1 \
libGLX.so.0 \
libOpenGL.so.0 \
libc.so.6 \
libglut.so.3 \
libjasper.so.7 \
libm.so.6"

inherit rpm
