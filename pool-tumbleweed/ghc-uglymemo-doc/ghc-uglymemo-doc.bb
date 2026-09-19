SUMMARY = "Haskell uglymemo library documentation"
DESCRIPTION = "This package provides the Haskell uglymemo library documentation."
LICENSE = "SUSE-Public-Domain"

PV = "0.1.0.1"

RPM_NAME = "ghc-uglymemo-doc-0.1.0.1-4.19.noarch.rpm"
RPM_HASH = "8a02963fd4e93cbe34b70b0a72529d8ab07a21f60bb81653295799da77b7507f8d64f8ab174b1bb4a9d8474fe953d70e01eb330053858e036f37eaea7b2fb449"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-uglymemo-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
