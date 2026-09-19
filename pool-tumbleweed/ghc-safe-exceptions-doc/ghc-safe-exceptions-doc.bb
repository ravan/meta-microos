SUMMARY = "Haskell safe-exceptions library documentation"
DESCRIPTION = "This package provides the Haskell safe-exceptions library documentation."
LICENSE = "MIT"

PV = "0.1.7.4"

RPM_NAME = "ghc-safe-exceptions-doc-0.1.7.4-2.21.noarch.rpm"
RPM_HASH = "7557a0fefe081d453ed89735f8488f6609513fb9b3052d7e9fe74c263b3f0ef7b1198c76936ca3cc7b4b776a1e2c2b6b15650d8f974de68e14f1e60ea7d57f23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-safe-exceptions-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
