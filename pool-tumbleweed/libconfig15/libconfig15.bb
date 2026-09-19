SUMMARY = "C API of libconfig"
DESCRIPTION = "libconfig is a library for manipulating structured configuration \
files. The supported file format is more compact and more readable \
than XML. Unlike XML, it is type-aware, so it is not necessary to do \
string parsing in application code. \
 \
This package contains the shared libraries for libconfig."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.1"

RPM_NAME = "libconfig15-1.8.1-1.7.aarch64.rpm"
RPM_HASH = "643b9b6381ec7f3ab031062a4efd1be2f5951b8b37d5be03a6df83b59057663cd4a2ffc2ad6303d5bc35df73eba9837ebb736cb7ae429feb86c6d5d3de23e4e4"

RPROVIDES:${PN} += "libconfig.so.15 \
libconfig15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
