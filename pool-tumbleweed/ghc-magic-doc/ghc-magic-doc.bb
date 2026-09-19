SUMMARY = "Haskell magic library documentation"
DESCRIPTION = "This package provides the Haskell magic library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1.2"

RPM_NAME = "ghc-magic-doc-1.1.2-1.2.noarch.rpm"
RPM_HASH = "ab65237a5bef9b466dc9a5cb6c7320d723f92fc4a2d02a4542efd7d56e77f96d5363d8b49be0a508ee0ccb78d2303a60d42a60bcf2d2099878904343b29f0ae9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-magic-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
