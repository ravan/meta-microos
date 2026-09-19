SUMMARY = "Haskell distributive library documentation"
DESCRIPTION = "This package provides the Haskell distributive library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.6.3"

RPM_NAME = "ghc-distributive-doc-0.6.3-1.3.noarch.rpm"
RPM_HASH = "e38768faa44ca765b6a41b3dfa2264fd59c64a0dbf74ffd7f0799569d74a97f92495a5947c5914f1019818ffc415a365d518837b2de437d9abd8ebd7f832ee3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-distributive-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
