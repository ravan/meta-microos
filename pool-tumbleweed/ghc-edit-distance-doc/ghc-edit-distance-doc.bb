SUMMARY = "Haskell edit-distance library documentation"
DESCRIPTION = "This package provides the Haskell edit-distance library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.1"

RPM_NAME = "ghc-edit-distance-doc-0.2.2.1-13.42.noarch.rpm"
RPM_HASH = "89422cab8ba2054dc6e6c17c3005f79b63a3136d9b0e65149cbc4c72ab47527618ba5ba68358458573bce7d64ec2a27004e577d29118d2228c5a12ffa838e4d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-edit-distance-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
