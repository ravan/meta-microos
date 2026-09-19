SUMMARY = "Development tools for Log for C++"
DESCRIPTION = "The log4cpp-devel package contains the static libraries and header files \
needed for development with log4cpp."
LICENSE = "LGPL-2.1-only"

PV = "1.1.6"

RPM_NAME = "log4cpp-devel-1.1.6-1.4.aarch64.rpm"
RPM_HASH = "eea72cb11e50a8dfddc01ce8f1630c84ddd57b1721b2fc89786b2e3f2a07dae276496232376825ad5fb3fb818b63dcb408dbf09af2330cca18c7d0146d65c7e0"

RPROVIDES:${PN} += "log4cpp-devel \
pkgconfig-log4cpp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
liblog4cpp5"

inherit rpm
