SUMMARY = "Haskell attoparsec-aeson profiling library"
DESCRIPTION = "This package provides the Haskell attoparsec-aeson profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.2.2.0"

RPM_NAME = "ghc-attoparsec-aeson-prof-2.2.2.0-2.3.aarch64.rpm"
RPM_HASH = "cfbb9f163f22d5bf23b33428f7b199b2231c49c907afff035f32188e938efec0d2d8dc800f2ac64fecd9c46210b7c4bf2f187952e6f521a63d7103f6c6e58fde"

RPROVIDES:${PN} += "ghc-attoparsec-aeson-prof \
ghc-prof-attoparsec-aeson-2.2.2.0-3eQT8OmEdZa5yR7rBroXfj"

RDEPENDS:${PN} += "ghc-attoparsec-aeson-devel \
ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-character-ps-0.1-GfoAEUDpxFcFC0QreRJRaJ \
ghc-prof-integer-conversion-0.1.1-HaWNFfmKaxu3271U3IJ8uO \
ghc-prof-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-prof-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE"

inherit rpm
