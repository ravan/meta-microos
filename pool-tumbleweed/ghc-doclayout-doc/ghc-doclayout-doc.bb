SUMMARY = "Haskell doclayout library documentation"
DESCRIPTION = "This package provides the Haskell doclayout library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.3"

RPM_NAME = "ghc-doclayout-doc-0.5.0.3-1.3.noarch.rpm"
RPM_HASH = "0b0bb190636157efa6f63d3ee1f1bea2656f3d50f4503355593aca8455b5981e080e4064905b41dc0fd19969ce864039e1c1f685cc04e656ed4284c2889e7bce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-doclayout-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
