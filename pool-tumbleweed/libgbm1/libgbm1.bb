SUMMARY = "Generic buffer management API"
DESCRIPTION = "This package contains the GBM buffer management library. It provides \
a mechanism for allocating buffers for graphics rendering tied to \
Mesa. \
 \
GBM is intended to be used as a native platform for EGL on drm or \
openwfd."
LICENSE = "MIT"

PV = "26.2.2"

RPM_NAME = "libgbm1-26.2.2-2.1.aarch64.rpm"
RPM_HASH = "2b6cd117fe25ce944ff01bf84cd9105366bf3dd52f1a64a6c607de07c67d85d4d846ea8890a97133985dcbe223326547246a287c8bbf1fdec6ae61f59339ffd8"

RPROVIDES:${PN} += "libgbm.so.1 \
libgbm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2"

inherit rpm
