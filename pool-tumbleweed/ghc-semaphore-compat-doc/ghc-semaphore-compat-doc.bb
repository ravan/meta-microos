SUMMARY = "Haskell semaphore-compat library documentation"
DESCRIPTION = "This package provides the Haskell semaphore-compat library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "ghc-semaphore-compat-doc-1.0.0-1.3.noarch.rpm"
RPM_HASH = "208a017016921a376103b9aa6d0e7675d77927bd2c9b253b80fa57ecc5d056dd8ad533857ae11b90257f467256708a4d39bfde5c5deeced2e10432826c013c88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-semaphore-compat-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
