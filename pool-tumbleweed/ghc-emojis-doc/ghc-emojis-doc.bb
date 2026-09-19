SUMMARY = "Haskell emojis library documentation"
DESCRIPTION = "This package provides the Haskell emojis library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.5"

RPM_NAME = "ghc-emojis-doc-0.1.5-1.3.noarch.rpm"
RPM_HASH = "bdf7d7ab010251286bedc660577368855451a92d7ef414c269240a0fc3f9d12a8d67c4f73e83104f3c10e0bf922acfc30670af8d4cb58fa1750c27c9e612e1e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-emojis-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
