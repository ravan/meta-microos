SUMMARY = "Headers and generators for pplite"
DESCRIPTION = "PPLite is a C++ library implementing the abstract domain of convex polyhedra, \
to be used in tools for static analysis and verification. \
The main characteristics of PPLite: \
 \
  * Both closed and NNC rational convex polyhedra are supported. \
  * Exact computations are based on FLINT."
LICENSE = "GPL-3.0-or-later"

PV = "0.14"

RPM_NAME = "pplite-devel-0.14-1.1.aarch64.rpm"
RPM_HASH = "4d6e42b54b4aabfa3bd941d00ab827afcf5a338b51f396ebbd12c5abb21eb10d044a948582e570b55f340ab493e08b9cfbbf4dc8bf19e7e0d8d6118fffd6c3f0"

RPROVIDES:${PN} += "pplite-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libflint.so.24 \
libgcc-s.so.1 \
libgmp.so.10 \
libpplite.so.7 \
libpplite7 \
libstdc++.so.6"

inherit rpm
