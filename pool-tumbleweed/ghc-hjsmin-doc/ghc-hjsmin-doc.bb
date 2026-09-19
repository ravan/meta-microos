SUMMARY = "Haskell hjsmin library documentation"
DESCRIPTION = "This package provides the Haskell hjsmin library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-hjsmin-doc-0.2.1-1.29.noarch.rpm"
RPM_HASH = "dcafa8298131bc80da68019393a074be13c1bfd40d60030d031a6b7530827a97a602e6932eda744c93ceef286b954b01d2686f9438f60fdd619f9fa1dbaefb06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hjsmin-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
