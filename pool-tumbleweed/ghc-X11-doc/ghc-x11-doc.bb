SUMMARY = "Haskell X11 library documentation"
DESCRIPTION = "This package provides the Haskell X11 library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.10.3"

RPM_NAME = "ghc-X11-doc-1.10.3-5.11.noarch.rpm"
RPM_HASH = "3aad0cfe1318ac0186cf9c68791d554af83dd58c1d454624b7c71ffd0660bb6f40f81fc44795863078ff7b7c86ebbba19a44320c0e5b0b61aa8cd351d6882d3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-X11-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
