SUMMARY = "Haskell base64 library documentation"
DESCRIPTION = "This package provides the Haskell base64 library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "ghc-base64-doc-1.0-1.3.noarch.rpm"
RPM_HASH = "0d480789bfe7cc96b10af367fa3d3280516e2b03ebabe30a340ac38ef48ef5fdedf2956998ae148b38c635318044f4c971577b6b4242de3a42fe38e8a3c51c61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-base64-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
