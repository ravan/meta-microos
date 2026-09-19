SUMMARY = "Haskell aws profiling library"
DESCRIPTION = "This package provides the Haskell aws profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.25.3"

RPM_NAME = "ghc-aws-prof-0.25.3-1.3.aarch64.rpm"
RPM_HASH = "18c41953beedc4110b51ec7a98cb01c17767abe8bed476afe8b85306e1da265867cd59b9c469e7865a34a1f5fa3cc489f3a3b9bd87889f9c27b04dd84aaab2ce"

RPROVIDES:${PN} += "ghc-aws-prof \
ghc-prof-aws-0.25.3-KrczEqZYHex3TEa2HpZSbn"

RDEPENDS:${PN} += "ghc-aws-devel \
ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-prof-attoparsec-aeson-2.2.2.0-3eQT8OmEdZa5yR7rBroXfj \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base16-bytestring-1.0.2.0-IiVu4f3aSfMH2rpDgRP1QL \
ghc-prof-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-prof-blaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG \
ghc-prof-byteable-0.1.1-9wX3TD5RsfdJZP8DobkPHo \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-prof-cereal-0.5.8.3-9RjPyVhfWFC69r1oCUPmww \
ghc-prof-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-prof-conduit-extra-1.3.8-7wpnn7nJp1SI8VsobZmenc \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-crypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB \
ghc-prof-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-http-client-tls-0.4.0-D4cx6zdDU3O6iLaLdAAVnV \
ghc-prof-http-conduit-2.3.9.1-9k5MS2FS3s84zcOD2n4tN7 \
ghc-prof-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-prof-lifted-base-0.2.3.12-BonMj4p70Ef8zpL3zVJvsV \
ghc-prof-monad-control-1.0.3.1-EAQeykrh4iCEl5x3Heycqt \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-prof-network-bsd-2.8.1.0-Eim1HbjRi8aBvcsvglmxNx \
ghc-prof-old-locale-1.0.0.7-DplRrAcnBM96ijBftoXSc5 \
ghc-prof-ram-0.22.0-4Io46KcWliV5ncwh4lemlr \
ghc-prof-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-prof-safe-0.3.21-AzRUUYeJ47sQc55olWnva \
ghc-prof-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-prof-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-time-1.14-a7dc \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-prof-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-prof-xml-conduit-1.10.1.0-Jdtas0kp0k3Ah1vCZSqZl4"

inherit rpm
