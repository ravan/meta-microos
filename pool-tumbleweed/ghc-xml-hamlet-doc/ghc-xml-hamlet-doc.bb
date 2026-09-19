SUMMARY = "Haskell xml-hamlet library documentation"
DESCRIPTION = "This package provides the Haskell xml-hamlet library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.3"

RPM_NAME = "ghc-xml-hamlet-doc-0.5.0.3-1.10.noarch.rpm"
RPM_HASH = "a64c421a341b4cb6bb7892495ac3ac64024313e3666bff05d2ca08522f4eea2805a1048ce545dc822b2783e2d961901ad8be39ce0a5cf92dad1258cb1bfffce7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xml-hamlet-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
