SUMMARY = "Haskell yesod-persistent library documentation"
DESCRIPTION = "This package provides the Haskell yesod-persistent library documentation."
LICENSE = "MIT"

PV = "1.6.0.9"

RPM_NAME = "ghc-yesod-persistent-doc-1.6.0.9-1.6.noarch.rpm"
RPM_HASH = "beb45ca7bcf7d296a633c1fd8be5ab69d74f40d3b4652d3b77f980ad0d328f3ca0eea8147316b7ec0b0fd8664d3d32208b762f80da6e846c634fd3da999866fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-persistent-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
