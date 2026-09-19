SUMMARY = "Linux Kernel Crypto API User Space Interface Library"
DESCRIPTION = "libkcapi exports APIs so that developers need not consider the low-level \
Netlink interface handling that is used for accesing the Linux kernel crypto \
API. \
 \
The library does not implement any cipher algorithms. All consumer requests are \
sent to the kernel for processing. Results from the kernel crypto API are \
returned to the consumer via the library API. \
 \
The kernel interface and therefore this library can be used by unprivileged \
processes. \
 \
This library does not perform any memcpy for processing the cryptographic data! \
The library uses scatter / gather lists to eliminate the need for moving data \
around in memory."
LICENSE = "BSD-3-Clause | GPL-2.0-only"

PV = "1.5.0"

RPM_NAME = "libkcapi-devel-1.5.0-1.9.aarch64.rpm"
RPM_HASH = "9ebb38eabd746f29581a504056ee389a1f080f393ab2786766ef72c2c582b2be0d0789e207683c2f79a3d3175532cef30c78c6cf69e04ba31db5aaf8483021cf"

RPROVIDES:${PN} += "libkcapi-devel \
pkgconfig-libkcapi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libkcapi1"

inherit rpm
