SUMMARY = "Haskell cryptonite-conduit library documentation"
DESCRIPTION = "This package provides the Haskell cryptonite-conduit library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "ghc-cryptonite-conduit-doc-0.2.2-9.59.noarch.rpm"
RPM_HASH = "ecccc8c65072df66ce7a3b7472cc8784fa031c43cd7bc3169696d87ba92c30c7ac962defb0a0389554d4c02b35cbac8dfb09e6cc201ae6972cf01605ccc77dc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cryptonite-conduit-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
