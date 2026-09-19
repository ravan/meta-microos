SUMMARY = "Shared library for libguess"
DESCRIPTION = "A high-speed character set detection library \
 \
This package contains the shared libguess library."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "libguess1-1.2-1.37.aarch64.rpm"
RPM_HASH = "e64910c44260432cf612327132b00d594ec9fa221a37969bc7eb607647ded99ff3cde101a8392a616b0e94f41edeac217db9bd6a2999a37ffca14d2f813a9307"

RPROVIDES:${PN} += "libguess.so.1 \
libguess1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
