SUMMARY = "Constraint Solver"
DESCRIPTION = "STP is an efficient decision procedure for the validity (or satisfiability) of \
formulas from a quantifier-free many-sorted theory of fixed-width bitvectors \
and (non-extensional) one-dimensional arrays. The functions in STP's input \
language include concatenation, extraction, left/right shift, sign-extension, \
unary minus, addition, multiplication, (signed) modulo/division, bitwise \
Boolean operations, if-then-else terms, and array reads and writes. The \
predicates in the language include equality and (signed) comparators between \
bitvector terms."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "libstp2_4-2.4.1-1.1.aarch64.rpm"
RPM_HASH = "9906f699404ba25a49ef45006aa8f2d7526e180aca9fcacc159a3267e076cddb8a7560072c1963818b0fe8e8071cc81e8cbcfd908886489063de3a4b213a6daa"

RPROVIDES:${PN} += "libstp.so.2.4 \
libstp2-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libminisat.so.2 \
libstdc++.so.6"

inherit rpm
