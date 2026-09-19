SUMMARY = "Haskell email-validate library documentation"
DESCRIPTION = "This package provides the Haskell email-validate library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.3.2.21"

RPM_NAME = "ghc-email-validate-doc-2.3.2.21-1.17.noarch.rpm"
RPM_HASH = "c57853d92f19d245a7bb35ea435fc4d7db30d37a19d0c30309f5789fc0fa5c832e3698aa99cc51af1a6911422cd486daba7779a69fc3bc79db30731df7582a3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-email-validate-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
