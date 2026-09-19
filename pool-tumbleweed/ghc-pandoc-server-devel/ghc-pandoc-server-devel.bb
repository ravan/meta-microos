SUMMARY = "Haskell pandoc-server library development files"
DESCRIPTION = "This package provides the Haskell pandoc-server library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.3"

RPM_NAME = "ghc-pandoc-server-devel-0.1.3-1.5.aarch64.rpm"
RPM_HASH = "21565e617a78843ecd01dae862949fe541fb448bebd662ed6095b6d03dea522cc47dc23bb56276d1d5a82581fa55b5bc0f9d349eb86ef1ba48c69af3695898cc"

RPROVIDES:${PN} += "ghc-devel-pandoc-server-0.1.3-7sXM3AcGDIwBkeoEopIjq \
ghc-pandoc-server-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-devel-doctemplates-0.11.0.1-IzKaCnMe41UBaZntO1p87J \
ghc-devel-pandoc-3.10-JLto7RkhLOI6KJZumkARl \
ghc-devel-pandoc-types-1.23.1.2-ChVVUkZ84FqF7WWwilaI65 \
ghc-devel-servant-server-0.20.3.0-EUZLoQT6Id58gnaZtFsp96 \
ghc-devel-skylighting-0.14.7-K7tduWH6oDI3SHlt3x5zoz \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-unicode-collation-0.1.3.7-15abqneWG6p19BxNVdLS7C \
ghc-devel-wai-3.2.4-Is1UVC1czjX2cAufnl3tJW \
ghc-devel-wai-cors-0.2.7-2KEC2j0rC3VACXCCYdkSR7 \
ghc-pandoc-server"

inherit rpm
