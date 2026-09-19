SUMMARY = "Haskell constraints library documentation"
DESCRIPTION = "This package provides the Haskell constraints library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.14.4"

RPM_NAME = "ghc-constraints-doc-0.14.4-1.3.noarch.rpm"
RPM_HASH = "5e07c6cd2a6683d6512b0164b5f9a85d4cfdbfd6229032d359304f3545a39f388f9d580dc47aef0c30c4e231b43f96bf732afe6b034858df34c564f54c922027"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-constraints-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
