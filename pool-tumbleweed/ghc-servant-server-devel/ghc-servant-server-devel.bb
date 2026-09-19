SUMMARY = "Haskell servant-server library development files"
DESCRIPTION = "This package provides the Haskell servant-server library development files."
LICENSE = "BSD-3-Clause"

PV = "0.20.3.0"

RPM_NAME = "ghc-servant-server-devel-0.20.3.0-3.6.aarch64.rpm"
RPM_HASH = "12a62f284df948d67f6276b21b796b843a80f854f686cf7ecaab0e8ce920bd1200e7d2115906511bf05e6f767a1461e6d6ceffb50bf2e5bd19085dc2eae5034c"

RPROVIDES:${PN} += "ghc-devel-servant-server-0.20.3.0-EUZLoQT6Id58gnaZtFsp96 \
ghc-servant-server-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-constraints-0.14.4-7xyUtqfmnIL5WxGRWAAF5a \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-http-api-data-0.6.3-I1ef71ZD4mvBWZMbbifsIw \
ghc-devel-http-media-0.8.1.1-CGZiZUC7By82YjYrR6pIDk \
ghc-devel-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-devel-monad-control-1.0.3.1-EAQeykrh4iCEl5x3Heycqt \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-devel-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-devel-servant-0.20.3.0-AuNk1SYjBzoHus6V4PFhXb \
ghc-devel-sop-core-0.5.0.2-JbzyU3U5Jc9a9b8Omhy6m \
ghc-devel-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-transformers-base-0.4.6.1-AexBYmHB9CZDEWAojzlCzB \
ghc-devel-wai-3.2.4-Is1UVC1czjX2cAufnl3tJW \
ghc-devel-wai-app-static-3.1.9.1-79h1qWsU2OJ8maZZtyFIQX \
ghc-devel-word8-0.1.3-DJye6up9iU5LN32ihJcMva \
ghc-servant-server"

inherit rpm
