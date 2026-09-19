SUMMARY = "Integer logarithms"
DESCRIPTION = "'Math.NumberTheory.Logarithms' and 'Math.NumberTheory.Powers.Integer' from the \
arithmoi package. \
 \
Also provides 'GHC.Integer.Logarithms.Compat' and \
'Math.NumberTheory.Power.Natural' modules, as well as some additional functions \
in migrated modules."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "ghc-integer-logarithms-1.0.5-1.3.aarch64.rpm"
RPM_HASH = "67e726ef944c88a31314422de122903bf5ed617fb53d36cf8141e4388bd754b2a65a31856c0fbc3869d1bac477f65cf51493ce7f0bc6b80e32cc4699406dc054"

RPROVIDES:${PN} += "ghc-integer-logarithms \
libHSinteger-logarithms-1.0.5-7oN15VqsexT8F3DIJBcPo2-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
