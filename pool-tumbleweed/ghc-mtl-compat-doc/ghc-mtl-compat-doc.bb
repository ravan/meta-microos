SUMMARY = "Haskell mtl-compat library documentation"
DESCRIPTION = "This package provides the Haskell mtl-compat library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "ghc-mtl-compat-doc-0.2.2-1.6.noarch.rpm"
RPM_HASH = "8580e6e75f13a1b5c42816607f176a14c86026b1001cd487423b5aeaf5af3ad03c631d92acfc1cdc743c7530c577c13db2f153889c7aa850401e0d085d22dcb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-mtl-compat-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
