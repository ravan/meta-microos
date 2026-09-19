SUMMARY = "Haskell JuicyPixels profiling library"
DESCRIPTION = "This package provides the Haskell JuicyPixels profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.3.9"

RPM_NAME = "ghc-JuicyPixels-prof-3.3.9-2.3.aarch64.rpm"
RPM_HASH = "f87573c83752e1eb96ccb2d2c78bcdaf559fb0fa47b451fea26f3b13ba852ac4b8e8dcd7a8135db1414fc868a96463fc5e18d4ec25f32cf417680223607ac1ae"

RPROVIDES:${PN} += "ghc-JuicyPixels-prof \
ghc-prof-JuicyPixels-3.3.9-IB5FNR8B0oDG4pRl7Jn2Mb"

RDEPENDS:${PN} += "ghc-JuicyPixels-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-binary-0.8.9.3-9861 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-prof-zlib-0.7.1.1-9wvDfX7JlnE99sTdZLYOpU"

inherit rpm
