SUMMARY = "Anything that associates"
DESCRIPTION = "In mathematics, a semigroup is an algebraic structure consisting of a set \
together with an associative binary operation. A semigroup generalizes a monoid \
in that there might not exist an identity element. It also (originally) \
generalized a group (a monoid with all inverses) to a type where every element \
did not have to have an inverse, thus the name semigroup."
LICENSE = "BSD-3-Clause"

PV = "0.20.1"

RPM_NAME = "ghc-semigroups-0.20.1-1.3.aarch64.rpm"
RPM_HASH = "f0a51065445c4e6436acd9254aebcec61e1306992958a08525bfcfec19bde59cb3c192f9e1e2f1bf66fb21c59425895098ea0df28045024cbcc917bd0c38a37d"

RPROVIDES:${PN} += "ghc-semigroups \
libHSsemigroups-0.20.1-992KRSDvCsv617GvmRAoMY-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
