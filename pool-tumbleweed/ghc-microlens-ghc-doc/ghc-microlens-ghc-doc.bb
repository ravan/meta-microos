SUMMARY = "Haskell microlens-ghc library documentation"
DESCRIPTION = "This package provides the Haskell microlens-ghc library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.15.2"

RPM_NAME = "ghc-microlens-ghc-doc-0.4.15.2-1.9.noarch.rpm"
RPM_HASH = "e7e57517a028b250206b5c473b5135ef9d9cf829076844e1ea6132671cf3adc7c4c2487749f86c5591aa65cbeaca6cbbbb279079f6154674a7aae97a95962127"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-microlens-ghc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
