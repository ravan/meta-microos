SUMMARY = "Haskell yesod-core library documentation"
DESCRIPTION = "This package provides the Haskell yesod-core library documentation."
LICENSE = "MIT"

PV = "1.6.29.1"

RPM_NAME = "ghc-yesod-core-doc-1.6.29.1-1.6.noarch.rpm"
RPM_HASH = "e21850e8558a1e4840fed470462ce466994101cf9582fc43b43255687b1f2af38a53668a3e01b296af720ba3c45e2eb40a27794968d6e27319ada307f878fa4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-core-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
