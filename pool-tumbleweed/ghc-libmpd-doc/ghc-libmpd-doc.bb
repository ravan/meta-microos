SUMMARY = "Haskell libmpd library documentation"
DESCRIPTION = "This package provides the Haskell libmpd library documentation."
LICENSE = "MIT"

PV = "0.10.0.1"

RPM_NAME = "ghc-libmpd-doc-0.10.0.1-1.25.noarch.rpm"
RPM_HASH = "8042e05455a370240637d9446a4d8e6b68ddbc1c8b7eeddc848fbcb0674ac5ae03566b055dce26658d2f7eb7db458867b2d2d020f0b20452b027d642d692d6eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-libmpd-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
