SUMMARY = "Haskell xmonad library documentation"
DESCRIPTION = "This package provides the Haskell xmonad library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.18.1"

RPM_NAME = "ghc-xmonad-doc-0.18.1-1.3.noarch.rpm"
RPM_HASH = "4fdda99b12b67fec7502d7d83f6e76bab895da2a9a46d2f42d9f6c26c7dcfefff2ccbca4a1401e97036af2aba5933eaefe0148ac0b3035bef7a558ff20197123"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xmonad-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
