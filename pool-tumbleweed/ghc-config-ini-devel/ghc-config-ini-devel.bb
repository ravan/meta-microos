SUMMARY = "Haskell config-ini library development files"
DESCRIPTION = "This package provides the Haskell config-ini library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.7.0"

RPM_NAME = "ghc-config-ini-devel-0.2.7.0-2.32.aarch64.rpm"
RPM_HASH = "6fa99cc0cce7736cfad8c8f8b26ccffc0e301c1bac90d42424f88b2ad74841d969431395330bb4f7bb2373991e205b606c7287d3b2ba42070db20dc8a7dae382"

RPROVIDES:${PN} += "ghc-config-ini-devel \
ghc-devel-config-ini-0.2.7.0-7oGnb0uYOjJ1nTfrjTJt8v"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-config-ini \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-megaparsec-9.7.1-3bWkE5RywYh6b8gn4lQrB6 \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu"

inherit rpm
