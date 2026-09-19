SUMMARY = "Haskell ghc library documentation"
DESCRIPTION = "This package provides the Haskell ghc library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.12.4"

RPM_NAME = "ghc-ghc-doc-9.12.4-1.3.noarch.rpm"
RPM_HASH = "2944a5b9889edb90add4c7ab2bd9cfc3d1d0ac589ebda17e2488d8c19863c0d4d7d0a94a7e6544db23fac7bb7618a2848e3a73298ecd77a37c456dc7f3408f09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
