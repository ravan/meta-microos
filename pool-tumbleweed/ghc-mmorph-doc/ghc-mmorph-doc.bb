SUMMARY = "Haskell mmorph library documentation"
DESCRIPTION = "This package provides the Haskell mmorph library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2.2"

RPM_NAME = "ghc-mmorph-doc-1.2.2-1.3.noarch.rpm"
RPM_HASH = "564f25d8b965552d49191a60b3bd37c6333b38b65b24d3e73e3afcf70db78027c3fde143d45aa26b8cea88bccf6680ae5438e6c5d4c4507d6708b48695de4c63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-mmorph-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
