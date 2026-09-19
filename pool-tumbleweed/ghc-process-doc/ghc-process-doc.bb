SUMMARY = "Haskell process library documentation"
DESCRIPTION = "This package provides the Haskell process library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6.26.1"

RPM_NAME = "ghc-process-doc-1.6.26.1-1.3.noarch.rpm"
RPM_HASH = "313f91fcd98aaf465f195a008164d777e17922bd03c5b087631c56398fa4d32d06cac1963eaf1fe3bbd0829939de942ed555176bf3cca7884808f7958953b4f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-process-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
