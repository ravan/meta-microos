SUMMARY = "Haskell wai-extra library development files"
DESCRIPTION = "This package provides the Haskell wai-extra library development files."
LICENSE = "MIT"

PV = "3.1.18"

RPM_NAME = "ghc-wai-extra-devel-3.1.18-1.17.aarch64.rpm"
RPM_HASH = "7e45eb95acfc69e3c56ae5ba3b44f02cde926094c952fa98ed9d21fb46ae4908937c5588380c06a3637b94b191f60555759d885b3165878123ddb9ac9177d84a"

RPROVIDES:${PN} += "ghc-devel-wai-extra-3.1.18-ITQet8OpxGX98ABokzjnL2 \
ghc-wai-extra-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-HUnit-1.6.2.0-HyPyPtOZKKe7vLdGCWHz7V \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-ansi-terminal-1.1.5-KiVHPj6W9e81bxE9dBsVtZ \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-call-stack-0.4.0-5oZIckzxOZr1eMyD6xWtI3 \
ghc-devel-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-cookie-0.5.1-ICQl8upm830Ct2nb3AM1Ft \
ghc-devel-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-fast-logger-3.2.6-JkXOEB4fbDV8mDlAr0wMkH \
ghc-devel-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-devel-iproute-1.7.15-E8DjYDi46DFHUJbuCQco8p \
ghc-devel-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-devel-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-devel-streaming-commons-0.2.3.1-LJ82XapHNc8JLhXXxelQgC \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-time-1.14-a7dc \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unix-2.8.8.0-178a \
ghc-devel-vault-0.3.2.0-GYOqPpJA2DW5Qz2IFtkvei \
ghc-devel-wai-3.2.4-Is1UVC1czjX2cAufnl3tJW \
ghc-devel-wai-logger-2.5.0-3cHzLKgypSbCdVbvyxsJiz \
ghc-devel-warp-3.4.9-4LBlVKyJZyS6kjQUEE5DAG \
ghc-devel-word8-0.1.3-DJye6up9iU5LN32ihJcMva \
ghc-wai-extra"

inherit rpm
