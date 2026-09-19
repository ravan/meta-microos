SUMMARY = "Haskell ed25519 library documentation"
DESCRIPTION = "This package provides the Haskell ed25519 library documentation."
LICENSE = "MIT"

PV = "0.0.5.0"

RPM_NAME = "ghc-ed25519-doc-0.0.5.0-18.14.noarch.rpm"
RPM_HASH = "16ae11b3c1c24845569d66ae5ace1241a99864b4c2d3092d11f48077a85be75adcc15a2b5170820c8935d2a0209fb0dfc6f6cbefc01b596957460180aecbae6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ed25519-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
