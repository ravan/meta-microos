SUMMARY = "Haskell haddock-api library documentation"
DESCRIPTION = "This package provides the Haskell haddock-api library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.32.0"

RPM_NAME = "ghc-haddock-api-doc-2.32.0-1.3.noarch.rpm"
RPM_HASH = "c30237209634956a397f80b6ff7df382ddb782e67aadfddae54b0023927f06d9c84b55c5e9624ed83db3abd427c3457850f831ef1c90492595703f12ac4212df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-haddock-api-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
