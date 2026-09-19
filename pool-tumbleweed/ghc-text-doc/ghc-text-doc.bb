SUMMARY = "Haskell text library documentation"
DESCRIPTION = "This package provides the Haskell text library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.1.4"

RPM_NAME = "ghc-text-doc-2.1.4-1.3.noarch.rpm"
RPM_HASH = "6d6b75afbb3fa507b8e1916c669e193ae0e3d2106aa29ca1f8f311eaf2b581dc76135902ce24eeff459e571831a3a8f2959921e134f4a67c3def5b6c8d3130a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-text-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
