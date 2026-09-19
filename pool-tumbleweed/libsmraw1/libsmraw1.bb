SUMMARY = "Library and tools to access the (split) RAW image format"
DESCRIPTION = "libsmraw is a library to access the storage media RAW format. \
The library supports both RAW and split RAW."
LICENSE = "LGPL-3.0-or-later"

PV = "20260902"

RPM_NAME = "libsmraw1-20260902-1.1.aarch64.rpm"
RPM_HASH = "1e9396d0550a314271ae57e45373c4062ea388f6aa029d822721b15472a44dcd0d1ea973c2c5ddda91a9abe924f15c9f77235953061eae9c23f93ee76a84a6f1"

RPROVIDES:${PN} += "libsmraw.so.1 \
libsmraw1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfdata.so.1 \
libfvalue.so.1 \
libuna.so.1"

inherit rpm
