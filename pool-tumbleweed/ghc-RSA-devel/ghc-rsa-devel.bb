SUMMARY = "Haskell RSA library development files"
DESCRIPTION = "This package provides the Haskell RSA library development files."
LICENSE = "BSD-3-Clause"

PV = "2.4.1"

RPM_NAME = "ghc-RSA-devel-2.4.1-1.28.aarch64.rpm"
RPM_HASH = "c713f183123839aedaf9dd86fb2a47b9ca1f5bb83118df60d453423bc5bf5a4ce69d7da0c9809a16eed30d695a02af025ca41ef029b83245e11477b699f3d8dc"

RPROVIDES:${PN} += "ghc-RSA-devel \
ghc-devel-RSA-2.4.1-1xID0u6sJ2b79HlbaBWwck"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-RSA \
ghc-compiler \
ghc-devel-SHA-1.6.4.4-F68cMQUf1qw5myCdTNffCM \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-binary-0.8.9.3-9861 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-crypto-api-0.13.3-BvysNl9crxvRkhKzviyjB \
ghc-devel-crypto-pubkey-types-0.4.3-DJq67n4kbNj6CHrsNYo02t"

inherit rpm
