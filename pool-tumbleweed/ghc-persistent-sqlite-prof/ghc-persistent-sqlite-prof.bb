SUMMARY = "Haskell persistent-sqlite profiling library"
DESCRIPTION = "This package provides the Haskell persistent-sqlite profiling library."
LICENSE = "MIT"

PV = "2.13.3.1"

RPM_NAME = "ghc-persistent-sqlite-prof-2.13.3.1-1.26.aarch64.rpm"
RPM_HASH = "122d60dac0d0ae5f066c5907299d6ce47cdc776099b40515851eedae39a73c29a663cc71c3a027e100a197cdf54399b489e1981608d3768e2d95ce32986bc74b"

RPROVIDES:${PN} += "ghc-persistent-sqlite-prof \
ghc-prof-persistent-sqlite-2.13.3.1-IdOK9Fw5cMI6O2h4Rb96Ym"

RDEPENDS:${PN} += "ghc-persistent-sqlite-devel \
ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-microlens-th-0.4.3.18-5y491C8iAr58VYbwqIS2QN \
ghc-prof-monad-logger-0.3.42-GqHwch1CK1c5RziOTPSbJG \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-persistent-2.17.1.0-4wNOAx2iKPh9qy3cL3mEtA \
ghc-prof-resource-pool-0.5.0.1-CRHTi96cJqx7YSyfyqtukW \
ghc-prof-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-time-1.14-a7dc \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92 \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu"

inherit rpm
