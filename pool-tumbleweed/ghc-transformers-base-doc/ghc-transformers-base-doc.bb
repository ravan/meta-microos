SUMMARY = "Haskell transformers-base library documentation"
DESCRIPTION = "This package provides the Haskell transformers-base library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.6.1"

RPM_NAME = "ghc-transformers-base-doc-0.4.6.1-1.3.noarch.rpm"
RPM_HASH = "a977d023fdea9fc9f81b44b6844e0b14d72c0d586e14c979ecc90b385ef1b3e47ce4cf2972a9f8693377901209ce57a8a4a18d036565d915a10c4809fcecc320"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-transformers-base-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
