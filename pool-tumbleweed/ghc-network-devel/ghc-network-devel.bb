SUMMARY = "Haskell network library development files"
DESCRIPTION = "This package provides the Haskell network library development files."
LICENSE = "BSD-3-Clause"

PV = "3.2.8.0"

RPM_NAME = "ghc-network-devel-3.2.8.0-1.9.aarch64.rpm"
RPM_HASH = "35d608a374449b549637cd1b09893eeb41e94bf1005f61dd4fecb09ddac8ec168bd6813222d8f8dd88220dcba9f629a0126a73cb49fc1cba0574cbe7b2535d0b"

RPROVIDES:${PN} += "ghc-devel-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-network-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-network"

inherit rpm
