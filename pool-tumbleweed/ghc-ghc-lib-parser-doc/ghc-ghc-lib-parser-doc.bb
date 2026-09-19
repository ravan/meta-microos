SUMMARY = "Haskell ghc-lib-parser library documentation"
DESCRIPTION = "This package provides the Haskell ghc-lib-parser library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.12.3.20251228"

RPM_NAME = "ghc-ghc-lib-parser-doc-9.12.3.20251228-1.3.noarch.rpm"
RPM_HASH = "27fa3e5932669e63daf3a0f957b637d348fe2567e28ecd564b574a988e2a676ffa1271b3cda11c6b7000e98fc52a75ed2b8c5095703e216f7e9ce320b62a0935"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-lib-parser-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
