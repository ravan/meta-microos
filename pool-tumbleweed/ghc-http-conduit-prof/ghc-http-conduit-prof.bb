SUMMARY = "Haskell http-conduit profiling library"
DESCRIPTION = "This package provides the Haskell http-conduit profiling library."
LICENSE = "BSD-2-Clause"

PV = "2.3.9.1"

RPM_NAME = "ghc-http-conduit-prof-2.3.9.1-2.5.aarch64.rpm"
RPM_HASH = "cab89e12ad1a8b0314b4afab441c84510153cd9e015bae9d06a22a7e67b0d2f3fd66470912b14b8fb2e24a2d536939be6096710cf02a704ff95a2f59436faffc"

RPROVIDES:${PN} += "ghc-http-conduit-prof \
ghc-prof-http-conduit-2.3.9.1-9k5MS2FS3s84zcOD2n4tN7"

RDEPENDS:${PN} += "ghc-http-conduit-devel \
ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-prof-attoparsec-aeson-2.2.2.0-3eQT8OmEdZa5yR7rBroXfj \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-prof-conduit-extra-1.3.8-7wpnn7nJp1SI8VsobZmenc \
ghc-prof-http-client-0.7.19-4BIOUl8FXXcE32miDzHR9M \
ghc-prof-http-client-tls-0.4.0-D4cx6zdDU3O6iLaLdAAVnV \
ghc-prof-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92"

inherit rpm
