SUMMARY = "Haskell containers library documentation"
DESCRIPTION = "This package provides the Haskell containers library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "ghc-containers-doc-0.7-1.3.noarch.rpm"
RPM_HASH = "14e5836c5138980d3890424f9c0d33f23fdeafd7c92fa226996b86d3001e42e471b60e69847a71f07d33dc7d2889f0502a64f4a88d76787523ce32fc2d2cfd65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-containers-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
