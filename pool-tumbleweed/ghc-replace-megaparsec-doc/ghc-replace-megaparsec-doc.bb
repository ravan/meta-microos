SUMMARY = "Haskell replace-megaparsec library documentation"
DESCRIPTION = "This package provides the Haskell replace-megaparsec library documentation."
LICENSE = "BSD-2-Clause"

PV = "1.5.0.1"

RPM_NAME = "ghc-replace-megaparsec-doc-1.5.0.1-1.12.noarch.rpm"
RPM_HASH = "d2a5b2f47481f32a2e9c1f7b682f29edffe1b610a9e4704d803ee470c8f172c9d0da2065edfee6acaa5bb95f953fc2b091f42d3a7a1aa9507aedc5bfe7dfef82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-replace-megaparsec-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
