SUMMARY = "Haskell unicode-collation library documentation"
DESCRIPTION = "This package provides the Haskell unicode-collation library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.1.3.7"

RPM_NAME = "ghc-unicode-collation-doc-0.1.3.7-1.3.noarch.rpm"
RPM_HASH = "ad26e334ecfbba676aafc100fca99863502f9790ae7bc4bff0d0f929ed46f1703ef47b5dd0b44abfcddceaf56da8238a1e71879e84cc13025fc6043def345e93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unicode-collation-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
