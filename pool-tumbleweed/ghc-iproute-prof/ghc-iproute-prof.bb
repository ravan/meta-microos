SUMMARY = "Haskell iproute profiling library"
DESCRIPTION = "This package provides the Haskell iproute profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.7.15"

RPM_NAME = "ghc-iproute-prof-1.7.15-1.19.aarch64.rpm"
RPM_HASH = "6f4b64ccf43c5f9eee80ce761e664edd764e9808dfce4e0e63b002fc154aed7f94ec892a93b7ad21f40ec593f32b2ad4a26f4e13bfdd1830555fc4490c8152f0"

RPROVIDES:${PN} += "ghc-iproute-prof \
ghc-prof-iproute-1.7.15-E8DjYDi46DFHUJbuCQco8p"

RDEPENDS:${PN} += "ghc-iproute-devel \
ghc-prof-appar-0.1.8-WSZSnBitxp1mS4dOP2hyq \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-byteorder-1.0.4-2KwV8jNH81I9JBUzKyr4X2 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI"

inherit rpm
