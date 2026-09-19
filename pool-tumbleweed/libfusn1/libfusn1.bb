SUMMARY = "Library for Update Sequence Number (USN) Journal data types"
DESCRIPTION = "libfusn is a library for Update Sequence Number (USN) Journal data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260522"

RPM_NAME = "libfusn1-20260522-1.8.aarch64.rpm"
RPM_HASH = "424f100d9615eb9eb0d7dc3f5237a414d2e5becaaa7e411a96b947bb1de0ceb42180a7d132a18294aa628016be43e2d86ae24148ee8fdf74ab2a2cac15bf87aa"

RPROVIDES:${PN} += "libfusn.so.1 \
libfusn1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcerror.so.1 \
libuna.so.1"

inherit rpm
