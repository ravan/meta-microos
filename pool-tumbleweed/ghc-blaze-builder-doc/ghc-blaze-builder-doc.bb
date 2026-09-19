SUMMARY = "Haskell blaze-builder library documentation"
DESCRIPTION = "This package provides the Haskell blaze-builder library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.4.1"

RPM_NAME = "ghc-blaze-builder-doc-0.4.4.1-1.9.noarch.rpm"
RPM_HASH = "f4c187564dea33a88f7962ff1f0b3774f89c95e2553fb8d6ceedbd656b71f1fa50a74ce3b248fecb16752d1b9beae0fe38ba917f462b5d14f60ecbf011374441"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-blaze-builder-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
