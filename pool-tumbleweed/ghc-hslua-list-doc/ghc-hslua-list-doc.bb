SUMMARY = "Haskell hslua-list library documentation"
DESCRIPTION = "This package provides the Haskell hslua-list library documentation."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "ghc-hslua-list-doc-1.1.4-1.13.noarch.rpm"
RPM_HASH = "7ba58850387083544c705e3cb82f36522b76369e806e2a877ac8b3bddde278b4445bd9427350123d78167021ac6e28cb1ed017e739011c219eda704bba1f558b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-list-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
