SUMMARY = "Haskell network-multicast profiling library"
DESCRIPTION = "This package provides the Haskell network-multicast profiling library."
LICENSE = "CC0-1.0"

PV = "0.3.2"

RPM_NAME = "ghc-network-multicast-prof-0.3.2-4.24.aarch64.rpm"
RPM_HASH = "fc56fe613c4df25e2ab530047f625f57f1570bdbbf22d75de7feaa16ec42295ba0bcd38c3bd6c8a3df30fc7eff0c007dd353137a774f568769c6614e0999cd58"

RPROVIDES:${PN} += "ghc-network-multicast-prof \
ghc-prof-network-multicast-0.3.2-DqSeOq9jAwXGqsSQlqcI6u"

RDEPENDS:${PN} += "ghc-network-multicast-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-prof-network-bsd-2.8.1.0-Eim1HbjRi8aBvcsvglmxNx"

inherit rpm
