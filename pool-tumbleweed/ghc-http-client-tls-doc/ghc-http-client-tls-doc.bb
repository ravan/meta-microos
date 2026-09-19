SUMMARY = "Haskell http-client-tls library documentation"
DESCRIPTION = "This package provides the Haskell http-client-tls library documentation."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "ghc-http-client-tls-doc-0.4.0-1.4.noarch.rpm"
RPM_HASH = "b8b713c70889fa80f7c4c0aef96649c04784c1d9fe703a739da3328c01d0c2cf145d7ee73b82f48c1820d0e8b5edf2753313b0f330544fe630ac5cf736a15499"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-client-tls-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
