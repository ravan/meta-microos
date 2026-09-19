SUMMARY = "Haskell atomic-counter library documentation"
DESCRIPTION = "This package provides the Haskell atomic-counter library documentation."
LICENSE = "Apache-2.0"

PV = "0.1.2.4"

RPM_NAME = "ghc-atomic-counter-doc-0.1.2.4-1.9.noarch.rpm"
RPM_HASH = "5b5c2471d421f0e876e25ed8f252b5b560b85bfb8496dea4addae4515a6fae42c6ff12ec7b023d389fb64fbb82a63cf0f89e5612946f1d7df444d4f56fdb4724"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-atomic-counter-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
