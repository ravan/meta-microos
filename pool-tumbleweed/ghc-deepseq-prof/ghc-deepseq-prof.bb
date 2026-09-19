SUMMARY = "Haskell deepseq profiling library"
DESCRIPTION = "This package provides the Haskell deepseq profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.5.1.0"

RPM_NAME = "ghc-deepseq-prof-1.5.1.0-1.3.aarch64.rpm"
RPM_HASH = "321d8ead5da4f793b054056b35c54b1222ff288c6db21d7211cc54af2beaf56d69421db5e451b0aeef6a54e37b985e5a728034aa8decba978d37e822348845e8"

RPROVIDES:${PN} += "ghc-deepseq-prof \
ghc-prof-deepseq-1.5.1.0-1350 \
libHSdeepseq-1.5.1.0-1350-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-deepseq-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-ghc-prim-0.13.0-f55c \
libHSbase-4.21.2.0-8844-p-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-p-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-p-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-p-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
