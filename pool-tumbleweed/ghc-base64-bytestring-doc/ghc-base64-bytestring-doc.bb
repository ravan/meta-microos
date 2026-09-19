SUMMARY = "Haskell base64-bytestring library documentation"
DESCRIPTION = "This package provides the Haskell base64-bytestring library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.0"

RPM_NAME = "ghc-base64-bytestring-doc-1.2.1.0-3.30.noarch.rpm"
RPM_HASH = "69ae6bbaa4a82a43c6b50fbb4a679b6563da06ed883f727d9791b263daa3465887d8e8d5476c04731cf1b5865c04271ab389d8b6025c08712ece71e42b53bb4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-base64-bytestring-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
