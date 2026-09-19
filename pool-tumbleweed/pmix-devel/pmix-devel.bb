SUMMARY = "Process Management Interface for MPI"
DESCRIPTION = "This Package contains necessary files for development and building PMI-X \
aware applications."
LICENSE = "BSD-3-Clause"

PV = "3.2.5"

RPM_NAME = "pmix-devel-3.2.5-2.10.aarch64.rpm"
RPM_HASH = "de55ca452432b38e25148782c0eac93bd1922d16901aa5a85f3e6b6e638e3c41dbbc2774dda1932acebd8b42ddbd0fdec6fd03f4be8acee6f70a3637ee14875b"

RPROVIDES:${PN} += "pkgconfig-pmix \
pmix-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmca-common-dstore1 \
libpmix2 \
pkgconfig-hwloc \
pkgconfig-libevent \
pkgconfig-zlib \
pmix-headers"

inherit rpm
