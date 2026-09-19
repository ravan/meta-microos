SUMMARY = "Haskell http-api-data library documentation"
DESCRIPTION = "This package provides the Haskell http-api-data library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.6.3"

RPM_NAME = "ghc-http-api-data-doc-0.6.3-1.4.noarch.rpm"
RPM_HASH = "334b8459f1653467ab719333651233807040fd5da08d29f959ed9c7eff55b71d12de62aa3b3462e58826e57a1429e846798a944ad1d64ca18a93f9760cf5c901"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-api-data-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
