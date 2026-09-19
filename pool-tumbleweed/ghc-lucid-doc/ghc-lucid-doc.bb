SUMMARY = "Haskell lucid library documentation"
DESCRIPTION = "This package provides the Haskell lucid library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.11.20260427"

RPM_NAME = "ghc-lucid-doc-2.11.20260427-1.3.noarch.rpm"
RPM_HASH = "9cbdc2ee63531a32ba0261ea547f9114edc0c6bfa82cad0e0a08ed6f696b6a456da50b923d976bf9b0da99322b0ce25dcea34f028125137bae3e47b1eb08b7ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-lucid-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
