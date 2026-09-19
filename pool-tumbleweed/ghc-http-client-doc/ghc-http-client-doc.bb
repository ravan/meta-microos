SUMMARY = "Haskell http-client library documentation"
DESCRIPTION = "This package provides the Haskell http-client library documentation."
LICENSE = "MIT"

PV = "0.7.19"

RPM_NAME = "ghc-http-client-doc-0.7.19-1.19.noarch.rpm"
RPM_HASH = "1ebd072acd33ed9da34ec2a1f7bbf93451102bec5dbace1a4935f285ab4702af9df54d1b164149d6cf6d8b9c79baf40581225314c3a48d7e635857597ede1f08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-client-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
