SUMMARY = "Haskell xml-types library documentation"
DESCRIPTION = "This package provides the Haskell xml-types library documentation."
LICENSE = "MIT"

PV = "0.3.8"

RPM_NAME = "ghc-xml-types-doc-0.3.8-4.23.noarch.rpm"
RPM_HASH = "6faeaf102495dd9a69496bb8c8d09f9578f1abdab438d35551d83549d20f132eb7f695e8b37e1c119d4568e700bdbb495a715b6bb1716148d1dc7774a58d61b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xml-types-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
