SUMMARY = "Haskell base16-bytestring library documentation"
DESCRIPTION = "This package provides the Haskell base16-bytestring library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.2.0"

RPM_NAME = "ghc-base16-bytestring-doc-1.0.2.0-3.21.noarch.rpm"
RPM_HASH = "14deea529eac568c28d03443a53eb9399b7b72364d5736781d17a4c28fdb51bd47a8c29eee355383bc789bc08b05df064b4fd81d63212a5e51b8faf0bf5798fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-base16-bytestring-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
