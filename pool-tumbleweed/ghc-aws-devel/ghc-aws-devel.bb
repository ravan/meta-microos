SUMMARY = "Haskell aws library development files"
DESCRIPTION = "This package provides the Haskell aws library development files."
LICENSE = "BSD-3-Clause"

PV = "0.25.3"

RPM_NAME = "ghc-aws-devel-0.25.3-1.3.aarch64.rpm"
RPM_HASH = "12600c37e6c4870968bdadca5b9dd4bbbbea8f45d228a62bb2091edb6abe0ac3b2fdc55cea3a03fb5def0a784518d8ce5e268dc3320f55fa9756b5a4f13fcd32"

RPROVIDES:${PN} += "ghc-aws-devel \
ghc-devel-aws-0.25.3-KrczEqZYHex3TEa2HpZSbn"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-aws \
ghc-compiler \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-devel-attoparsec-aeson-2.2.2.0-3eQT8OmEdZa5yR7rBroXfj \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base16-bytestring-1.0.2.0-IiVu4f3aSfMH2rpDgRP1QL \
ghc-devel-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-devel-blaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG \
ghc-devel-byteable-0.1.1-9wX3TD5RsfdJZP8DobkPHo \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-devel-cereal-0.5.8.3-9RjPyVhfWFC69r1oCUPmww \
ghc-devel-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-devel-conduit-extra-1.3.8-7wpnn7nJp1SI8VsobZmenc \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-crypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB \
ghc-devel-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-http-client-tls-0.4.0-D4cx6zdDU3O6iLaLdAAVnV \
ghc-devel-http-conduit-2.3.9.1-9k5MS2FS3s84zcOD2n4tN7 \
ghc-devel-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-devel-lifted-base-0.2.3.12-BonMj4p70Ef8zpL3zVJvsV \
ghc-devel-monad-control-1.0.3.1-EAQeykrh4iCEl5x3Heycqt \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-devel-network-bsd-2.8.1.0-Eim1HbjRi8aBvcsvglmxNx \
ghc-devel-old-locale-1.0.0.7-DplRrAcnBM96ijBftoXSc5 \
ghc-devel-ram-0.22.0-4Io46KcWliV5ncwh4lemlr \
ghc-devel-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-devel-safe-0.3.21-AzRUUYeJ47sQc55olWnva \
ghc-devel-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-devel-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-time-1.14-a7dc \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-devel-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-devel-xml-conduit-1.10.1.0-Jdtas0kp0k3Ah1vCZSqZl4"

inherit rpm
