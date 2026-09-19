SUMMARY = "Haskell dns library documentation"
DESCRIPTION = "This package provides the Haskell dns library documentation."
LICENSE = "BSD-3-Clause"

PV = "4.2.0"

RPM_NAME = "ghc-dns-doc-4.2.0-1.11.noarch.rpm"
RPM_HASH = "e783aa031e8e50b907d985fc314fc91b08d2f73c0ca58d5b8da39942b8b9e3ba4520d408e8be313038061a6d9d1354e09e616e519d10e88525a62fb4936f0da1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-dns-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
