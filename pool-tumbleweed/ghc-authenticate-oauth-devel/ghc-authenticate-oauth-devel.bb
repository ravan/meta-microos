SUMMARY = "Haskell authenticate-oauth library development files"
DESCRIPTION = "This package provides the Haskell authenticate-oauth library development \
files."
LICENSE = "BSD-2-Clause"

PV = "1.7"

RPM_NAME = "ghc-authenticate-oauth-devel-1.7-1.16.aarch64.rpm"
RPM_HASH = "169be1164f4b006fe7ca57c351ad867364c661bbe26a693acb202a621433b5b32936d8b88b06c0d7c916a4e5f99b99bd605f0b3d7a0de669c3040dadf2f712aa"

RPROVIDES:${PN} += "ghc-authenticate-oauth-devel \
ghc-devel-authenticate-oauth-1.7-Hl1x1wWymKfD65sPfJukkt"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-authenticate-oauth \
ghc-compiler \
ghc-devel-RSA-2.4.1-1xID0u6sJ2b79HlbaBWwck \
ghc-devel-SHA-1.6.4.4-F68cMQUf1qw5myCdTNffCM \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-devel-blaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-crypto-pubkey-types-0.4.3-DJq67n4kbNj6CHrsNYo02t \
ghc-devel-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-devel-http-client-0.7.19-4BIOUl8FXXcE32miDzHR9M \
ghc-devel-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-devel-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-devel-time-1.14-a7dc \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-transformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW"

inherit rpm
