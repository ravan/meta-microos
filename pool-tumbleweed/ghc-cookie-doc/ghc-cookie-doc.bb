SUMMARY = "Haskell cookie library documentation"
DESCRIPTION = "This package provides the Haskell cookie library documentation."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "ghc-cookie-doc-0.5.1-1.12.noarch.rpm"
RPM_HASH = "2a7beb90b1bf86c6f80e062d54f164384a21d1b9af32a8413b0e75fc5ba97073b639f585241363fe174d982373f93a1b82f0582883deff89e79888c0f079cb1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cookie-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
