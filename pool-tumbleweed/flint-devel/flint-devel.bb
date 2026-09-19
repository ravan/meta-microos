SUMMARY = "Development files for flint"
DESCRIPTION = "FLINT (Fast Library for Number Theory) is a C library in support of \
computations in number theory. It is also a research project into \
algorithms in number theory. At this stage, FLINT consists mainly of \
fast integer and polynomial arithmetic and linear algebra. \
 \
This subpackage contains the include files and library links for \
developing against the FLINT library."
LICENSE = "LGPL-3.0-or-later"

PV = "3.6.0"

RPM_NAME = "flint-devel-3.6.0-1.2.aarch64.rpm"
RPM_HASH = "8f8e426b9ee550fb20551dae49e08bcbe46987c242164d881dbb571d1a0b677dc7fed95aee838ebd4fec1b9fafcab24250c9f9e8ef8564cd2befb4bafd623da5"

RPROVIDES:${PN} += "flint-devel \
pkgconfig-flint"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gmp-devel \
libflint24 \
mpfr-devel \
ntl-devel \
pkgconfig-gmp \
pkgconfig-mpfr"

inherit rpm
