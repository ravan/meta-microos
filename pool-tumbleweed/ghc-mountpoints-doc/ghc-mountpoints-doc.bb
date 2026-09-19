SUMMARY = "Haskell mountpoints library documentation"
DESCRIPTION = "This package provides the Haskell mountpoints library documentation."
LICENSE = "LGPL-2.1-or-later & BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-mountpoints-doc-1.0.2-4.24.noarch.rpm"
RPM_HASH = "f678030e2c7b53611f5c11e0d0191a1714448477ed15c8b2abdbdbc2622aac0d2b726432b0e40a461b28402aa19f30a58be21303feb4174afe4cda3a86f2666f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-mountpoints-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
