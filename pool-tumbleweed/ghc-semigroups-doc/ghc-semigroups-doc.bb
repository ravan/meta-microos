SUMMARY = "Haskell semigroups library documentation"
DESCRIPTION = "This package provides the Haskell semigroups library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.20.1"

RPM_NAME = "ghc-semigroups-doc-0.20.1-1.3.noarch.rpm"
RPM_HASH = "0348a6423a346e4df322726e9ab0df0b3bb22d25224f96b9006ddeaa0220509d7900f16210796e0ac91a0d81cc0d963ac0a5597102f9038a25620fac0a992493"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-semigroups-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
