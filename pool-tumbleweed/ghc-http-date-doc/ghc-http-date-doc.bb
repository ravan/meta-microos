SUMMARY = "Haskell http-date library documentation"
DESCRIPTION = "This package provides the Haskell http-date library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.11"

RPM_NAME = "ghc-http-date-doc-0.0.11-2.40.noarch.rpm"
RPM_HASH = "40bddedafd0d7a4f0392c10793a108a66d1008969d6626059f429ff490ba22d4ad7635469d609f5a1143894eed3a318382ba1cff7b4a54e9b50252ecd90fe527"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-date-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
