SUMMARY = "GHC manual"
DESCRIPTION = "This package provides the User Guide and Haddock manual."
LICENSE = "BSD-3-Clause"

PV = "9.12.4"

RPM_NAME = "ghc-manual-9.12.4-1.3.noarch.rpm"
RPM_HASH = "938251862000727c0ac8438ad758f275b2e445fb58a5da0d48c3a9d9e85004d5cc725830685ca2ef29158f292a2c3f05fd84c638e7701928372c9611d55d8b8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-manual"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
