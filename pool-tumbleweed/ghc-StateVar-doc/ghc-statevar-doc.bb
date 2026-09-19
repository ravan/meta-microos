SUMMARY = "Haskell StateVar library documentation"
DESCRIPTION = "This package provides the Haskell StateVar library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2.2"

RPM_NAME = "ghc-StateVar-doc-1.2.2-2.23.noarch.rpm"
RPM_HASH = "350f46865f1882bda5d53402e017e14c7f556a68a8688781e12e62ce143721064bea9a2f6e89bdf2e0d8e648be2d32e1d4a44a6bed85961867f4f47604e49e6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-StateVar-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
