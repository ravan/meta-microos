SUMMARY = "Haskell bitvec library documentation"
DESCRIPTION = "This package provides the Haskell bitvec library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1.6.0"

RPM_NAME = "ghc-bitvec-doc-1.1.6.0-1.3.noarch.rpm"
RPM_HASH = "2a523f44a395c27fe7644fb006e7605a7bea445aee16735bc56dd3410aca5b38ad1ec55047713916c024432afc80c53bb48b4011b7a1b54d4263dc64dde42fc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-bitvec-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
