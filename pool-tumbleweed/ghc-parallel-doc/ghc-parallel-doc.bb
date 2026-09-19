SUMMARY = "Haskell parallel library documentation"
DESCRIPTION = "This package provides the Haskell parallel library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.2.2.0"

RPM_NAME = "ghc-parallel-doc-3.2.2.0-16.9.noarch.rpm"
RPM_HASH = "b4b8fae57e39d891060995a72f2926cec3dd33f8d9d0706c2b72eb51c3c6b685324aac9a4551283d835111ec5f176d47ff7ef640dab3aacf482b339e7cff0b74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-parallel-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
