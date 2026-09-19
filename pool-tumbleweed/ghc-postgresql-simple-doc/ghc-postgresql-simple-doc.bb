SUMMARY = "Haskell postgresql-simple library documentation"
DESCRIPTION = "This package provides the Haskell postgresql-simple library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.7.0.1"

RPM_NAME = "ghc-postgresql-simple-doc-0.7.0.1-1.11.noarch.rpm"
RPM_HASH = "ed82e574f8d00f9b45d3498ff405a66f83ca416f98a230f6df9a66122652f15494d20854a0456ce42c4d253e56689c1625b501bfed4c49bf453f1a0ee956b3e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-postgresql-simple-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
