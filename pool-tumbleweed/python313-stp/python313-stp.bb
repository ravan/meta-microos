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

RPM_NAME = "python313-stp-2.4.1-1.1.aarch64.rpm"
RPM_HASH = "a4c8c648b9c83e27a5bc46e757024bb663224ef592424fdd1aee09381b08a05a5100331ff670ef1902ffe878173b9d734fd2ab886e39ad842dd80fc8eb915d9d"

RPROVIDES:${PN} += "python3-stp \
python313-stp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
