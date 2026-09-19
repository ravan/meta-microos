SUMMARY = "Testsuite of busybox"
DESCRIPTION = "Using this package you can test the busybox build on different kernels and glibc. \
It needs to run with permission to the current directory, so either copy it away \
as is or run as root: \
 \
cd /usr/share/busybox/testsuite \
PATH=/usr/share/busybox:$PATH SKIP_KNOWN_BUGS=1 ./runtest"
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-testsuite-1.38.0-2.1.aarch64.rpm"
RPM_HASH = "622d0bc4b50016ff390b68556d95a246de442dd2a8a3611d553c24496b401501036f5c3947d2740ba81ee94cf309fae4f6bb6b2d55eb109c3aa6ffb1c785c8f1"

RPROVIDES:${PN} += "busybox-testsuite"

RDEPENDS:${PN} += "/usr/bin/sh \
busybox \
zip"

inherit rpm
