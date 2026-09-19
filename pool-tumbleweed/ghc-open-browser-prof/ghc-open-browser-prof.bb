SUMMARY = "Haskell open-browser profiling library"
DESCRIPTION = "This package provides the Haskell open-browser profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.0"

RPM_NAME = "ghc-open-browser-prof-0.4.0.0-1.6.aarch64.rpm"
RPM_HASH = "437439ebd07e7f55e3a4405545783e728bfe2a4f12273b4e0327f62228af4c4e08c734d3d8f521410d17d806b35fa9d73b9d30212368f616ac505096fc283775"

RPROVIDES:${PN} += "ghc-open-browser-prof \
ghc-prof-open-browser-0.4.0.0-7biGibAfoQqCCBDffMcbRg"

RDEPENDS:${PN} += "ghc-open-browser-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-process-1.6.26.1-905d"

inherit rpm
