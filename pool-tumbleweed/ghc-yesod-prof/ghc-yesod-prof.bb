SUMMARY = "Haskell yesod profiling library"
DESCRIPTION = "This package provides the Haskell yesod profiling library."
LICENSE = "MIT"

PV = "1.6.2.3"

RPM_NAME = "ghc-yesod-prof-1.6.2.3-1.6.aarch64.rpm"
RPM_HASH = "203e43262af671434ac1892fe392494a0137d1aab2efe4fbba44030bbab20efa1452c4a828439417fdac86fa185aa0fb76a5e2616e37af6a95147acb05ccc317"

RPROVIDES:${PN} += "ghc-prof-yesod-1.6.2.3-IO9Ko13D27WJfV7Ym02Hjd \
ghc-yesod-prof"

RDEPENDS:${PN} += "ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-prof-data-default-class-0.2.0.0-3moOzwNUrN6FLgYZMunU62 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-fast-logger-3.2.6-JkXOEB4fbDV8mDlAr0wMkH \
ghc-prof-file-embed-0.0.16.0-JqsWezc6wrB9rh480YKWnn \
ghc-prof-monad-logger-0.3.42-GqHwch1CK1c5RziOTPSbJG \
ghc-prof-shakespeare-2.1.7.1-gK4gmGoNfcEYOAsglU3w4 \
ghc-prof-streaming-commons-0.2.3.1-LJ82XapHNc8JLhXXxelQgC \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-unix-2.8.8.0-178a \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-prof-wai-3.2.4-Is1UVC1czjX2cAufnl3tJW \
ghc-prof-wai-extra-3.1.18-ITQet8OpxGX98ABokzjnL2 \
ghc-prof-wai-logger-2.5.0-3cHzLKgypSbCdVbvyxsJiz \
ghc-prof-warp-3.4.9-4LBlVKyJZyS6kjQUEE5DAG \
ghc-prof-yaml-0.11.11.2-DNw228htw8L33w1OC1EWSt \
ghc-prof-yesod-core-1.6.29.1-6DqdyPYDE9N9BEzGBhDP9D \
ghc-prof-yesod-form-1.7.9.3-Dz0p5U8sFJF52s5S4twsNq \
ghc-prof-yesod-persistent-1.6.0.9-HWNmgLBsD5B8eUWPPveJe \
ghc-yesod-devel"

inherit rpm
