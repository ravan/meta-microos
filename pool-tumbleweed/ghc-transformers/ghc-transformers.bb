SUMMARY = "Haskell transformers library"
DESCRIPTION = "This package provides the Haskell transformers library."
LICENSE = "BSD-3-Clause"

PV = "0.6.3.0"

RPM_NAME = "ghc-transformers-0.6.3.0-1.3.aarch64.rpm"
RPM_HASH = "c2ed65d90a02925fd42e8560c06c6331a52dd287fd387bbff53f6233b2aa845add84056bdfbc6af5e273cd5bb588059364bfe9989eb48950976ee7a11c5fd476"

RPROVIDES:${PN} += "ghc-transformers \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
