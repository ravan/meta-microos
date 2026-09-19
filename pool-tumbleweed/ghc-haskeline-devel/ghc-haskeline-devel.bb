SUMMARY = "Haskell haskeline library development files"
DESCRIPTION = "This package provides the Haskell haskeline library development files."
LICENSE = "BSD-3-Clause"

PV = "0.8.4.1"

RPM_NAME = "ghc-haskeline-devel-0.8.4.1-1.3.aarch64.rpm"
RPM_HASH = "6786ab8c7dd6d184a582b3e66531865cabff2dd87c55a53ad69dcdc6a464b56f544de25edecdb3fea40228cd6ca9961e081f675d54e0bc86d89343ea0474731f"

RPROVIDES:${PN} += "ghc-devel-haskeline-0.8.4.1-767e \
ghc-haskeline-devel \
ghc-haskeline-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-process-1.6.26.1-905d \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-devel-terminfo-0.4.1.7-3afa \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unix-2.8.8.0-178a \
ghc-haskeline"

inherit rpm
