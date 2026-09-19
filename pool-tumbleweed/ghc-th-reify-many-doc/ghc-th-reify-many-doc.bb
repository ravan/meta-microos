SUMMARY = "Haskell th-reify-many library documentation"
DESCRIPTION = "This package provides the Haskell th-reify-many library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.10"

RPM_NAME = "ghc-th-reify-many-doc-0.1.10-1.23.noarch.rpm"
RPM_HASH = "4389947fdf7426d73460175cffa988d763d4be6325a7f5bc06cdb566637aacd4a07ff7443aaeec13ed8b38168ae946c332188e35e06db51ed4e26a1a0124422e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-th-reify-many-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
