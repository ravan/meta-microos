SUMMARY = "Haskell typst-symbols library documentation"
DESCRIPTION = "This package provides the Haskell typst-symbols library documentation."
LICENSE = "MIT"

PV = "0.2"

RPM_NAME = "ghc-typst-symbols-doc-0.2-1.2.noarch.rpm"
RPM_HASH = "cd60baa0d54fe75b3a3660d09ad0ab5b612f35734a29b1e1ba39a7aa8057eb446d19e2d8fddbd7bf066e72f0503e63cd353b2a9c78ac232aa09e131cd0410205"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-typst-symbols-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
