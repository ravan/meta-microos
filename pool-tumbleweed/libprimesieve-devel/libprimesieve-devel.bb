SUMMARY = "Development files for the primesieve library"
DESCRIPTION = "This package contains the C/C++ header files and the configuration \
files for developing applications that use the primesieve library. \
It also contains the API documentation of the library."
LICENSE = "BSD-2-Clause"

PV = "12.15"

RPM_NAME = "libprimesieve-devel-12.15-1.2.aarch64.rpm"
RPM_HASH = "c612a6a4de7b7b6c1ed72785eb5901d57727113dc97db3e664151c767366050281dab7b05e7651e683dd8a3702faab25063b2baa92c503c00c71b9b9669d7f60"

RPROVIDES:${PN} += "cmake-primesieve \
libprimesieve-devel \
pkgconfig-primesieve"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libprimesieve12"

inherit rpm
