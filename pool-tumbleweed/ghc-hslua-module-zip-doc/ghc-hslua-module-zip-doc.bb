SUMMARY = "Haskell hslua-module-zip library documentation"
DESCRIPTION = "This package provides the Haskell hslua-module-zip library documentation."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "ghc-hslua-module-zip-doc-1.2.1-1.3.noarch.rpm"
RPM_HASH = "294f139f038114cbf54e813a4ca13489e612ea4dd6ff14e17cba33e11062e6f07768ba44a1fe0eab05ffeadeba020256fe82edaf32c8a8a9bfa908088405c9e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-module-zip-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
