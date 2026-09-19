SUMMARY = "Haskell binary library documentation"
DESCRIPTION = "This package provides the Haskell binary library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.9.3"

RPM_NAME = "ghc-binary-doc-0.8.9.3-1.3.noarch.rpm"
RPM_HASH = "a854d0cc1dab29f988d7b74bfb150f1fe74eb7630392828889703bcb678ba82438b498a607d09222a9e2ab98e4ad5a6a41b92de9250b845fed22fad3d2a238b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-binary-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
