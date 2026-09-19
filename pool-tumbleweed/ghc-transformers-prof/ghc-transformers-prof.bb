SUMMARY = "Haskell transformers profiling library"
DESCRIPTION = "This package provides the Haskell transformers profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6.3.0"

RPM_NAME = "ghc-transformers-prof-0.6.3.0-1.3.aarch64.rpm"
RPM_HASH = "59432e45bac142026a9db38bc1ec34d457d5dabe223544a2bbce75572bd4731d8da6e5b0ea73e065d5d86e0706207bb0f92dad1dec35401790a0de47bffad0b0"

RPROVIDES:${PN} += "ghc-prof-transformers-0.6.3.0-4709 \
ghc-transformers-prof \
libHStransformers-0.6.3.0-4709-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-transformers-devel \
libHSbase-4.21.2.0-8844-p-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-p-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-p-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-p-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
