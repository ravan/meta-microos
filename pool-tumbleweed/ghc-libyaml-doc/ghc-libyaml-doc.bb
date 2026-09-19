SUMMARY = "Haskell libyaml library documentation"
DESCRIPTION = "This package provides the Haskell libyaml library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.4"

RPM_NAME = "ghc-libyaml-doc-0.1.4-2.27.noarch.rpm"
RPM_HASH = "f832242d786e57bab1d6f4604e34cf62eadbb16c6aaaeaa43c47478ba3bc82fb9808220531873e433a6f6e92b9290be8b6e3261b8b8d54bc84116988229a18cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-libyaml-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
