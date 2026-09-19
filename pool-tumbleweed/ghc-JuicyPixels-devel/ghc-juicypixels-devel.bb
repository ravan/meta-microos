SUMMARY = "Haskell JuicyPixels library development files"
DESCRIPTION = "This package provides the Haskell JuicyPixels library development files."
LICENSE = "BSD-3-Clause"

PV = "3.3.9"

RPM_NAME = "ghc-JuicyPixels-devel-3.3.9-2.3.aarch64.rpm"
RPM_HASH = "83fa707014a05239db4eae6cccd03d85aa0bf63d08717f2d7345754115b83b667b43c2ed391edb5bf0a421aacd1106ac9fcce81c7a4922a629329fb2df0c7467"

RPROVIDES:${PN} += "ghc-JuicyPixels-devel \
ghc-devel-JuicyPixels-3.3.9-IB5FNR8B0oDG4pRl7Jn2Mb"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-JuicyPixels \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-binary-0.8.9.3-9861 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-devel-zlib-0.7.1.1-9wvDfX7JlnE99sTdZLYOpU"

inherit rpm
