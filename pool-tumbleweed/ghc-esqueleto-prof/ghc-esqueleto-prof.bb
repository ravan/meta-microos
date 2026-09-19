SUMMARY = "Haskell esqueleto profiling library"
DESCRIPTION = "This package provides the Haskell esqueleto profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.6.0.0"

RPM_NAME = "ghc-esqueleto-prof-3.6.0.0-1.17.aarch64.rpm"
RPM_HASH = "a2c06e9fe069e8a220165d8683837c7e4ba3f5d8089360b1ddaa8dc61caae2a3e9d862a3c643cb1218c7603bfafb69b7bb970d864477388c64ae114ca8348a0f"

RPROVIDES:${PN} += "ghc-esqueleto-prof \
ghc-prof-esqueleto-3.6.0.0-4dX9N9hTHfJ2dn3RluDp8O"

RDEPENDS:${PN} += "ghc-esqueleto-devel \
ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-blaze-html-0.9.2.0-93B80xR5emg3yG3V6J7j6o \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-monad-logger-0.3.42-GqHwch1CK1c5RziOTPSbJG \
ghc-prof-persistent-2.17.1.0-4wNOAx2iKPh9qy3cL3mEtA \
ghc-prof-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-prof-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-time-1.14-a7dc \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unliftio-0.2.25.1-8vIVLEQRNyE8ysD18Y7w9V \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu"

inherit rpm
