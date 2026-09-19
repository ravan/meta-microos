SUMMARY = "Haskell prettyprinter library documentation"
DESCRIPTION = "This package provides the Haskell prettyprinter library documentation."
LICENSE = "BSD-2-Clause"

PV = "1.7.2"

RPM_NAME = "ghc-prettyprinter-doc-1.7.2-1.3.noarch.rpm"
RPM_HASH = "e20bbfdeccc5372dbc2beefee6b5dd80b6d4e115bc2d5db87ae075ca7fdd19799b0a380b18e40a90ae273581ccd3c2733431f3aa90c80738b2a61693e2ea9172"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-prettyprinter-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
