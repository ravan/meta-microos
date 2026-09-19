SUMMARY = "Haskell reflection library documentation"
DESCRIPTION = "This package provides the Haskell reflection library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.1.9"

RPM_NAME = "ghc-reflection-doc-2.1.9-2.12.noarch.rpm"
RPM_HASH = "f060e3fc1ae690a757269e7c841d4e742021ea9e8932c320acaeec82f4064eb5738259e7a273765e6673dea77d58aab3d3c6861888be5d810a6164ee0a1d9fea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-reflection-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
