SUMMARY = "Haskell parallel library development files"
DESCRIPTION = "This package provides the Haskell parallel library development files."
LICENSE = "BSD-3-Clause"

PV = "3.2.2.0"

RPM_NAME = "ghc-parallel-devel-3.2.2.0-16.9.aarch64.rpm"
RPM_HASH = "3f1f5919423cc7a8f408867e7781570465fdf99f4899bf2bd8f118d69606d6403a83ed490f8c080c765d5cfc71bf4846726bba9b900c8021321e24f6c9785601"

RPROVIDES:${PN} += "ghc-devel-parallel-3.2.2.0-DHmdQd1fQsJFTMvpGLTdNS \
ghc-parallel-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-parallel"

inherit rpm
