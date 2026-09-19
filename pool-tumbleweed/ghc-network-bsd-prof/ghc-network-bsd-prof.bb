SUMMARY = "Haskell network-bsd profiling library"
DESCRIPTION = "This package provides the Haskell network-bsd profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.8.1.0"

RPM_NAME = "ghc-network-bsd-prof-2.8.1.0-9.16.aarch64.rpm"
RPM_HASH = "e459ca6efdb0a183f2f7e6ed08cf02c1e5d8f79329dcd1ff3e36c121b400f4c4667a4d0a4df36a2ad81f9813f5157a1d8f3c36c26e172bf3bb05b4fa332ce433"

RPROVIDES:${PN} += "ghc-network-bsd-prof \
ghc-prof-network-bsd-2.8.1.0-Eim1HbjRi8aBvcsvglmxNx"

RDEPENDS:${PN} += "ghc-network-bsd-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI"

inherit rpm
