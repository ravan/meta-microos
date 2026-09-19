SUMMARY = "Haskell recv library documentation"
DESCRIPTION = "This package provides the Haskell recv library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-recv-doc-0.1.1-1.8.noarch.rpm"
RPM_HASH = "6a45fc9f54679cef9f9e0967b0e7a61e1db7b1d59e02710a51aeabfb92c6085caa0356c29e69b82181a485da07469dcf49559e3e0ff6db52b28a6370aa232b6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-recv-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
