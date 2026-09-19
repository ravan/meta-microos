SUMMARY = "Development files for libclocale, a C locale library"
DESCRIPTION = "A library for C locale functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libclocale."
LICENSE = "LGPL-3.0-or-later"

PV = "20260703"

RPM_NAME = "libclocale-devel-20260703-1.2.aarch64.rpm"
RPM_HASH = "8babed1227203bfdf4dd892195f4fb3a024d1e4ccd54368610a2505f8d2aab0a36e906fd6407231d62fb01313287a5d51ad61535d16c6076e39d516cfa092cc9"

RPROVIDES:${PN} += "libclocale-devel \
pkgconfig-libclocale"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libclocale1"

inherit rpm
