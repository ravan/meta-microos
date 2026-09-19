SUMMARY = "Haskell data-default-class library documentation"
DESCRIPTION = "This package provides the Haskell data-default-class library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.0.0"

RPM_NAME = "ghc-data-default-class-doc-0.2.0.0-1.11.noarch.rpm"
RPM_HASH = "43ff42d1a04063062a944f146045927c457f5027c226c4297598a1748566609dadd108f24a845512dc067286b7c21ca02eec45b83d5d7618d3e2f409f0ae3b92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-data-default-class-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
