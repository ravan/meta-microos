SUMMARY = "Haskell yesod library documentation"
DESCRIPTION = "This package provides the Haskell yesod library documentation."
LICENSE = "MIT"

PV = "1.6.2.3"

RPM_NAME = "ghc-yesod-doc-1.6.2.3-1.6.noarch.rpm"
RPM_HASH = "772fba51ed61297ad63ec08b4fac0fcce651b975e61df4ae6091370cd27148702ab7c06df6ea0eb93be6c445684d69d0bfd776d3fabb1ac57a24dfcae062f2e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
