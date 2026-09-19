SUMMARY = "Haskell wai-extra profiling library"
DESCRIPTION = "This package provides the Haskell wai-extra profiling library."
LICENSE = "MIT"

PV = "3.1.18"

RPM_NAME = "ghc-wai-extra-prof-3.1.18-1.17.aarch64.rpm"
RPM_HASH = "c75f473e74f35fcb56ac3d95e181cc615b330aa6b29965444a1776bc2bd39aad75d0edd253b683105016b65fbea79095150f880e1226ef27621f0e56db7d88fc"

RPROVIDES:${PN} += "ghc-prof-wai-extra-3.1.18-ITQet8OpxGX98ABokzjnL2 \
ghc-wai-extra-prof"

RDEPENDS:${PN} += "ghc-prof-HUnit-1.6.2.0-HyPyPtOZKKe7vLdGCWHz7V \
ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-ansi-terminal-1.1.5-KiVHPj6W9e81bxE9dBsVtZ \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-call-stack-0.4.0-5oZIckzxOZr1eMyD6xWtI3 \
ghc-prof-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-cookie-0.5.1-ICQl8upm830Ct2nb3AM1Ft \
ghc-prof-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-fast-logger-3.2.6-JkXOEB4fbDV8mDlAr0wMkH \
ghc-prof-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-prof-iproute-1.7.15-E8DjYDi46DFHUJbuCQco8p \
ghc-prof-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-prof-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-prof-streaming-commons-0.2.3.1-LJ82XapHNc8JLhXXxelQgC \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-time-1.14-a7dc \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unix-2.8.8.0-178a \
ghc-prof-vault-0.3.2.0-GYOqPpJA2DW5Qz2IFtkvei \
ghc-prof-wai-3.2.4-Is1UVC1czjX2cAufnl3tJW \
ghc-prof-wai-logger-2.5.0-3cHzLKgypSbCdVbvyxsJiz \
ghc-prof-warp-3.4.9-4LBlVKyJZyS6kjQUEE5DAG \
ghc-prof-word8-0.1.3-DJye6up9iU5LN32ihJcMva \
ghc-wai-extra-devel"

inherit rpm
