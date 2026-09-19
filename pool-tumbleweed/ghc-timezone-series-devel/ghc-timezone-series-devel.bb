SUMMARY = "Haskell timezone-series library development files"
DESCRIPTION = "This package provides the Haskell timezone-series library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.1.13"

RPM_NAME = "ghc-timezone-series-devel-0.1.13-4.3.aarch64.rpm"
RPM_HASH = "3eaee914eba01a583993e3a532dd235541212f0df67322fdadd6e0bddbf7cc3a4b5761f838b93ed682c41cdac3f912b34229cd6779024c1878424b40a4324643"

RPROVIDES:${PN} += "ghc-devel-timezone-series-0.1.13-B1H9AY16C4DSLWHEx9hhA \
ghc-timezone-series-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-time-1.14-a7dc \
ghc-timezone-series"

inherit rpm
