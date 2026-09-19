SUMMARY = "Haskell lens library documentation"
DESCRIPTION = "This package provides the Haskell lens library documentation."
LICENSE = "BSD-2-Clause"

PV = "5.3.6"

RPM_NAME = "ghc-lens-doc-5.3.6-1.3.noarch.rpm"
RPM_HASH = "ba429d14b0edbfbf37b17a79972e760fc2e78cc8a9e66552759eb205803d2045d2609998ee6955c96a7f7243d7815e99a3493bbb821ea84080d9d10937771a04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-lens-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
