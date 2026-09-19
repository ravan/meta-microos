SUMMARY = "Haskell aeson library documentation"
DESCRIPTION = "This package provides the Haskell aeson library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.2.5.0"

RPM_NAME = "ghc-aeson-doc-2.2.5.0-1.3.noarch.rpm"
RPM_HASH = "c4bce94e7754be42c8ae22880607e6a0a1eb4e11c6743ccd9a1b8143f3b30cff07b6af3df99f57e93116f4561162290d74ecc2e2de32758abdc1c1b9135e68fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-aeson-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
