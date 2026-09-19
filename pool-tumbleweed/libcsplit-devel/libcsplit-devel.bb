SUMMARY = "Development files for libcsplit, a C split string library"
DESCRIPTION = "A library for C split string functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcsplit."
LICENSE = "LGPL-3.0-or-later"

PV = "20260703"

RPM_NAME = "libcsplit-devel-20260703-1.2.aarch64.rpm"
RPM_HASH = "10c924d5f1cbe3efcc11f44172c7a4bd1c3af5bdc5f03036f50481b8fec8b6cbc7a37ee7c73beb3d6efd7a8afd3156a1d22530951975b8cb937f93c001c93739"

RPROVIDES:${PN} += "libcsplit-devel \
pkgconfig-libcsplit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcsplit1"

inherit rpm
