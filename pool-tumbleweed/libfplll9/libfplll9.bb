SUMMARY = "Lenstra-Lovász Lattice Basis Reduction Algorithm Library"
DESCRIPTION = "fplll contains several algorithms on lattices that rely on \
floating-point computations. This includes implementations of the \
floating-point LLL reduction algorithm, offering different \
speed/guarantees ratios. It also includes a rigorous floating-point \
implementation of the Kannan-Fincke-Pohst algorithm that finds a \
shortest non-zero lattice vector."
LICENSE = "LGPL-2.1-or-later"

PV = "5.5.0"

RPM_NAME = "libfplll9-5.5.0-1.8.aarch64.rpm"
RPM_HASH = "5883c662ae71705c7b7c912bce422a293f4f3748bdb779341254f696884300571bc37d6d3a1a474c02c18c13834918473ca9be259c39e5516f472d9b5912b077"

RPROVIDES:${PN} += "libfplll.so.9 \
libfplll9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libmpfr.so.6 \
libstdc++.so.6"

inherit rpm
