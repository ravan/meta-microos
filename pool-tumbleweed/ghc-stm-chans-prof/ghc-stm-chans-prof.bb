SUMMARY = "Haskell stm-chans profiling library"
DESCRIPTION = "This package provides the Haskell stm-chans profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.0.0.11"

RPM_NAME = "ghc-stm-chans-prof-3.0.0.11-1.3.aarch64.rpm"
RPM_HASH = "19503705e9b9fdf422b051f4d52fce82f3785a17ead7192fe505875f7f522223964c52a963373d207d848370c4d1139d0413f4424018b23bc902addbf128707e"

RPROVIDES:${PN} += "ghc-prof-stm-chans-3.0.0.11-JJwEZlsv6s72G5B5FYXgFK \
ghc-stm-chans-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-stm-2.5.3.1-6d74 \
ghc-stm-chans-devel"

inherit rpm
