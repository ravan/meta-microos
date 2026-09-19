SUMMARY = "Haskell unliftio library documentation"
DESCRIPTION = "This package provides the Haskell unliftio library documentation."
LICENSE = "MIT"

PV = "0.2.25.1"

RPM_NAME = "ghc-unliftio-doc-0.2.25.1-1.12.noarch.rpm"
RPM_HASH = "9f1afe05d26fe57f7334100ec489bd8eff5291556221f120b9c2387245a719e3d7924325ebd08dde7aeb3551f99ce8f0ea0cc2a09cdef94abf15cd0b2cf0002c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unliftio-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
