SUMMARY = "Haskell old-locale library documentation"
DESCRIPTION = "This package provides the Haskell old-locale library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.7"

RPM_NAME = "ghc-old-locale-doc-1.0.0.7-13.23.noarch.rpm"
RPM_HASH = "d9e172c90582f6cfa43dda018a58eaff3c45d46949445db56dcfaa36bf954a0bfefa8f6d3b6a9c107382801fba95d2de2a575374096380305883d0c4354fc90d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-old-locale-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
