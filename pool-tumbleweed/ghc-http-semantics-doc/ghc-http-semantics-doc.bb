SUMMARY = "Haskell http-semantics library documentation"
DESCRIPTION = "This package provides the Haskell http-semantics library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "ghc-http-semantics-doc-0.3.0-1.16.noarch.rpm"
RPM_HASH = "f9a61a809d1f5f954c4a540cb500aba2f5f95dfcf5b3c3f761e3a411bf0627dce7c217ff5515d7f85e2bdd61f6a4da54150789c352a9cf4589cef3052ea49aa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-semantics-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
