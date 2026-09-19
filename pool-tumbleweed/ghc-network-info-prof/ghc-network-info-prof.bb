SUMMARY = "Haskell network-info profiling library"
DESCRIPTION = "This package provides the Haskell network-info profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-network-info-prof-0.2.1-2.21.aarch64.rpm"
RPM_HASH = "b1b92c965e78e7bb922e918f2200a6f25e647f3523a483e264c2048a2e72e40b497026e880a4ea38a805249a0beed6367c75142e7951fb6fb933b70dc8869ab4"

RPROVIDES:${PN} += "ghc-network-info-prof \
ghc-prof-network-info-0.2.1-I1lcnyergC0DdfN7xa3e0a"

RDEPENDS:${PN} += "ghc-network-info-devel \
ghc-prof-base-4.21.2.0-8844"

inherit rpm
