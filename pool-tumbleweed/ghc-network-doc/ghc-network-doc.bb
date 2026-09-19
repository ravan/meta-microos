SUMMARY = "Haskell network library documentation"
DESCRIPTION = "This package provides the Haskell network library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.2.8.0"

RPM_NAME = "ghc-network-doc-3.2.8.0-1.9.noarch.rpm"
RPM_HASH = "28dbd00c156862aa2d1d281b393c768df73fc28bc8de83805d95d87d41bd198f28e88b7bbe9dde40e9028e6ac2c826decc25e00e6360587f83bec05405596ddc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-network-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
