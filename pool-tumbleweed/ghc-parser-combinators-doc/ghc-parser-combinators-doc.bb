SUMMARY = "Haskell parser-combinators library documentation"
DESCRIPTION = "This package provides the Haskell parser-combinators library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "ghc-parser-combinators-doc-1.3.1-1.2.noarch.rpm"
RPM_HASH = "3cbff294692a5863208e3a581d9902244aedb9c2c8bd96b73a494644f399eb43a8957cf99ba66086a953e55d9874c2d1ad3233d2567d75cd43676ad9610611b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-parser-combinators-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
