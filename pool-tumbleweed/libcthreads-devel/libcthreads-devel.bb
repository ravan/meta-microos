SUMMARY = "Development files for libcthreads, a C thread library"
DESCRIPTION = "A library for C thread functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcthreads."
LICENSE = "LGPL-3.0-or-later"

PV = "20260703"

RPM_NAME = "libcthreads-devel-20260703-1.2.aarch64.rpm"
RPM_HASH = "e048e21b7a2c1bfc297da871eb33a17642b59b62abad63a6115c20cc55d87de023aacc6bbcc0bc09085721a757335bc6aecd937fa2626192da5769d5e55dccf0"

RPROVIDES:${PN} += "libcthreads-devel \
pkgconfig-libcthreads"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcthreads1"

inherit rpm
