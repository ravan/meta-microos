SUMMARY = "Haskell ghc-boot library documentation"
DESCRIPTION = "This package provides the Haskell ghc-boot library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.12.4"

RPM_NAME = "ghc-ghc-boot-doc-9.12.4-1.3.noarch.rpm"
RPM_HASH = "63220bb2f24d1b39840a3b43fd08620b85f8022e7564272e0bed39e182a2b088e2191b35defc027402638e41d80a187183f06d8b22a11e491f79358c322e49c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-boot-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
