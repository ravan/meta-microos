SUMMARY = "Core C99 package for AWS SDK for C"
DESCRIPTION = "Core C99 package for AWS SDK for C. It includes cross-platform primitives, \
configuration, data structures, and error handling. \
 \
This package contains the dynamically linked library."
LICENSE = "Apache-2.0"

PV = "0.14.5"

RPM_NAME = "libaws-c-common1-0.14.5-1.1.aarch64.rpm"
RPM_HASH = "fd03d31598d449a119f4aeed5404b7358cba34d7fac198382923a18bd9e71d3a4062f2819ba4009f22170bd565a55496d89a372d88c9762a0cb602d2ef44a60a"

RPROVIDES:${PN} += "libaws-c-common.so.1 \
libaws-c-common1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
