SUMMARY = "Haskell conduit-extra library development files"
DESCRIPTION = "This package provides the Haskell conduit-extra library development files."
LICENSE = "MIT"

PV = "1.3.8"

RPM_NAME = "ghc-conduit-extra-devel-1.3.8-1.16.aarch64.rpm"
RPM_HASH = "dec2430bcedca822d67a3a0db45a5f54e3da33ae74be849a39ef86bd0160ffd5326dc271ea6c3035b9133e08a77731f3bcd8c142bea2d6d2da06b2e8165e27ca"

RPROVIDES:${PN} += "ghc-conduit-extra-devel \
ghc-devel-conduit-extra-1.3.8-7wpnn7nJp1SI8VsobZmenc"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-conduit-extra \
ghc-devel-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6 \
ghc-devel-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-devel-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-devel-process-1.6.26.1-905d \
ghc-devel-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-devel-streaming-commons-0.2.3.1-LJ82XapHNc8JLhXXxelQgC \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-typed-process-0.2.13.0-Igkw9DqKpM63tp2LRi4SDw \
ghc-devel-unliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92"

inherit rpm
