SUMMARY = "Haskell dec library documentation"
DESCRIPTION = "This package provides the Haskell dec library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.6"

RPM_NAME = "ghc-dec-doc-0.0.6-3.2.noarch.rpm"
RPM_HASH = "52276584aa3c91f4fb0967b74f7bd279307992b755fc5287f14ee9147e442c4c8adf19554abf6233f5079bdd71a024d9b8bf257576ed44de90d4ab8b7fc0fa54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-dec-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
