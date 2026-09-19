SUMMARY = "Haskell text-short library documentation"
DESCRIPTION = "This package provides the Haskell text-short library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.6.1"

RPM_NAME = "ghc-text-short-doc-0.1.6.1-1.3.noarch.rpm"
RPM_HASH = "46bd48e9452e826d7b789afe9f2926015fc768e3d05632b6aa78310bc99ab19b47d59538bd451a8d28f6b692fa030650e242d768e97d2b2a7c8af39218a84c84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-text-short-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
