SUMMARY = "Haskell digest library documentation"
DESCRIPTION = "This package provides the Haskell digest library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.0.2.1"

RPM_NAME = "ghc-digest-doc-0.0.2.1-1.25.noarch.rpm"
RPM_HASH = "120dea744fc4c5ea5d2af6780e6874ca9a3bada934a60ff578f389e8a62fe447fa7b097dafd51d44f85649a7750c7e8bdf9d82056ed801f279509a596a87e70b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-digest-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
