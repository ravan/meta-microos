SUMMARY = "Haskell xml-conduit library documentation"
DESCRIPTION = "This package provides the Haskell xml-conduit library documentation."
LICENSE = "MIT"

PV = "1.10.1.0"

RPM_NAME = "ghc-xml-conduit-doc-1.10.1.0-2.3.noarch.rpm"
RPM_HASH = "7906df06f38bd2894467a803943d9284de2266b4abc70ee55f14813046b9f88bd3d847f6de518f580f69ad0a6c3aacdf8d6ddae56f2f23925834b9ae4ec2e701"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xml-conduit-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
