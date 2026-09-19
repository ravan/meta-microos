SUMMARY = "Haskell Glob library documentation"
DESCRIPTION = "This package provides the Haskell Glob library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "ghc-Glob-doc-0.10.2-3.35.noarch.rpm"
RPM_HASH = "d8c61b6e0db9d19c1b44c21ced71fe9ddc45145f4357e024c23684ee261c8d6dd0ce5abc4cf8f42f5d8000fba7c629ae48bf2772357468968fed57d5cb5bbc5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-Glob-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
