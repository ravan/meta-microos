SUMMARY = "Development headers for Boost"
DESCRIPTION = "A collection of header-only libraries for Boost."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_headers1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "5853d798cda094a17cf916e1296a52267e8ae1be471b3ed99c72caf11eb5ca324413d0a69492c0937c7b66fafb71ccd726263995d958740903c11e88d5ce8999"

RPROVIDES:${PN} += "libboost-headers-devel-impl \
libboost-headers1-91-0-devel"

RDEPENDS:${PN} += "boost-license1-91-0 \
libstdc++-devel"

inherit rpm
