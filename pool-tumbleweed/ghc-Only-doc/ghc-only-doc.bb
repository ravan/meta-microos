SUMMARY = "Haskell Only library documentation"
DESCRIPTION = "This package provides the Haskell Only library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-Only-doc-0.1-6.17.noarch.rpm"
RPM_HASH = "754686a6c4da8b165ecd263d53e162a0634e15912682de401e9b17a368ce774712e6f0d55f83e52bf6c993a1f6a43f69871b58a6a161faae44f11292e6daff98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-Only-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
