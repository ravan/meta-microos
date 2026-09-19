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

RPM_NAME = "python314-stp-2.4.1-1.1.aarch64.rpm"
RPM_HASH = "695fd6cc28a9f7022489a352b2fe88dd28bc443faa6bb43efa4ef6bb75161dfe44225927bd214802c06e098ad123cc94b491e075cd99da8511f6ce39ab25a450"

RPROVIDES:${PN} += "python314-stp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
