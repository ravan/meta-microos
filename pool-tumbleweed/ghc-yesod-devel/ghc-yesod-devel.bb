SUMMARY = "Haskell yesod library development files"
DESCRIPTION = "This package provides the Haskell yesod library development files."
LICENSE = "MIT"

PV = "1.6.2.3"

RPM_NAME = "ghc-yesod-devel-1.6.2.3-1.6.aarch64.rpm"
RPM_HASH = "7f051f72d8c327423d84b70a7aada4ef9f8163f915f5cf3f1dcd10bc2a9470a0ecfa054975ae8db6da6eed92c306ddd57bc0111daf3b848ce43e2f5ec92bfcc8"

RPROVIDES:${PN} += "ghc-devel-yesod-1.6.2.3-IO9Ko13D27WJfV7Ym02Hjd \
ghc-yesod-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-devel-data-default-class-0.2.0.0-3moOzwNUrN6FLgYZMunU62 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-fast-logger-3.2.6-JkXOEB4fbDV8mDlAr0wMkH \
ghc-devel-file-embed-0.0.16.0-JqsWezc6wrB9rh480YKWnn \
ghc-devel-monad-logger-0.3.42-GqHwch1CK1c5RziOTPSbJG \
ghc-devel-shakespeare-2.1.7.1-gK4gmGoNfcEYOAsglU3w4 \
ghc-devel-streaming-commons-0.2.3.1-LJ82XapHNc8JLhXXxelQgC \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-unix-2.8.8.0-178a \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-devel-wai-3.2.4-Is1UVC1czjX2cAufnl3tJW \
ghc-devel-wai-extra-3.1.18-ITQet8OpxGX98ABokzjnL2 \
ghc-devel-wai-logger-2.5.0-3cHzLKgypSbCdVbvyxsJiz \
ghc-devel-warp-3.4.9-4LBlVKyJZyS6kjQUEE5DAG \
ghc-devel-yaml-0.11.11.2-DNw228htw8L33w1OC1EWSt \
ghc-devel-yesod-core-1.6.29.1-6DqdyPYDE9N9BEzGBhDP9D \
ghc-devel-yesod-form-1.7.9.3-Dz0p5U8sFJF52s5S4twsNq \
ghc-devel-yesod-persistent-1.6.0.9-HWNmgLBsD5B8eUWPPveJe \
ghc-yesod"

inherit rpm
