SUMMARY = "Haskell commonmark-extensions library documentation"
DESCRIPTION = "This package provides the Haskell commonmark-extensions library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.7"

RPM_NAME = "ghc-commonmark-extensions-doc-0.2.7-1.2.noarch.rpm"
RPM_HASH = "862f02f08434b1a9c0448d2037ac693501a15516f3cfa24c2f1a387f271442d3fcdb9667098eb3223e210ded6bc537b16c7695366df68398f973a9e67ae8f57d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-commonmark-extensions-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
