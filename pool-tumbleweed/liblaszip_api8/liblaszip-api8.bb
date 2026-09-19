SUMMARY = "API library files for liblaszip"
DESCRIPTION = "API library for laszip \
This package contain only the dynamic build."
LICENSE = "LGPL-2.1-or-later"

PV = "3.5.0"

RPM_NAME = "liblaszip_api8-3.5.0-1.1.aarch64.rpm"
RPM_HASH = "69bc41df7347e53e154ae15094cc894cfd0a547cbcaf551f82005832ab4b60e37e9095d072917b517b363b990aeb07e5a8e6b0fcc173cb2522dfeb8874027ed5"

RPROVIDES:${PN} += "liblaszip-api.so.8 \
liblaszip-api8"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
