SUMMARY = "CVT standard timing modeline generator"
DESCRIPTION = "libxcvt is a library providing a standalone version of the X server \
implementation of the VESA Coordinated Video Timings (CVT) standard \
timing modelines generator. libxcvt also provides a standalone \
version of the command line tool cvt copied from the Xorg \
implementation and is meant to be a direct replacement to the version \
provided by the Xorg server."
LICENSE = "MIT"

PV = "0.1.3"

RPM_NAME = "libxcvt-0.1.3-1.7.aarch64.rpm"
RPM_HASH = "e7740871b25641756635cda9e1ac33f252cfadd47aa4f4136ca93b46835f086a9ff7b1d08049bff66502b11a03360d6fdf64d628336b1466881a0f51ee881ab3"

RPROVIDES:${PN} += "libxcvt"

RDEPENDS:${PN} += "libc.so.6 \
libxcvt.so.0"

inherit rpm
