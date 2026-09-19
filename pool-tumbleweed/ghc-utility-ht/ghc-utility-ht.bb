SUMMARY = "Various small helper functions for Lists, Maybes, Tuples, Functions"
DESCRIPTION = "Various small helper functions for Lists, Maybes, Tuples, Functions. \
Some of these functions are improved implementations of standard functions. \
They have the same name as their standard counterparts. Others are equivalent \
to functions from the 'base' package, but if you import them from this utility \
package then you can write code that runs on older GHC versions or other \
compilers like Hugs and JHC. \
 \
All modules are plain Haskell 98. The package depends exclusively on the 'base' \
package and only that portions of 'base' that are simple to port. Thus you do \
not risk a dependency avalanche by importing it. However, further splitting the \
base package might invalidate this statement. \
 \
Alternative packages: 'Useful', 'MissingH'."
LICENSE = "BSD-3-Clause"

PV = "0.0.17.2"

RPM_NAME = "ghc-utility-ht-0.0.17.2-1.16.aarch64.rpm"
RPM_HASH = "579d6012c43cf4ef708f81417991999f1d0faa11cdf2f828300e886971174f800ce4aa6e786636690b48c0a6726b82826c96e0ac946ca8ae81ffea5f5dee0404"

RPROVIDES:${PN} += "ghc-utility-ht \
libHSutility-ht-0.0.17.2-E9mYTmSklQHJf02bWgeDJF-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
