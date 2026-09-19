SUMMARY = "Haskell hashable library documentation"
DESCRIPTION = "This package provides the Haskell hashable library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.5.1.0"

RPM_NAME = "ghc-hashable-doc-1.5.1.0-1.3.noarch.rpm"
RPM_HASH = "8a08073fc9ba4621d8a9cfe2760a0bc014fe5b511429a3c8be85a6bc281fd2e1aaf956ce4609a6df919bdd83cee5c72b8ddacfc0f5137cdaf2893a85d6fdf955"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hashable-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
