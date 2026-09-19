SUMMARY = "Library for manipulating ZBC and ZAC disks"
DESCRIPTION = "libzbc is a simple library providing functions for manipulating Zoned \
Block Command (ZBC) and Zoned-device ATA command set (ZAC) disks. \
libzbc also has an mode for emulating the behavior of a zoned disk \
using a regular file or raw block device."
LICENSE = "BSD-2-Clause & LGPL-3.0-or-later"

PV = "6.2.0"

RPM_NAME = "libzbc6-6.2.0-1.9.aarch64.rpm"
RPM_HASH = "e58538944032a0aa86307cf08c903f36aa66edb6f7603326b28d9453fdf5695478f50acec7751133fdf0d87c66cc3229a591c22db0afc073a7709344115a26bb"

RPROVIDES:${PN} += "libzbc.so.6 \
libzbc6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
