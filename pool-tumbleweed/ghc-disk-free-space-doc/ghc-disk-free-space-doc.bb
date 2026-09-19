SUMMARY = "Haskell disk-free-space library documentation"
DESCRIPTION = "This package provides the Haskell disk-free-space library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.1"

RPM_NAME = "ghc-disk-free-space-doc-0.1.0.1-5.23.noarch.rpm"
RPM_HASH = "92485eae3b9a14e729ca32655b8a318174d3b5e526ac2ac0e2dc4689a862555b88a12b00e873061b6599b715251a13b27cc0bfd2fde67a432969b4ef13e9a81f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-disk-free-space-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
