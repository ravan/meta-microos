SUMMARY = "io_uring I/O access library for non-C/C++ languages"
DESCRIPTION = "Foreign function interface for liburing, offering non-C/C++ language \
integration."
LICENSE = "(GPL-2.0-only & LGPL-2.1-or-later) | MIT"

PV = "2.15"

RPM_NAME = "liburing-ffi2-2.15-1.1.aarch64.rpm"
RPM_HASH = "1f97d5581ff9d70d76e0c071c2fe9620cf51d24ead92e2122783d4c03930570465c595c4ac0090b0cf9b7e5e81446522a3aa0da0c82ae749445b3143b93675d7"

RPROVIDES:${PN} += "liburing-ffi.so.2 \
liburing-ffi2"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
