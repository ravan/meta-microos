SUMMARY = "Haskell these library documentation"
DESCRIPTION = "This package provides the Haskell these library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "ghc-these-doc-1.2.1-4.2.noarch.rpm"
RPM_HASH = "d3e603075d08e7646ab68ca85abaaaf1c0f49cbd6db6f0eaea8db582d663d4274172654d60f67bdd528ff61c0967437a94b7ecfc4f5ed2c952c0ed70f503f99b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-these-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
