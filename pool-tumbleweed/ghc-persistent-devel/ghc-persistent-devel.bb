SUMMARY = "Haskell persistent library development files"
DESCRIPTION = "This package provides the Haskell persistent library development files."
LICENSE = "MIT"

PV = "2.17.1.0"

RPM_NAME = "ghc-persistent-devel-2.17.1.0-1.19.aarch64.rpm"
RPM_HASH = "1be712e177418d2489516bc85d271f078cdd5bb77bd5a8918c84647a56c745767cad7c1380f027f4e7ed2d4638250a03f43447038d7bde5dfae665268bbcf6e3"

RPROVIDES:${PN} += "ghc-devel-persistent-2.17.1.0-4wNOAx2iKPh9qy3cL3mEtA \
ghc-persistent-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-devel-attoparsec-aeson-2.2.2.0-3eQT8OmEdZa5yR7rBroXfj \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-devel-blaze-html-0.9.2.0-93B80xR5emg3yG3V6J7j6o \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-fast-logger-3.2.6-JkXOEB4fbDV8mDlAr0wMkH \
ghc-devel-http-api-data-0.6.3-I1ef71ZD4mvBWZMbbifsIw \
ghc-devel-lift-type-0.1.2.0-5Wrf181y1CRJpVkgxBFKkO \
ghc-devel-megaparsec-9.7.1-3bWkE5RywYh6b8gn4lQrB6 \
ghc-devel-monad-logger-0.3.42-GqHwch1CK1c5RziOTPSbJG \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-path-pieces-0.2.1-FtFHzM20JKUFHdFVBop6JH \
ghc-devel-replace-megaparsec-1.5.0.1-3raT401RHe83TCy1jsbTxZ \
ghc-devel-resource-pool-0.5.0.1-CRHTi96cJqx7YSyfyqtukW \
ghc-devel-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-devel-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-devel-semigroupoids-6.0.2-B6Y5GIvJ2JI8mXJpMQTJaF \
ghc-devel-silently-1.2.5.4-54yCGOZ1hqDAcZZPz9a2Bu \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-th-lift-instances-0.1.20-A0nCC2bmuVRHGZj0nSUeyw \
ghc-devel-time-1.14-a7dc \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unliftio-0.2.25.1-8vIVLEQRNyE8ysD18Y7w9V \
ghc-devel-unliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92 \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-devel-vault-0.3.2.0-GYOqPpJA2DW5Qz2IFtkvei \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-persistent"

inherit rpm
