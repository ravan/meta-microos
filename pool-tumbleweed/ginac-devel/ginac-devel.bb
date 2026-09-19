SUMMARY = "GiNaC development libraries and header files"
DESCRIPTION = "GiNaC (which stands for 'GiNaC is Not a CAS (Computer Algebra System)') is an \
open framework for symbolic computation within the C++ programming language. \
 \
This package contains the libraries, include files and other resources you \
use to develop GiNaC applications."
LICENSE = "GPL-2.0-only"

PV = "1.8.10"

RPM_NAME = "ginac-devel-1.8.10-1.4.aarch64.rpm"
RPM_HASH = "f054a4ebc6640eebe6eaa70974c179bac57e56be4bb6ace8e74ab3b6e050253205cc31df0478a7f018a2a8242107bfef981a77a1dac670d2930468e272f79500"

RPROVIDES:${PN} += "cmake-ginac \
ginac-devel \
libginac-devel \
pkgconfig-ginac"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cln-devel \
libginac13 \
pkgconfig-cln"

inherit rpm
