SUMMARY = "Haskell hslua-module-doclayout library documentation"
DESCRIPTION = "This package provides the Haskell hslua-module-doclayout library documentation."
LICENSE = "MIT"

PV = "1.2.1.1"

RPM_NAME = "ghc-hslua-module-doclayout-doc-1.2.1.1-1.2.noarch.rpm"
RPM_HASH = "88ec911083388dd18142517daa716bd7747dc9a0ae96ce09289499cfe7c10957883319c9579ece3f6be4b937403979b298a730ae6c26eb124dff452892ce8e53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-module-doclayout-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
