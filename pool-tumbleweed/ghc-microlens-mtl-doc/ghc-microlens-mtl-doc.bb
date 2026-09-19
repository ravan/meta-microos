SUMMARY = "Haskell microlens-mtl library documentation"
DESCRIPTION = "This package provides the Haskell microlens-mtl library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.1"

RPM_NAME = "ghc-microlens-mtl-doc-0.2.1.1-1.9.noarch.rpm"
RPM_HASH = "3218f9c3e0ea9a46881324f6f257bed25a60dbadba6e87a17694039d1151ca7a92c71ac5f95f0df8ed01cac6e0603ebb6ee528f20628b3b49b84c366aefd6b13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-microlens-mtl-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
