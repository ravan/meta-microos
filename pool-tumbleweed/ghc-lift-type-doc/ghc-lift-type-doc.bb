SUMMARY = "Haskell lift-type library documentation"
DESCRIPTION = "This package provides the Haskell lift-type library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.2.0"

RPM_NAME = "ghc-lift-type-doc-0.1.2.0-1.12.noarch.rpm"
RPM_HASH = "13a3146c247b21f034502f5c3210b1c7d0886053680777d6fdded438a958440f878ee847fd39880171161ef8349112b785aae07a45b21162626daae314e87c3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-lift-type-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
