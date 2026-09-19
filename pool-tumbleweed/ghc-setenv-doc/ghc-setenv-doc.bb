SUMMARY = "Haskell setenv library documentation"
DESCRIPTION = "This package provides the Haskell setenv library documentation."
LICENSE = "MIT"

PV = "0.1.1.3"

RPM_NAME = "ghc-setenv-doc-0.1.1.3-12.23.noarch.rpm"
RPM_HASH = "54f394f1b1cab022322dbccb61327f9ea502ed367f8ca363c3c222b27010be2d2689518217005c4a8cce815179384f83d543c9f7f76ed0feb434cc6a6fc37b0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-setenv-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
