SUMMARY = "Haskell utility-ht library documentation"
DESCRIPTION = "This package provides the Haskell utility-ht library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.17.2"

RPM_NAME = "ghc-utility-ht-doc-0.0.17.2-1.16.noarch.rpm"
RPM_HASH = "0eac72cc431d41cac47c4a8a5d678333e4dbbe23b90f582c801f14f2a109166280e3790bb9f7afb5538b0550a77c618c79551dc7c4474337b7b5fd50437e9cdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-utility-ht-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
