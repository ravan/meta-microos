SUMMARY = "Haskell yesod-core profiling library"
DESCRIPTION = "This package provides the Haskell yesod-core profiling library."
LICENSE = "MIT"

PV = "1.6.29.1"

RPM_NAME = "ghc-yesod-core-prof-1.6.29.1-1.6.aarch64.rpm"
RPM_HASH = "ce5e4858138c37cc2a18f8a2dc6fd953a5f4ffa713e6418713f6e8b87f8a5e2dddf0f7a5481ce4ce29c72673f7d18d102d51e6f5a40046c99040b11abb7dacf9"

RPROVIDES:${PN} += "ghc-prof-yesod-core-1.6.29.1-6DqdyPYDE9N9BEzGBhDP9D \
ghc-yesod-core-prof"

RDEPENDS:${PN} += "ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-attoparsec-aeson-2.2.2.0-3eQT8OmEdZa5yR7rBroXfj \
ghc-prof-auto-update-0.2.6-2tH9dVxiiOkBVROYgrOYPc \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-blaze-html-0.9.2.0-93B80xR5emg3yG3V6J7j6o \
ghc-prof-blaze-markup-0.8.3.0-K4FwMBPUUgu9TB66ALCxf7 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-prof-cereal-0.5.8.3-9RjPyVhfWFC69r1oCUPmww \
ghc-prof-clientsession-0.9.3.0-JpU1pAihQU34992h3KLc2j \
ghc-prof-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-prof-conduit-extra-1.3.8-7wpnn7nJp1SI8VsobZmenc \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-cookie-0.5.1-ICQl8upm830Ct2nb3AM1Ft \
ghc-prof-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-encoding-0.10.3-AvKSpiZHZdhEtvUKaxdqNC \
ghc-prof-entropy-0.4.1.11-4UsuhibEvcjLW75DCXDx9X \
ghc-prof-fast-logger-3.2.6-JkXOEB4fbDV8mDlAr0wMkH \
ghc-prof-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-prof-memory-0.18.0-4OCVGiXkS6t9StTfiwlZlu \
ghc-prof-monad-logger-0.3.42-GqHwch1CK1c5RziOTPSbJG \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-parsec-3.1.18.0-be05 \
ghc-prof-path-pieces-0.2.1-FtFHzM20JKUFHdFVBop6JH \
ghc-prof-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-prof-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-prof-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-prof-shakespeare-2.1.7.1-gK4gmGoNfcEYOAsglU3w4 \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-time-1.14-a7dc \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unix-compat-0.7.4.1-4v781Gok1KY8Kg7jV1j1vn \
ghc-prof-unliftio-0.2.25.1-8vIVLEQRNyE8ysD18Y7w9V \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-prof-wai-3.2.4-Is1UVC1czjX2cAufnl3tJW \
ghc-prof-wai-extra-3.1.18-ITQet8OpxGX98ABokzjnL2 \
ghc-prof-wai-logger-2.5.0-3cHzLKgypSbCdVbvyxsJiz \
ghc-prof-warp-3.4.9-4LBlVKyJZyS6kjQUEE5DAG \
ghc-prof-word8-0.1.3-DJye6up9iU5LN32ihJcMva \
ghc-yesod-core-devel"

inherit rpm
