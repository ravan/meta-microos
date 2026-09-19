SUMMARY = "Haskell cabal-plan library documentation"
DESCRIPTION = "This package provides the Haskell cabal-plan library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.6.1"

RPM_NAME = "ghc-cabal-plan-doc-0.7.6.1-1.15.noarch.rpm"
RPM_HASH = "6fb8fb5b51188dfaa874ca4f3092fe1bd192620c665c2bece59a2d67380d31338e9823d874c34a39863a82474edea6f88015bb817202b8201c6728cdfbe0f2b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cabal-plan-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
