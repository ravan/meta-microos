SUMMARY = "Microlens + array, bytestring, containers, transformers"
DESCRIPTION = "Use this package instead of <http://hackage.haskell.org/package/microlens \
microlens> if you don't mind depending on all dependencies here – \
'Lens.Micro.GHC' reexports everything from 'Lens.Micro' and additionally \
provides orphan instances of microlens classes for packages coming with GHC \
(<http://hackage.haskell.org/package/array array>, \
<http://hackage.haskell.org/package/bytestring bytestring>, \
<http://hackage.haskell.org/package/containers containers>, \
<http://hackage.haskell.org/package/transfromers transformers>). \
 \
The minor and major versions of microlens-ghc are incremented whenever the \
minor and major versions of microlens are incremented, so you can depend on the \
exact version of microlens-ghc without specifying the version of microlens you \
need. \
 \
This package is a part of the <http://hackage.haskell.org/package/microlens \
microlens> family; see the readme \
<https://github.com/stevenfontanella/microlens#readme on Github>."
LICENSE = "BSD-3-Clause"

PV = "0.4.15.2"

RPM_NAME = "ghc-microlens-ghc-0.4.15.2-1.9.aarch64.rpm"
RPM_HASH = "d597a32b49fb753c2f32a7501bdf4f168d0a79041c934de4f680c7ddc4f2c4d0be0267194e9651c76e6597016fd1403b49d93c355689822571b6fb416e25d0c5"

RPROVIDES:${PN} += "ghc-microlens-ghc \
libHSmicrolens-ghc-0.4.15.2-Cj0815upqHk4qg3lDbGmdr-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmicrolens-0.5.0.0-K1fQqqDyjwS5maOWIXQxx3-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
