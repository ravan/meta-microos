SUMMARY = "Haskell doctemplates library documentation"
DESCRIPTION = "This package provides the Haskell doctemplates library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.11.0.1"

RPM_NAME = "ghc-doctemplates-doc-0.11.0.1-1.27.noarch.rpm"
RPM_HASH = "9f31ca2c5922dab23e6ff0ce5a8a0b77317e8e012491a4eb5e2eb7f35a72e2f057a4d06aab3bcb87be14a073aecd67e00ee24d44120b8aeed8700328aab64a2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-doctemplates-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
