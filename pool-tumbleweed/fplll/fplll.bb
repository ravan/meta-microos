SUMMARY = "Lenstra-Lovász Lattice Basis Reduction Algorithm Library"
DESCRIPTION = "fplll contains several algorithms on lattices that rely on \
floating-point computations. This includes implementations of the \
floating-point LLL reduction algorithm, offering different \
speed/guarantees ratios. It also includes a rigorous floating-point \
implementation of the Kannan-Fincke-Pohst algorithm that finds a \
shortest non-zero lattice vector."
LICENSE = "LGPL-2.1-or-later"

PV = "5.5.0"

RPM_NAME = "fplll-5.5.0-1.8.aarch64.rpm"
RPM_HASH = "2e25401ee61808d6042115a06511739e8488588a32e1f63ad2936f3aa973e8be704e4c898d934d9c90ba4d5fd4f5b7cb52dd00bd955c122cc04abd9aa88c05b6"

RPROVIDES:${PN} += "fplll"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfplll.so.9 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libmpfr.so.6 \
libstdc++.so.6"

inherit rpm
