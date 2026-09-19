SUMMARY = "Haskell ghc-heap library documentation"
DESCRIPTION = "This package provides the Haskell ghc-heap library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.12.4"

RPM_NAME = "ghc-ghc-heap-doc-9.12.4-1.3.noarch.rpm"
RPM_HASH = "e572598822c660408a3bfb3be2dcc4eef7b1fd729137a97edb23db9d8d050b69e02e3df2715a8731f202c61f07a76ca3e0d89cc6a83c9f5af3bdb6bfe13bd96f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-heap-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
