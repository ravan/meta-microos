SUMMARY = "Development files for libmodi"
DESCRIPTION = "libmodi is a library to access the Mac OS disk image formats. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libmodi."
LICENSE = "LGPL-3.0-or-later"

PV = "20260902"

RPM_NAME = "libmodi-devel-20260902-1.1.aarch64.rpm"
RPM_HASH = "ff412d449a54047311bc8de353d9e108fa6b57f2ece84e224af887de68327dca9c7fffab7dc3df4d12af6c57b253a5c8603d2a899a8feca16ae6029f6d97b7ec"

RPROVIDES:${PN} += "libmodi-devel \
pkgconfig-libmodi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libmodi1"

inherit rpm
