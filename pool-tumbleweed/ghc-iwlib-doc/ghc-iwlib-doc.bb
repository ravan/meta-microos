SUMMARY = "Haskell iwlib library documentation"
DESCRIPTION = "This package provides the Haskell iwlib library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-iwlib-doc-0.1.2-4.14.noarch.rpm"
RPM_HASH = "4014eac0ae345eff4556a45da3784069442df405fb5f5db1bae47f09cf46f8c778298af193c502e1208ee00c9725001c292b1c84e77934eef6ea50f5cd4bc2ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-iwlib-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
