SUMMARY = "Haskell typed-process library documentation"
DESCRIPTION = "This package provides the Haskell typed-process library documentation."
LICENSE = "MIT"

PV = "0.2.13.0"

RPM_NAME = "ghc-typed-process-doc-0.2.13.0-1.12.noarch.rpm"
RPM_HASH = "6dc44ce3930cd9681f91a04184a98e94e7317a91ab864f46da67376d0e2d70defece076464ef984b1fa5470c408094fa113746c9abe37b0d8f3fe183e02fc3c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-typed-process-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
