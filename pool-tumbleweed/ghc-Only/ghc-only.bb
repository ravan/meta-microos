SUMMARY = "The 1-tuple type or single-value 'collection'"
DESCRIPTION = "This package provides a canonical anonymous 1-tuple type missing from Haskell \
for attaching typeclass instances. \
 \
NOTE: There is also the </package/OneTuple OneTuple package> which by using a \
boxed 'data'-type provides a 1-tuple type which has laziness properties which \
are more faithful to the ones of Haskell's native tuples; whereas the primary \
purpose of 'Only' is to provide the traditionally so named type-wrapper for \
attaching typeclass instances."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-Only-0.1-6.17.aarch64.rpm"
RPM_HASH = "db22d15d88bc51e73bf32bd8925e30bc919ec45f35e3cf938e2aaf596fe2bef8f4fd9fb26dfce572d400bb925a662cdc720d6f2962067f859539d60d710aeb65"

RPROVIDES:${PN} += "ghc-Only \
libHSOnly-0.1-JTlBo1y3Iulx07n0z4y7-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
