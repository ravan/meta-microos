SUMMARY = "Haskell case-insensitive library documentation"
DESCRIPTION = "This package provides the Haskell case-insensitive library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.0"

RPM_NAME = "ghc-case-insensitive-doc-1.2.1.0-6.29.noarch.rpm"
RPM_HASH = "8bcffabbf87d1b6f17965f1a1d11110432f922812b23cc441781bb675ba53402fc1374470418a71bf8f4d5b103e6db16f331edbaa9eb86f1db51440e5ab527cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-case-insensitive-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
