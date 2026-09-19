SUMMARY = "Haskell ghci library development files"
DESCRIPTION = "This package provides the Haskell ghci library development files."
LICENSE = "BSD-3-Clause"

PV = "9.12.4"

RPM_NAME = "ghc-ghci-devel-9.12.4-1.3.aarch64.rpm"
RPM_HASH = "7c84045f131243f59b0a8622eaf57ffcbd37211068347d59558d221a1316dc33a85627edf7db0cc6589cccfd08ea98212c4727c9bdead0fbfffafdb38ecfcd0e"

RPROVIDES:${PN} += "ghc-devel-ghci-9.12.4-0749 \
ghc-ghci-devel \
ghc-ghci-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-binary-0.8.9.3-9861 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-ghc-boot-9.12.4-a5b3 \
ghc-devel-ghc-boot-th-9.12.4-0605 \
ghc-devel-ghc-heap-9.12.4-167c \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-devel-rts-1.0.3 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unix-2.8.8.0-178a \
ghc-ghci"

inherit rpm
