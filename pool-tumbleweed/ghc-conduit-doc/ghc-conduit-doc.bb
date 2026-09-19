SUMMARY = "Haskell conduit library documentation"
DESCRIPTION = "This package provides the Haskell conduit library documentation."
LICENSE = "MIT"

PV = "1.3.6.1"

RPM_NAME = "ghc-conduit-doc-1.3.6.1-1.23.noarch.rpm"
RPM_HASH = "e7d5c6a3a1d9196c1559c1af96ad6ee864b858296476e5aab079b8ce3c518267029c7251a71267b0363c6a49bbdbde4852d720d0d709545dcd66edf51f76825a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-conduit-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
