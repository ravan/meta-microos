SUMMARY = "Haskell HUnit library documentation"
DESCRIPTION = "This package provides the Haskell HUnit library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6.2.0"

RPM_NAME = "ghc-HUnit-doc-1.6.2.0-2.35.noarch.rpm"
RPM_HASH = "65dd0011fb07b7cd797557f13c33b537dfedba3a5d57b486eff40be8bc4bc27018b5036c2754996c9d1a1cfd18258dd91af31ad92b6b428b81fa7ea0530c9a02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-HUnit-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
