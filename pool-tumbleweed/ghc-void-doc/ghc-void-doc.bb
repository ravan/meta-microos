SUMMARY = "Haskell void library documentation"
DESCRIPTION = "This package provides the Haskell void library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.7.4"

RPM_NAME = "ghc-void-doc-0.7.4-1.7.noarch.rpm"
RPM_HASH = "815c26bf3225974f420977f7997699e5e0829b33fde3ca8340737d82c3854ac5f9310c8b284d0cb5ea09ccda3ec87afe92bd0530b9453f147013b01929026492"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-void-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
