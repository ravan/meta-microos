SUMMARY = "Haskell zlib profiling library"
DESCRIPTION = "This package provides the Haskell zlib profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.7.1.1"

RPM_NAME = "ghc-zlib-prof-0.7.1.1-1.9.aarch64.rpm"
RPM_HASH = "ceb94f867af3d9cabd683ea7b2e35ed2e09a38a2ec85808929349fd9378fa3a214438b01a8e263d603883ee6e8b45fa989002c58eecb4c728b25ae4820df79a2"

RPROVIDES:${PN} += "ghc-prof-zlib-0.7.1.1-9wvDfX7JlnE99sTdZLYOpU \
ghc-zlib-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-zlib-devel"

inherit rpm
