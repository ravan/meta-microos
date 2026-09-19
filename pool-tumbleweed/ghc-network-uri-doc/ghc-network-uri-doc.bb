SUMMARY = "Haskell network-uri library documentation"
DESCRIPTION = "This package provides the Haskell network-uri library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.6.4.2"

RPM_NAME = "ghc-network-uri-doc-2.6.4.2-3.29.noarch.rpm"
RPM_HASH = "fb708af731441024cbb4a1c0590b2b6256ba232fad83370da32913d897c4fabb61f3a9a6848ff4aaba9c7ee9394df91b21dbe8796bc3eeac1043fda5b825e805"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-network-uri-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
