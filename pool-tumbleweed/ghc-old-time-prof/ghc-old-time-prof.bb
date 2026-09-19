SUMMARY = "Haskell old-time profiling library"
DESCRIPTION = "This package provides the Haskell old-time profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1.1.0"

RPM_NAME = "ghc-old-time-prof-1.1.1.0-1.3.aarch64.rpm"
RPM_HASH = "94b73627b92a5ddacaca370918412f86e851fe623417b3d8aff35b1577aeae3ea8e21e03ab9e32b66db3a3f1e3d1b74f2966672cf1e28653235687a0d347286b"

RPROVIDES:${PN} += "ghc-old-time-prof \
ghc-prof-old-time-1.1.1.0-LOMYAgPdxtNFCxdl8604aX"

RDEPENDS:${PN} += "ghc-old-time-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-old-locale-1.0.0.7-DplRrAcnBM96ijBftoXSc5"

inherit rpm
