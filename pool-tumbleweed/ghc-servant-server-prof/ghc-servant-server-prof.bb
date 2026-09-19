SUMMARY = "Haskell servant-server profiling library"
DESCRIPTION = "This package provides the Haskell servant-server profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.20.3.0"

RPM_NAME = "ghc-servant-server-prof-0.20.3.0-3.6.aarch64.rpm"
RPM_HASH = "b9ff133f2f6b905cb1e1071a6cf10793bfa06f455178eba595a2cb5cc509cb4e45d6b23a93829b023cebab794ec3da05c74f7b1b8c58e24ac07cb2b9c210b3aa"

RPROVIDES:${PN} += "ghc-prof-servant-server-0.20.3.0-EUZLoQT6Id58gnaZtFsp96 \
ghc-servant-server-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-constraints-0.14.4-7xyUtqfmnIL5WxGRWAAF5a \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-http-api-data-0.6.3-I1ef71ZD4mvBWZMbbifsIw \
ghc-prof-http-media-0.8.1.1-CGZiZUC7By82YjYrR6pIDk \
ghc-prof-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-prof-monad-control-1.0.3.1-EAQeykrh4iCEl5x3Heycqt \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-prof-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-prof-servant-0.20.3.0-AuNk1SYjBzoHus6V4PFhXb \
ghc-prof-sop-core-0.5.0.2-JbzyU3U5Jc9a9b8Omhy6m \
ghc-prof-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-transformers-base-0.4.6.1-AexBYmHB9CZDEWAojzlCzB \
ghc-prof-wai-3.2.4-Is1UVC1czjX2cAufnl3tJW \
ghc-prof-wai-app-static-3.1.9.1-79h1qWsU2OJ8maZZtyFIQX \
ghc-prof-word8-0.1.3-DJye6up9iU5LN32ihJcMva \
ghc-servant-server-devel"

inherit rpm
