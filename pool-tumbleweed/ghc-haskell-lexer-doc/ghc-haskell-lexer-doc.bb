SUMMARY = "Haskell haskell-lexer library documentation"
DESCRIPTION = "This package provides the Haskell haskell-lexer library documentation."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "ghc-haskell-lexer-doc-1.2.1-1.6.noarch.rpm"
RPM_HASH = "2bddd729311cfca26c5293b4616618e442f5ae044a6a828c1b1bb64bbb1f935d14d4ca088ca2461b208665465f3f9f7434200044c6a49c181c9f6e2ed1fc5bf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-haskell-lexer-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
