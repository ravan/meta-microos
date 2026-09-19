SUMMARY = "Haskell persistent profiling library"
DESCRIPTION = "This package provides the Haskell persistent profiling library."
LICENSE = "MIT"

PV = "2.17.1.0"

RPM_NAME = "ghc-persistent-prof-2.17.1.0-1.19.aarch64.rpm"
RPM_HASH = "22d1b27594fe816c2f26a2561772dfcc601b626c2a9552f221aa230cd056873469e296671352ff0a8c8fc3579fb969b4cbfdf291554a3f7eab2d347cf93e5079"

RPROVIDES:${PN} += "ghc-persistent-prof \
ghc-prof-persistent-2.17.1.0-4wNOAx2iKPh9qy3cL3mEtA"

RDEPENDS:${PN} += "ghc-persistent-devel \
ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-prof-attoparsec-aeson-2.2.2.0-3eQT8OmEdZa5yR7rBroXfj \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-prof-blaze-html-0.9.2.0-93B80xR5emg3yG3V6J7j6o \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-fast-logger-3.2.6-JkXOEB4fbDV8mDlAr0wMkH \
ghc-prof-http-api-data-0.6.3-I1ef71ZD4mvBWZMbbifsIw \
ghc-prof-lift-type-0.1.2.0-5Wrf181y1CRJpVkgxBFKkO \
ghc-prof-megaparsec-9.7.1-3bWkE5RywYh6b8gn4lQrB6 \
ghc-prof-monad-logger-0.3.42-GqHwch1CK1c5RziOTPSbJG \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-path-pieces-0.2.1-FtFHzM20JKUFHdFVBop6JH \
ghc-prof-replace-megaparsec-1.5.0.1-3raT401RHe83TCy1jsbTxZ \
ghc-prof-resource-pool-0.5.0.1-CRHTi96cJqx7YSyfyqtukW \
ghc-prof-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-prof-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-prof-semigroupoids-6.0.2-B6Y5GIvJ2JI8mXJpMQTJaF \
ghc-prof-silently-1.2.5.4-54yCGOZ1hqDAcZZPz9a2Bu \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-th-lift-instances-0.1.20-A0nCC2bmuVRHGZj0nSUeyw \
ghc-prof-time-1.14-a7dc \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unliftio-0.2.25.1-8vIVLEQRNyE8ysD18Y7w9V \
ghc-prof-unliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92 \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-prof-vault-0.3.2.0-GYOqPpJA2DW5Qz2IFtkvei \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE"

inherit rpm
