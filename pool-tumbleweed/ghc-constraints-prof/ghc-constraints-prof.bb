SUMMARY = "Haskell constraints profiling library"
DESCRIPTION = "This package provides the Haskell constraints profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.14.4"

RPM_NAME = "ghc-constraints-prof-0.14.4-1.3.aarch64.rpm"
RPM_HASH = "8bbe3cb3033f8bb0586200ed778077e09a206b662b4fc9c5ccef3859aaf7d2df93af11c27a96d41dcbb5f021310aaa48f59777a1e6df55cb16b5f231d34702d1"

RPROVIDES:${PN} += "ghc-constraints-prof \
ghc-prof-constraints-0.14.4-7xyUtqfmnIL5WxGRWAAF5a"

RDEPENDS:${PN} += "ghc-constraints-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-binary-0.8.9.3-9861 \
ghc-prof-boring-0.2.2.1-8s8A4hTb7xgDndEEz6qoTw \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
