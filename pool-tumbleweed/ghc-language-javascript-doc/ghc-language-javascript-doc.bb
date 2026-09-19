SUMMARY = "Haskell language-javascript library documentation"
DESCRIPTION = "This package provides the Haskell language-javascript library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.7.1.0"

RPM_NAME = "ghc-language-javascript-doc-0.7.1.0-4.37.noarch.rpm"
RPM_HASH = "7dbef6b7c1cee0b7a40d22e2bca3312fac680be1914687e1b7aa3ccc7ee79cbcf12bfaad6aef71fa9d67eec38aba2835c365f1e183e27c2b7a4d2a0f4218b2f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-language-javascript-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
