SUMMARY = "Haskell ram library documentation"
DESCRIPTION = "This package provides the Haskell ram library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.22.0"

RPM_NAME = "ghc-ram-doc-0.22.0-1.3.noarch.rpm"
RPM_HASH = "e993145726c60abeb6e27c61468237c01e42fe9cba58ae77659c967a9fe47a927e8d8783f8e3af69ee15ce2d466f862b05158f8d29efc4cdb8c8a7fceb4bf01c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ram-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
