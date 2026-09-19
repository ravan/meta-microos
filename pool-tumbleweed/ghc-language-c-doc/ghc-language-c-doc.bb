SUMMARY = "Haskell language-c library documentation"
DESCRIPTION = "This package provides the Haskell language-c library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "ghc-language-c-doc-0.10.2-1.3.noarch.rpm"
RPM_HASH = "1df04d1c8e698ecd8691d20d23c39fb02dc2423701a56e0624637a02d6c9e4a8ea8f4ab4585e6cdfbff6f4648432044315c6a13a6ec847dedf713c36f14554a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-language-c-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
