SUMMARY = "Liquid Rescale seam-carving library"
DESCRIPTION = "The Liquid Rescale (lqr) library provides a C/C++ API for performing \
non-uniform resizing of images by the seam-carving technique."
LICENSE = "LGPL-3.0-only"

PV = "0.4.3"

RPM_NAME = "liblqr-1-0-0.4.3-1.1.aarch64.rpm"
RPM_HASH = "bc521dbdaa770b8db43bf4fc86a839d6dffbf451cd259857d1d61261f91ac42e1c63fe8da48a08a1c5478afe3c3c273a011cb2054d53e6057700a02c2020942d"

RPROVIDES:${PN} += "liblqr-1-0 \
liblqr-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libglib-2.0.so.0 \
libm.so.6"

inherit rpm
