SUMMARY = "Haskell profunctors library documentation"
DESCRIPTION = "This package provides the Haskell profunctors library documentation."
LICENSE = "BSD-3-Clause"

PV = "5.6.3"

RPM_NAME = "ghc-profunctors-doc-5.6.3-1.11.noarch.rpm"
RPM_HASH = "31482dd4bc00f623f2c2f6a58545c5a69f336c81bddb9a131cd4de7dc760ec7e51b49a9e35d7acb59b1f8348bc9ec74c8cdedc3ed025ebb77f4da6bc5b19b69f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-profunctors-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
