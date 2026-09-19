SUMMARY = "Haskell bifunctors library documentation"
DESCRIPTION = "This package provides the Haskell bifunctors library documentation."
LICENSE = "BSD-2-Clause"

PV = "5.6.3"

RPM_NAME = "ghc-bifunctors-doc-5.6.3-1.3.noarch.rpm"
RPM_HASH = "a7e6a3866e647deddc0b59fe66d6a9ae01a73a9aa4b3b15b0879266e01f5007a61832e4a2a5ab1e1673571d86b74586b80b9d23e1a774243a9662e65d0c62c22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-bifunctors-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
