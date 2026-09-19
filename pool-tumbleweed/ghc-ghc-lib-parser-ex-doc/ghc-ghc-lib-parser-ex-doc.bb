SUMMARY = "Haskell ghc-lib-parser-ex library documentation"
DESCRIPTION = "This package provides the Haskell ghc-lib-parser-ex library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.12.0.0"

RPM_NAME = "ghc-ghc-lib-parser-ex-doc-9.12.0.0-1.11.noarch.rpm"
RPM_HASH = "9bf53587afa9fa7daf1151c87c56fa7104df4d442f8f8ceebf7ba84fb3c8abe2f37be5428d2dbff07f587ea5e0ca204c5904e1b2af5b826dee6e088b4257ea18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-lib-parser-ex-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
