SUMMARY = "Haskell xml library documentation"
DESCRIPTION = "This package provides the Haskell xml library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.14"

RPM_NAME = "ghc-xml-doc-1.3.14-13.32.noarch.rpm"
RPM_HASH = "65bd2394c72be8f59c7511dd5b51b04a8a7fe70b4798b9a45549fb6b8c292ed11f5e81c22545d0a1a3a339d036c22239eea9d13e663d5c82e5bc53e4c3e765f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xml-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
