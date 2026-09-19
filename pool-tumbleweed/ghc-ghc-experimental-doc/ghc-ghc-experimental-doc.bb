SUMMARY = "Haskell ghc-experimental library documentation"
DESCRIPTION = "This package provides the Haskell ghc-experimental library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.1204.0"

RPM_NAME = "ghc-ghc-experimental-doc-9.1204.0-1.3.noarch.rpm"
RPM_HASH = "59fcdfea2612352ab73fe0a5d35787ea63f3837a861f434acbcf81b7c4b1d160b4414ece2471dcd8bd65ae0c3cd1d5cfefca2d89e121f8f73e52cd0a0b63c99b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-experimental-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
