SUMMARY = "Haskell xmonad-contrib library documentation"
DESCRIPTION = "This package provides the Haskell xmonad-contrib library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.18.2"

RPM_NAME = "ghc-xmonad-contrib-doc-0.18.2-1.3.noarch.rpm"
RPM_HASH = "a60b1b1f8f8d444f7825c10824c8ed076fc420818e5cc39dcf47f763f14df9a4fcd41233fa806cc28e2e6d7e382357bae42b01ce60d81400ad72e1ebb0670375"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xmonad-contrib-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
