SUMMARY = "Haskell req library development files"
DESCRIPTION = "This package provides the Haskell req library development files."
LICENSE = "BSD-3-Clause"

PV = "3.13.4"

RPM_NAME = "ghc-req-devel-3.13.4-3.5.aarch64.rpm"
RPM_HASH = "89fa8a23c1cbba0c0a1cfa4bf6bfe23185deb43269a2545bd20e3bf8a009155932ed743e31d846f10ccdd90a2b47a98b1dec3b85c52db15b5e68afa69caed098"

RPROVIDES:${PN} += "ghc-devel-req-3.13.4-GNkdZfYi8gkLPTAscSZ3ct \
ghc-req-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-authenticate-oauth-1.7-Hl1x1wWymKfD65sPfJukkt \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-blaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-crypton-connection-0.4.6-EpYbEhgynWEHAydR26M0y \
ghc-devel-data-default-class-0.2.0.0-3moOzwNUrN6FLgYZMunU62 \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-http-api-data-0.6.3-I1ef71ZD4mvBWZMbbifsIw \
ghc-devel-http-client-0.7.19-4BIOUl8FXXcE32miDzHR9M \
ghc-devel-http-client-tls-0.4.0-D4cx6zdDU3O6iLaLdAAVnV \
ghc-devel-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-devel-modern-uri-0.3.6.1-FkSqiN91z46EG0W2PccBZ6 \
ghc-devel-monad-control-1.0.3.1-EAQeykrh4iCEl5x3Heycqt \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-retry-0.9.3.1-Ul1oSc0PafBv9JJCTFdQa \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-transformers-base-0.4.6.1-AexBYmHB9CZDEWAojzlCzB \
ghc-devel-unliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92 \
ghc-req"

inherit rpm
