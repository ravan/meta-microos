SUMMARY = "Haskell lpeg library documentation"
DESCRIPTION = "This package provides the Haskell lpeg library documentation."
LICENSE = "MIT"

PV = "1.1.0.1"

RPM_NAME = "ghc-lpeg-doc-1.1.0.1-1.3.noarch.rpm"
RPM_HASH = "b661e34ef5e50ff2aa6106322e502567151a4963c78075c23cc4e7f06179b746d50b4f51f2677db97d73c84e88ec41e0736502f14633ebd6561ee0c60cab892b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-lpeg-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
