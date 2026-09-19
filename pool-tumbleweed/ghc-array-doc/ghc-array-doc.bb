SUMMARY = "Haskell array library documentation"
DESCRIPTION = "This package provides the Haskell array library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.8.0"

RPM_NAME = "ghc-array-doc-0.5.8.0-1.3.noarch.rpm"
RPM_HASH = "aaf218bd1b12512bd3646ed0c6bb1c5c6cd4b78d625fceed63009d5c5214c4d45bcc9be65f91e1bf68bd505c4989d995dea16d9f3b21a089eb07a339d0019ff7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-array-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
