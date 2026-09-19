SUMMARY = "Development headers and libraries for libint"
DESCRIPTION = "LIBINT computes the Coulomb and exchange integrals, which in electronic \
structure theory are called electron repulsion integrals (ERIs). This is by \
far the most common type of integrals in molecular structure theory. \
 \
LIBINT uses recursive schemes that originate in seminal Obara-Saika method and \
Head-Gordon and Pople’s variation thereof. The idea of LIBINT is to optimize \
computer implementation of such methods by implementing an optimizing compiler \
to generate automatically highly-specialized code that runs well on \
super-scalar architectures. \
 \
This package contains development headers and libraries for libint."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.11.0"

RPM_NAME = "libint-devel-2.11.0-1.4.aarch64.rpm"
RPM_HASH = "1a7a5c92bc0a7d6f98c99efbc90d556854799f3b8054103a81b0ffc720711bcd370ba57b1f6878a62487836edbdd4dfad10b7e19b5e9e953d386c5719d6b333d"

RPROVIDES:${PN} += "libint-devel \
pkgconfig-libint2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
eigen3-devel \
libint2-2"

inherit rpm
