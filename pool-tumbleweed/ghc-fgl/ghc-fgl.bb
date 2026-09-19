SUMMARY = "Martin Erwig's Functional Graph Library"
DESCRIPTION = "An inductive representation of manipulating graph data structures. \
 \
Original website can be found at \
<http://web.engr.oregonstate.edu/~erwig/fgl/haskell>."
LICENSE = "BSD-3-Clause"

PV = "5.8.3.1"

RPM_NAME = "ghc-fgl-5.8.3.1-1.3.aarch64.rpm"
RPM_HASH = "ef601cce2ff15c708c8d35f656e7ac2ebf65ceba0d824071bf434f072751d25812ef1718e596bf4bf1b125eb552f8d0c5c47c186da5531d3264346a8bb1bfa60"

RPROVIDES:${PN} += "ghc-fgl \
libHSfgl-5.8.3.1-7WeyqbkdcX2Klu3tCAsWkr-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
