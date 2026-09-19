SUMMARY = "Haskell authenticate-oauth profiling library"
DESCRIPTION = "This package provides the Haskell authenticate-oauth profiling library."
LICENSE = "BSD-2-Clause"

PV = "1.7"

RPM_NAME = "ghc-authenticate-oauth-prof-1.7-1.16.aarch64.rpm"
RPM_HASH = "f001c57db0074c4846e30a2e2ed0196471dbd164b8e61945a198969b33230d7ab0384f2ba1309965bdd421e541962b524bda694bbbcea8574eceea369641a67e"

RPROVIDES:${PN} += "ghc-authenticate-oauth-prof \
ghc-prof-authenticate-oauth-1.7-Hl1x1wWymKfD65sPfJukkt"

RDEPENDS:${PN} += "ghc-authenticate-oauth-devel \
ghc-prof-RSA-2.4.1-1xID0u6sJ2b79HlbaBWwck \
ghc-prof-SHA-1.6.4.4-F68cMQUf1qw5myCdTNffCM \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-prof-blaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-crypto-pubkey-types-0.4.3-DJq67n4kbNj6CHrsNYo02t \
ghc-prof-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-prof-http-client-0.7.19-4BIOUl8FXXcE32miDzHR9M \
ghc-prof-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-prof-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-prof-time-1.14-a7dc \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-transformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW"

inherit rpm
