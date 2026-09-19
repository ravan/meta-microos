SUMMARY = "Haskell directory library documentation"
DESCRIPTION = "This package provides the Haskell directory library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.10.1"

RPM_NAME = "ghc-directory-doc-1.3.10.1-1.3.noarch.rpm"
RPM_HASH = "c2fa5213f2350bf2526e318da3ffc27eef80db69d23f9d94513591329246243515690eb870965557e727a21de92d91f8dc3837662684136670d2ab8945f29fd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-directory-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
