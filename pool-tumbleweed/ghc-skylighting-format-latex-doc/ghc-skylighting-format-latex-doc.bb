SUMMARY = "Haskell skylighting-format-latex library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-format-latex library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-latex-doc-0.1-2.79.noarch.rpm"
RPM_HASH = "e8c053183fc6cb7dee8b572a145a72017a9b39d3bf01de5b99cf5bffdfb3da7814e8b13e503d15827db672c1da549b117c4a147b5345060ffacefc0660115664"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-format-latex-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
