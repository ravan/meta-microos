SUMMARY = "Haskell stm library documentation"
DESCRIPTION = "This package provides the Haskell stm library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.5.3.1"

RPM_NAME = "ghc-stm-doc-2.5.3.1-1.3.noarch.rpm"
RPM_HASH = "2c80f74e57272edb82c9ac23508864b981b535693710b15a42a801019ad86f52039908aa629592c890d5681a7d5d723d7dedf787536e670c5f0d7aa0c32bd445"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-stm-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
