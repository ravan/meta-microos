SUMMARY = "Haskell esqueleto library development files"
DESCRIPTION = "This package provides the Haskell esqueleto library development files."
LICENSE = "BSD-3-Clause"

PV = "3.6.0.0"

RPM_NAME = "ghc-esqueleto-devel-3.6.0.0-1.17.aarch64.rpm"
RPM_HASH = "d12db05df81338fd0060721d797ed53fb5e214f15156d38e46fc1554653219c967c130f5bc56660ec7f02e708d22af09cdf75ec8df6489583a9d2c092eef6760"

RPROVIDES:${PN} += "ghc-devel-esqueleto-3.6.0.0-4dX9N9hTHfJ2dn3RluDp8O \
ghc-esqueleto-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-blaze-html-0.9.2.0-93B80xR5emg3yG3V6J7j6o \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-monad-logger-0.3.42-GqHwch1CK1c5RziOTPSbJG \
ghc-devel-persistent-2.17.1.0-4wNOAx2iKPh9qy3cL3mEtA \
ghc-devel-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-devel-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-time-1.14-a7dc \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unliftio-0.2.25.1-8vIVLEQRNyE8ysD18Y7w9V \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-esqueleto"

inherit rpm
