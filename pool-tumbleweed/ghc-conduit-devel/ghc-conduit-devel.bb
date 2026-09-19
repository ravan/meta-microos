SUMMARY = "Haskell conduit library development files"
DESCRIPTION = "This package provides the Haskell conduit library development files."
LICENSE = "MIT"

PV = "1.3.6.1"

RPM_NAME = "ghc-conduit-devel-1.3.6.1-1.23.aarch64.rpm"
RPM_HASH = "1b051401a6a37bc52e4d756a785657b356fca0a77eb2f9aebc46f5d718c7e604e77e0e429be3c7f88b1172b79b4c3ea46da3812425cd3372ef79acd2f77ec1c0"

RPROVIDES:${PN} += "ghc-conduit-devel \
ghc-devel-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-conduit \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-mono-traversable-1.0.21.0-7NlL4qRFn1MB3sC5GPCjes \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-devel-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unix-2.8.8.0-178a \
ghc-devel-unliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92 \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE"

inherit rpm
