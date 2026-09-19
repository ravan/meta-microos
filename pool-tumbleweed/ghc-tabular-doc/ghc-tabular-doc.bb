SUMMARY = "Haskell tabular library documentation"
DESCRIPTION = "This package provides the Haskell tabular library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.8"

RPM_NAME = "ghc-tabular-doc-0.2.2.8-4.31.noarch.rpm"
RPM_HASH = "a88a550a58a10e73bf30e3e1f3b77b90a3f5537e44947dd4fc5a348671549f7ab51272f390bf38c149ca49cdb2ca8706add36925d0621581d4994f200b7e8b0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tabular-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
