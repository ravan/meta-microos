SUMMARY = "Haskell attoparsec-aeson library development files"
DESCRIPTION = "This package provides the Haskell attoparsec-aeson library development \
files."
LICENSE = "BSD-3-Clause"

PV = "2.2.2.0"

RPM_NAME = "ghc-attoparsec-aeson-devel-2.2.2.0-2.3.aarch64.rpm"
RPM_HASH = "e66642363bae8c1974017f38b0aaf4981f76302e0a4c1919b26e8d6e7ac4529f1a9e2566af007e39989da87c6ba6a0b2b418ac7bd2f73d8b7dc50d6b70c63671"

RPROVIDES:${PN} += "ghc-attoparsec-aeson-devel \
ghc-devel-attoparsec-aeson-2.2.2.0-3eQT8OmEdZa5yR7rBroXfj"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-attoparsec-aeson \
ghc-compiler \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-character-ps-0.1-GfoAEUDpxFcFC0QreRJRaJ \
ghc-devel-integer-conversion-0.1.1-HaWNFfmKaxu3271U3IJ8uO \
ghc-devel-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-devel-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE"

inherit rpm
