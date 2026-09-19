SUMMARY = "Haskell bencode library documentation"
DESCRIPTION = "This package provides the Haskell bencode library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.1.1"

RPM_NAME = "ghc-bencode-doc-0.6.1.1-4.35.noarch.rpm"
RPM_HASH = "3583fa7998bd69e2072dee2e8d7c78ebcc8654861db99ec17913f96a5bdf064ad271c80a0cf10e1dc2f038412ecb4e74cf37bafc33fb5cf97c173a4e0614e4a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-bencode-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
