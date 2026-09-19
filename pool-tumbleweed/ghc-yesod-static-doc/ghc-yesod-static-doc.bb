SUMMARY = "Haskell yesod-static library documentation"
DESCRIPTION = "This package provides the Haskell yesod-static library documentation."
LICENSE = "MIT"

PV = "1.6.1.3"

RPM_NAME = "ghc-yesod-static-doc-1.6.1.3-1.5.noarch.rpm"
RPM_HASH = "3f9f5bcfb1bfc8d2a3536fcbf9788de0abce042ec87ab5982e6b4f648c518be4fcaf6cc2ba8ca7a97258a62a18b07d99a32b157dd98f0afbd4970bda30281597"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-static-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
