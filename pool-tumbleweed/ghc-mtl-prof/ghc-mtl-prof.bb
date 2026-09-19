SUMMARY = "Haskell mtl profiling library"
DESCRIPTION = "This package provides the Haskell mtl profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.3.2"

RPM_NAME = "ghc-mtl-prof-2.3.2-1.3.aarch64.rpm"
RPM_HASH = "ff6dddacd3fa4966ab5681da77f29600f68b1dc98c20aed8803cfb292843e0cd5183078a1302eed084fc6a5d4972af732aa1f9fcc74b1d2b9b9a2b5fae85e36e"

RPROVIDES:${PN} += "ghc-mtl-prof \
ghc-prof-mtl-2.3.2-37ef \
libHSmtl-2.3.2-37ef-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-mtl-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-transformers-0.6.3.0-4709 \
libHSbase-4.21.2.0-8844-p-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-p-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-p-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-p-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-p-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
