SUMMARY = "Haskell pandoc-server profiling library"
DESCRIPTION = "This package provides the Haskell pandoc-server profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.3"

RPM_NAME = "ghc-pandoc-server-prof-0.1.3-1.5.aarch64.rpm"
RPM_HASH = "306cd431b03d7e6568e083153c545771a910e8dd9a0055a72babba432b30ed7e18ddd855d1a3254977485f1585ec159e69a4d7beda668f4e84e10261cba96ece"

RPROVIDES:${PN} += "ghc-pandoc-server-prof \
ghc-prof-pandoc-server-0.1.3-7sXM3AcGDIwBkeoEopIjq"

RDEPENDS:${PN} += "ghc-pandoc-server-devel \
ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-prof-doctemplates-0.11.0.1-IzKaCnMe41UBaZntO1p87J \
ghc-prof-pandoc-3.10-JLto7RkhLOI6KJZumkARl \
ghc-prof-pandoc-types-1.23.1.2-ChVVUkZ84FqF7WWwilaI65 \
ghc-prof-servant-server-0.20.3.0-EUZLoQT6Id58gnaZtFsp96 \
ghc-prof-skylighting-0.14.7-K7tduWH6oDI3SHlt3x5zoz \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-unicode-collation-0.1.3.7-15abqneWG6p19BxNVdLS7C \
ghc-prof-wai-3.2.4-Is1UVC1czjX2cAufnl3tJW \
ghc-prof-wai-cors-0.2.7-2KEC2j0rC3VACXCCYdkSR7"

inherit rpm
