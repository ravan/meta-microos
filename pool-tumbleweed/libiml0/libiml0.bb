SUMMARY = "An Integer Matrix Library"
DESCRIPTION = "IML package provides routines to solve nonsingular systems of linear \
equations, solve any shape systems of linear equations, and perform \
mod p matrix operations, such as computing row-echelon form, \
determinant, rank profile, inverse of a mod p matrix."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "libiml0-1.0.5-5.22.aarch64.rpm"
RPM_HASH = "ed1c28d4b27c9bc5db1f18ad27c5767994a9bdce197f876db50a19a65b50a7d8a27ab7123271ef845d57c864ec796d49993d2e5d600a008c801820a718bbd791"

RPROVIDES:${PN} += "libiml.so.0 \
libiml0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libopenblas.so.0"

inherit rpm
