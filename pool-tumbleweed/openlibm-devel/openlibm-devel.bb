SUMMARY = "Development files for openlibm"
DESCRIPTION = "OpenLibm is an implementation of a standalone C mathematical library \
(libm). It can be used standalone in applications and programming \
language implementations. \
 \
This package provides libraries and header files for developing applications \
that use OpenLIBM."
LICENSE = "BSD-2-Clause & MIT"

PV = "0.8.1"

RPM_NAME = "openlibm-devel-0.8.1-2.11.aarch64.rpm"
RPM_HASH = "55543355e1951c581b534bae9aba7afdb73e1dcc29ed950719b21e1ec7e8151f891cabcea465d8fbf19516458ffb00f8bdcec069c53c27cd7d0dcefab219707d"

RPROVIDES:${PN} += "openlibm-devel \
pkgconfig-openlibm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenlibm4"

inherit rpm
