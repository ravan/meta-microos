SUMMARY = "Haskell appar profiling library"
DESCRIPTION = "This package provides the Haskell appar profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "ghc-appar-prof-0.1.8-4.23.aarch64.rpm"
RPM_HASH = "8323e9999d87cdc9fd836f0db45bfc09b01a076f092a68f52c6cb4b3b89419864ef887ff947e7bd601b9f23fda0a4972fd25550ef3e172c725188aaccdaf1390"

RPROVIDES:${PN} += "ghc-appar-prof \
ghc-prof-appar-0.1.8-WSZSnBitxp1mS4dOP2hyq"

RDEPENDS:${PN} += "ghc-appar-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be"

inherit rpm
