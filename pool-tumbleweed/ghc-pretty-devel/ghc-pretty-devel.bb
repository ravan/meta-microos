SUMMARY = "Haskell pretty library development files"
DESCRIPTION = "This package provides the Haskell pretty library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1.3.6"

RPM_NAME = "ghc-pretty-devel-1.1.3.6-1.3.aarch64.rpm"
RPM_HASH = "4f2bd68b3a565adf419a63002d797d33cb35e84e93b429f1fee376342f399d8459d21e9ac768f166b7ba481ecbd05ae1a2890149cbf5a1d64aa179a6caec57d9"

RPROVIDES:${PN} += "ghc-devel-pretty-1.1.3.6-b7fd \
ghc-pretty-devel \
ghc-pretty-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-pretty"

inherit rpm
