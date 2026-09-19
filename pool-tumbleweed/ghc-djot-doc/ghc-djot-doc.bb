SUMMARY = "Haskell djot library documentation"
DESCRIPTION = "This package provides the Haskell djot library documentation."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "ghc-djot-doc-0.1.4-1.3.noarch.rpm"
RPM_HASH = "b300e2c78eb8c35204cd4662b67aabc9ae929d4b475e79f2f0fe8897bef1dc945bca66833a834c7fff0a61dc1d96ff723f2851c30280e66d5424ae7b93d01da2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-djot-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
