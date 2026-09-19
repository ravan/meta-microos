SUMMARY = "Haskell old-time library documentation"
DESCRIPTION = "This package provides the Haskell old-time library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1.1.0"

RPM_NAME = "ghc-old-time-doc-1.1.1.0-1.3.noarch.rpm"
RPM_HASH = "0b6d7667811155a113c80965d9ab2045c72290c66b3c52f16681a064877f639002e6cc9f00212593200594a9d3b7b925a694c98887543b228ba0bc406556e15e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-old-time-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
