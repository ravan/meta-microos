SUMMARY = "Haskell http-types library documentation"
DESCRIPTION = "This package provides the Haskell http-types library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.12.5"

RPM_NAME = "ghc-http-types-doc-0.12.5-1.3.noarch.rpm"
RPM_HASH = "5dcd414f00a7a877785c03ccbbd55b925061acf91c5e775c7d517a745d9162f0dd65a32ceed71784f9a4a1130adaf54a692dc42b720961a23c4e5f7ffcc86f4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-types-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
