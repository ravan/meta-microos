SUMMARY = "Haskell happy-lib library documentation"
DESCRIPTION = "This package provides the Haskell happy-lib library documentation."
LICENSE = "BSD-2-Clause"

PV = "2.1.7"

RPM_NAME = "ghc-happy-lib-doc-2.1.7-1.9.noarch.rpm"
RPM_HASH = "c6234cdf7fea223dc8065018c9e69434fa36324984604f6f65388cc854e7a28fdd86919f5d6e5ea29c240fb325a6bbf1542e91a4ff946d3d1e8b769669c53b3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-happy-lib-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
