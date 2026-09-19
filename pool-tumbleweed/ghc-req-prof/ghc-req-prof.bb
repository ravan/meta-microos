SUMMARY = "Haskell req profiling library"
DESCRIPTION = "This package provides the Haskell req profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.13.4"

RPM_NAME = "ghc-req-prof-3.13.4-3.5.aarch64.rpm"
RPM_HASH = "ad1392a223103eca3be01f403dde6bc861312254dc85ae548cb0313dad762a8bbaa46b51d1bef005905cfcd9c4f5c64ad5f4435063774934378e7606f9a0f2c0"

RPROVIDES:${PN} += "ghc-prof-req-3.13.4-GNkdZfYi8gkLPTAscSZ3ct \
ghc-req-prof"

RDEPENDS:${PN} += "ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-authenticate-oauth-1.7-Hl1x1wWymKfD65sPfJukkt \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-blaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-crypton-connection-0.4.6-EpYbEhgynWEHAydR26M0y \
ghc-prof-data-default-class-0.2.0.0-3moOzwNUrN6FLgYZMunU62 \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-http-api-data-0.6.3-I1ef71ZD4mvBWZMbbifsIw \
ghc-prof-http-client-0.7.19-4BIOUl8FXXcE32miDzHR9M \
ghc-prof-http-client-tls-0.4.0-D4cx6zdDU3O6iLaLdAAVnV \
ghc-prof-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-prof-modern-uri-0.3.6.1-FkSqiN91z46EG0W2PccBZ6 \
ghc-prof-monad-control-1.0.3.1-EAQeykrh4iCEl5x3Heycqt \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-retry-0.9.3.1-Ul1oSc0PafBv9JJCTFdQa \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-transformers-base-0.4.6.1-AexBYmHB9CZDEWAojzlCzB \
ghc-prof-unliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92 \
ghc-req-devel"

inherit rpm
