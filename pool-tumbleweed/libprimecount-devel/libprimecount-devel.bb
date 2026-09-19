SUMMARY = "Development files for the primecount library"
DESCRIPTION = "This package contains the C/C++ header files and the configuration \
files for developing applications that use the primecount library."
LICENSE = "BSD-2-Clause"

PV = "8.7"

RPM_NAME = "libprimecount-devel-8.7-1.1.aarch64.rpm"
RPM_HASH = "70943041c77d56b226203991be48dad5aa14ededf20e0012291968c54c1c17c1bff183ee39bb46306a71e13f45a7c0da01b4c7daea4e5e2a9915554c25f7cc1f"

RPROVIDES:${PN} += "cmake-primecount \
libprimecount-devel \
pkgconfig-primecount"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libprimecount8 \
pkgconfig-primesieve"

inherit rpm
