SUMMARY = "Main libint library v2"
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
This package contains the library of the libint package."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.11.0"

RPM_NAME = "libint2-2-2.11.0-1.4.aarch64.rpm"
RPM_HASH = "16ce1e06e4ec0eee9ed24ad68cc5620a7a601dc7a8a2dd5c54e0bdc927bdeb19a3a387cab6a0a213e85e08123ef04d650662b89372a24b530cd4682b08d72099"

RPROVIDES:${PN} += "libint2-2 \
libint2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
