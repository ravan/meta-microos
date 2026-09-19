SUMMARY = "Haskell hslua-module-path library documentation"
DESCRIPTION = "This package provides the Haskell hslua-module-path library documentation."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "ghc-hslua-module-path-doc-1.2.0-1.2.noarch.rpm"
RPM_HASH = "73733e7808a6f6c7251743951f7c39ee496ef4771154c8219b897e7a583a7e8baa3e5d0093bd5153191dc9262d5f2abe5b110de22a02a8c83ab3345c79330bdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-module-path-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
