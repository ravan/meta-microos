SUMMARY = "Haskell network-control library documentation"
DESCRIPTION = "This package provides the Haskell network-control library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.7"

RPM_NAME = "ghc-network-control-doc-0.1.7-1.8.noarch.rpm"
RPM_HASH = "e9c458a9be5590ab5b38a37b600908e1e4900f3e58dddc78ea64e2a7014709ae2be850159d0440c4ae115465a9b87a3c2131409b247f2bcd6d1487dc9471d40a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-network-control-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
