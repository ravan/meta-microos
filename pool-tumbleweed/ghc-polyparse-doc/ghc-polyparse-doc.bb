SUMMARY = "Haskell polyparse library documentation"
DESCRIPTION = "This package provides the Haskell polyparse library documentation."
LICENSE = "LGPL-2.1-only"

PV = "1.13.1"

RPM_NAME = "ghc-polyparse-doc-1.13.1-1.9.noarch.rpm"
RPM_HASH = "d02b6dfe3eb06307ccba5c54b4affd9fd2afc10a1942366044bd76977facaba2e05f5c6b8f43f97a1c037cddb5dd76a4b6549fc0a8c2b648236ba27c7eccd291"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-polyparse-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
