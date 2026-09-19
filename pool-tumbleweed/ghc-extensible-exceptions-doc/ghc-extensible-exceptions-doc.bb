SUMMARY = "Haskell extensible-exceptions library documentation"
DESCRIPTION = "This package provides the Haskell extensible-exceptions library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.4"

RPM_NAME = "ghc-extensible-exceptions-doc-0.1.1.4-7.23.noarch.rpm"
RPM_HASH = "587377f1220ce374031945d1054b6a7982a578be3f9c6fb191401d6a6a37fb6cd0db481ffd08eae8ce9ff1e1ca6898716804e60d6e940e0c7ba189d5d6d2a288"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-extensible-exceptions-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
