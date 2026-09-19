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

RPM_NAME = "stp-2.4.1-1.1.aarch64.rpm"
RPM_HASH = "f9f1b9a76ed8cfd365cb62d247ce7e4ff61bee8218eb3f9161c18e03672c6920717576e1d144d33060423910dcbc44de89d7961518a2ca051df843e4da393bd7"

RPROVIDES:${PN} += "python2-stp \
stp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-program-options.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libstp.so.2.4"

inherit rpm
