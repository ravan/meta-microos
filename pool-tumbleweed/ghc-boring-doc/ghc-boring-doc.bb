SUMMARY = "Haskell boring library documentation"
DESCRIPTION = "This package provides the Haskell boring library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.1"

RPM_NAME = "ghc-boring-doc-0.2.2.1-1.3.noarch.rpm"
RPM_HASH = "a1b99316336b9fd481611fe3684db223b8bcc7bddc5409189b0667203a8e118f5aba69ed11b4ec9cbcb8d488d84eaea01f15fba3b0f262f185addb1a67a6cac1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-boring-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
