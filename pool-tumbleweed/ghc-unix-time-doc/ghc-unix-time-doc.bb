SUMMARY = "Haskell unix-time library documentation"
DESCRIPTION = "This package provides the Haskell unix-time library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.17"

RPM_NAME = "ghc-unix-time-doc-0.4.17-1.8.noarch.rpm"
RPM_HASH = "4c71fdab26a3203910b69ba31b637ca8331b937d4c8b74ec9d2cd98e6ff3d351a37df3c5796a9ae86a9d171d5e81234b8457cf63c40bcdba16bc575f7504d1d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unix-time-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
