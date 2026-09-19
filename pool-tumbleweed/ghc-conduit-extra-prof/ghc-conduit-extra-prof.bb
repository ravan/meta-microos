SUMMARY = "Haskell conduit-extra profiling library"
DESCRIPTION = "This package provides the Haskell conduit-extra profiling library."
LICENSE = "MIT"

PV = "1.3.8"

RPM_NAME = "ghc-conduit-extra-prof-1.3.8-1.16.aarch64.rpm"
RPM_HASH = "1fe1d645455ff96b282f72ed5a401fb52468c4013bfb7d697603cf588ca873ba65fa81aa974ed3f886eca175c9bc8bde864c344040879eae5b9a132f8d6feae3"

RPROVIDES:${PN} += "ghc-conduit-extra-prof \
ghc-prof-conduit-extra-1.3.8-7wpnn7nJp1SI8VsobZmenc"

RDEPENDS:${PN} += "ghc-conduit-extra-devel \
ghc-prof-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6 \
ghc-prof-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-prof-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-prof-process-1.6.26.1-905d \
ghc-prof-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-prof-stm-2.5.3.1-6d74 \
ghc-prof-streaming-commons-0.2.3.1-LJ82XapHNc8JLhXXxelQgC \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-typed-process-0.2.13.0-Igkw9DqKpM63tp2LRi4SDw \
ghc-prof-unliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92"

inherit rpm
