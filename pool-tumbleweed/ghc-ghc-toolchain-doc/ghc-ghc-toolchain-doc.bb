SUMMARY = "Haskell ghc-toolchain library documentation"
DESCRIPTION = "This package provides the Haskell ghc-toolchain library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-ghc-toolchain-doc-0.1.0.0-1.3.noarch.rpm"
RPM_HASH = "02ba42a35154d8b6be6b30fd85f1e756ae3867d83d966a02b8bf4498d58b25ed08c497880487ff276bd89f744c43cebead2ebf30e673bcf9892be3de59109388"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-toolchain-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
