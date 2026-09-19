SUMMARY = "Haskell HTTP library documentation"
DESCRIPTION = "This package provides the Haskell HTTP library documentation."
LICENSE = "BSD-3-Clause"

PV = "4000.4.1"

RPM_NAME = "ghc-HTTP-doc-4000.4.1-5.11.noarch.rpm"
RPM_HASH = "91d622419c9cae94c435ad9d947fcd0fadde582227c56cde51b5ba375f327c78d45794bf3b9f27cbe9fd1dd03a9f8580ae91fa7d467aaccefcfabb2225d3d076"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-HTTP-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
