SUMMARY = "Library for device-mapper"
DESCRIPTION = "Device mapper main shared library"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.38_1.02.212"

RPM_NAME = "libdevmapper1_03-2.03.38_1.02.212-2.5.aarch64.rpm"
RPM_HASH = "fd11ef5df880b9b4cc144912b2ba429b8d41dc212e090c60373c8054ea07f7541969204f63f0518559260deec9a73c577434ffcf1e119b2c00030fd27b5c4584"

RPROVIDES:${PN} += "libdevmapper.so.1.03 \
libdevmapper1-03"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libselinux.so.1 \
libudev.so.1"

inherit rpm
