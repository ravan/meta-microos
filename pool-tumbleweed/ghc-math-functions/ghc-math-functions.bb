SUMMARY = "Collection of tools for numeric computations"
DESCRIPTION = "This library contain collection of various utilities for numerical computing. \
So far there're special mathematical functions, compensated summation \
algorithm, summation of series, root finding for real functions, polynomial \
summation and Chebyshev polynomials."
LICENSE = "BSD-2-Clause"

PV = "0.3.4.4"

RPM_NAME = "ghc-math-functions-0.3.4.4-1.35.aarch64.rpm"
RPM_HASH = "0269a0e15437f2f8179af4ae8e29f873f2c25bad7918e71f23b6b289c2f7dcd1ef39089f6fd909218d00ecef807a3e3a6ffed8e42f30c5570af36c8a917ed17d"

RPROVIDES:${PN} += "ghc-math-functions \
libHSmath-functions-0.3.4.4-q26fT9mxS1GCWlSGs7P32-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdata-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ-ghc9.12.4.so \
libHSdata-default-class-0.2.0.0-3moOzwNUrN6FLgYZMunU62-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprimitive-0.9.1.0-Ez30Vu7tivmF28X1123Css-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSvector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE-ghc9.12.4.so \
libHSvector-stream-0.1.0.1-FXRnPnZDT7tJ4JCMEuh1XF-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
