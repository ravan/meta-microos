SUMMARY = "Haskell persistent-sqlite library development files"
DESCRIPTION = "This package provides the Haskell persistent-sqlite library development \
files."
LICENSE = "MIT"

PV = "2.13.3.1"

RPM_NAME = "ghc-persistent-sqlite-devel-2.13.3.1-1.26.aarch64.rpm"
RPM_HASH = "6567e071ffcb8eeec99d7915189421971f682f735c34dff6a7d9f94ae41353df6b871410be28ef2dcc302063fd30712398ff33582bca1de5c1e7f0e46ea29b9c"

RPROVIDES:${PN} += "ghc-devel-persistent-sqlite-2.13.3.1-IdOK9Fw5cMI6O2h4Rb96Ym \
ghc-persistent-sqlite-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-microlens-th-0.4.3.18-5y491C8iAr58VYbwqIS2QN \
ghc-devel-monad-logger-0.3.42-GqHwch1CK1c5RziOTPSbJG \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-persistent-2.17.1.0-4wNOAx2iKPh9qy3cL3mEtA \
ghc-devel-resource-pool-0.5.0.1-CRHTi96cJqx7YSyfyqtukW \
ghc-devel-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-time-1.14-a7dc \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92 \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-persistent-sqlite \
glibc-devel"

inherit rpm
