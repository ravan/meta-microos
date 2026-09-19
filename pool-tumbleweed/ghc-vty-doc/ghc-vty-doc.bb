SUMMARY = "Haskell vty library documentation"
DESCRIPTION = "This package provides the Haskell vty library documentation."
LICENSE = "BSD-3-Clause"

PV = "6.6"

RPM_NAME = "ghc-vty-doc-6.6-1.3.noarch.rpm"
RPM_HASH = "ea9f7b8a7ff2168a109adfbbd361f3f28284bf81ffa59727d641d2af98e5dedd10275d38cff00701acb6eab9fc72ec0a71cbf9a0d260fb0ea5a2644845a01801"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-vty-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
