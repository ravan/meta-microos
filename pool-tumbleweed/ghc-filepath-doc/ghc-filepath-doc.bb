SUMMARY = "Haskell filepath library documentation"
DESCRIPTION = "This package provides the Haskell filepath library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.5.5.0"

RPM_NAME = "ghc-filepath-doc-1.5.5.0-1.3.noarch.rpm"
RPM_HASH = "79535729875fc15d02fd481b0d09a3a028caaab6a5d95bc01bd41a0a846f3a015c3d68a0ec7b9d9023d797efd313863fc5ca179d78a454fec68efd66df442550"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-filepath-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
