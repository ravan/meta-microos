SUMMARY = "Haskell hslua-module-system library documentation"
DESCRIPTION = "This package provides the Haskell hslua-module-system library documentation."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "ghc-hslua-module-system-doc-1.3.0-1.3.noarch.rpm"
RPM_HASH = "f6835e1fb1c0b3dcb34ecd70bcfabf0856518b262547374ae06bfdfa5e24253c7ae3d98c134e70d46dd0f013aa71ea54f445615598a64c8f56d71ff0a50c401c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-module-system-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
