SUMMARY = "Haskell memory library documentation"
DESCRIPTION = "This package provides the Haskell memory library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.18.0"

RPM_NAME = "ghc-memory-doc-0.18.0-3.14.noarch.rpm"
RPM_HASH = "80cc9a41de4a2edc048ad526dc3a4afdd88fdc8f731586e7a317f6dc5afe55996fdc09a1d6e6223077007ef34edbf53accae3d60996dc1bc3bb7d337fa29329d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-memory-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
