SUMMARY = "Haskell conduit profiling library"
DESCRIPTION = "This package provides the Haskell conduit profiling library."
LICENSE = "MIT"

PV = "1.3.6.1"

RPM_NAME = "ghc-conduit-prof-1.3.6.1-1.23.aarch64.rpm"
RPM_HASH = "6a93940f0cc1479abea1cdae0efa381e1538ad1b52a4ea6fcf945d7beda23f4e96c03bf69683b573a3d850569635192076620d2667784b2f1f09e954edaab2af"

RPROVIDES:${PN} += "ghc-conduit-prof \
ghc-prof-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt"

RDEPENDS:${PN} += "ghc-conduit-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-mono-traversable-1.0.21.0-7NlL4qRFn1MB3sC5GPCjes \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-prof-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unix-2.8.8.0-178a \
ghc-prof-unliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92 \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE"

inherit rpm
