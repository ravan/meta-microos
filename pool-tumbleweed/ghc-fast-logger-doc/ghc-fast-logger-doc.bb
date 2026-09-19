SUMMARY = "Haskell fast-logger library documentation"
DESCRIPTION = "This package provides the Haskell fast-logger library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.2.6"

RPM_NAME = "ghc-fast-logger-doc-3.2.6-1.11.noarch.rpm"
RPM_HASH = "2bb736d571897120dfeedf61c56e4da9ece3f54927ce1b10ce4befbd6242558489475e864c1b88ea2615ebc85fea32cc0eb71062b0a2343f8e415ed06325eeb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-fast-logger-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
