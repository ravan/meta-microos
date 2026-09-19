SUMMARY = "Haskell os-string library documentation"
DESCRIPTION = "This package provides the Haskell os-string library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.0.10"

RPM_NAME = "ghc-os-string-doc-2.0.10-1.3.noarch.rpm"
RPM_HASH = "ae68a8a4a887d33e45c979033c4e3d9068641e04ca368c78ff67c7691623a7173a8b139b53e8854b2e370c6c473903ec0969f1076964e0608e08c6f3c3bc0e58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-os-string-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
