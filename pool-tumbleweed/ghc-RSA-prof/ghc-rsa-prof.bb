SUMMARY = "Haskell RSA profiling library"
DESCRIPTION = "This package provides the Haskell RSA profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.4.1"

RPM_NAME = "ghc-RSA-prof-2.4.1-1.28.aarch64.rpm"
RPM_HASH = "b2c6ccd4c2f3a9025d76cfc1053eab13444d093d97166d4b194b81a1e6dafa879abdce914dd02b31b3aeaf6f8144689887bcc712c7500be9eaf75a5eef0f4965"

RPROVIDES:${PN} += "ghc-RSA-prof \
ghc-prof-RSA-2.4.1-1xID0u6sJ2b79HlbaBWwck"

RDEPENDS:${PN} += "ghc-RSA-devel \
ghc-prof-SHA-1.6.4.4-F68cMQUf1qw5myCdTNffCM \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-binary-0.8.9.3-9861 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-crypto-api-0.13.3-BvysNl9crxvRkhKzviyjB \
ghc-prof-crypto-pubkey-types-0.4.3-DJq67n4kbNj6CHrsNYo02t"

inherit rpm
