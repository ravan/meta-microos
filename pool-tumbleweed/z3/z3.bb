SUMMARY = "Theorem prover from Microsoft Research"
DESCRIPTION = "Z3 is a satisfiability modulo theories (SMT) solver; given a set of \
constraints with variables, it reports a set of values for those \
variables that would meet the constraints.  The Z3 input format is an \
extension of the one defined by the SMT-LIB 2.0 standard.  Z3 supports \
arithmetic, fixed-size bit-vectors, extensional arrays, datatypes, \
uninterpreted functions, and quantifiers."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "z3-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "1692c8cb17ddd84731360533570b33805ce8d3806a63a49e86b188cf8fe2d25447405b73bcf136916a9916ede97f1ed77bd3c3892d9dd1daf934d88bc8d169c6"

RPROVIDES:${PN} += "z3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
