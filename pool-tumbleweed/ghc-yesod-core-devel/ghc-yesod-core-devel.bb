SUMMARY = "Haskell yesod-core library development files"
DESCRIPTION = "This package provides the Haskell yesod-core library development files."
LICENSE = "MIT"

PV = "1.6.29.1"

RPM_NAME = "ghc-yesod-core-devel-1.6.29.1-1.6.aarch64.rpm"
RPM_HASH = "f010db30a9353709b5973206416a8f2a8405d30e03fd84b5bb56e8c9554073e685c08ba21ff5df5099ae966af7ca5618afa11235cf4f0f8daa7520c3dfe2626f"

RPROVIDES:${PN} += "ghc-devel-yesod-core-1.6.29.1-6DqdyPYDE9N9BEzGBhDP9D \
ghc-yesod-core-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-attoparsec-aeson-2.2.2.0-3eQT8OmEdZa5yR7rBroXfj \
ghc-devel-auto-update-0.2.6-2tH9dVxiiOkBVROYgrOYPc \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-blaze-html-0.9.2.0-93B80xR5emg3yG3V6J7j6o \
ghc-devel-blaze-markup-0.8.3.0-K4FwMBPUUgu9TB66ALCxf7 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-devel-cereal-0.5.8.3-9RjPyVhfWFC69r1oCUPmww \
ghc-devel-clientsession-0.9.3.0-JpU1pAihQU34992h3KLc2j \
ghc-devel-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-devel-conduit-extra-1.3.8-7wpnn7nJp1SI8VsobZmenc \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-cookie-0.5.1-ICQl8upm830Ct2nb3AM1Ft \
ghc-devel-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-encoding-0.10.3-AvKSpiZHZdhEtvUKaxdqNC \
ghc-devel-entropy-0.4.1.11-4UsuhibEvcjLW75DCXDx9X \
ghc-devel-fast-logger-3.2.6-JkXOEB4fbDV8mDlAr0wMkH \
ghc-devel-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-devel-memory-0.18.0-4OCVGiXkS6t9StTfiwlZlu \
ghc-devel-monad-logger-0.3.42-GqHwch1CK1c5RziOTPSbJG \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-parsec-3.1.18.0-be05 \
ghc-devel-path-pieces-0.2.1-FtFHzM20JKUFHdFVBop6JH \
ghc-devel-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-devel-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-devel-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-devel-shakespeare-2.1.7.1-gK4gmGoNfcEYOAsglU3w4 \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-time-1.14-a7dc \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unix-compat-0.7.4.1-4v781Gok1KY8Kg7jV1j1vn \
ghc-devel-unliftio-0.2.25.1-8vIVLEQRNyE8ysD18Y7w9V \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-devel-wai-3.2.4-Is1UVC1czjX2cAufnl3tJW \
ghc-devel-wai-extra-3.1.18-ITQet8OpxGX98ABokzjnL2 \
ghc-devel-wai-logger-2.5.0-3cHzLKgypSbCdVbvyxsJiz \
ghc-devel-warp-3.4.9-4LBlVKyJZyS6kjQUEE5DAG \
ghc-devel-word8-0.1.3-DJye6up9iU5LN32ihJcMva \
ghc-yesod-core"

inherit rpm
