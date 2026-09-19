SUMMARY = "Haskell yesod-form library documentation"
DESCRIPTION = "This package provides the Haskell yesod-form library documentation."
LICENSE = "MIT"

PV = "1.7.9.3"

RPM_NAME = "ghc-yesod-form-doc-1.7.9.3-1.6.noarch.rpm"
RPM_HASH = "bbb8a4c1a557b8fdf87e1663bc47f0d7eff76673f90ce33e7a668b87b95f81ee59fefe93c198756dd659e477ae6ef3a12e5b18e1a67a640c96a20ff221ebb829"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-form-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
