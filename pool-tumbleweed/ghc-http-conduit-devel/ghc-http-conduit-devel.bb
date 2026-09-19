SUMMARY = "Haskell http-conduit library development files"
DESCRIPTION = "This package provides the Haskell http-conduit library development files."
LICENSE = "BSD-2-Clause"

PV = "2.3.9.1"

RPM_NAME = "ghc-http-conduit-devel-2.3.9.1-2.5.aarch64.rpm"
RPM_HASH = "4c88e7a098c5fd9e70d615ae923dfe9c675cd2902f60f64bc7c451f01dc3d36f265bdac97fba1b2905f1733ac7fff46b0532f8a8eef6583539aaefa3debbf9bb"

RPROVIDES:${PN} += "ghc-devel-http-conduit-2.3.9.1-9k5MS2FS3s84zcOD2n4tN7 \
ghc-http-conduit-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-devel-attoparsec-aeson-2.2.2.0-3eQT8OmEdZa5yR7rBroXfj \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-devel-conduit-extra-1.3.8-7wpnn7nJp1SI8VsobZmenc \
ghc-devel-http-client-0.7.19-4BIOUl8FXXcE32miDzHR9M \
ghc-devel-http-client-tls-0.4.0-D4cx6zdDU3O6iLaLdAAVnV \
ghc-devel-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92 \
ghc-http-conduit"

inherit rpm
