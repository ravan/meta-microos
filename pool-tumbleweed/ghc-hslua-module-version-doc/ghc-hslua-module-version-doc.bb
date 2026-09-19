SUMMARY = "Haskell hslua-module-version library documentation"
DESCRIPTION = "This package provides the Haskell hslua-module-version library documentation."
LICENSE = "MIT"

PV = "1.2.0.1"

RPM_NAME = "ghc-hslua-module-version-doc-1.2.0.1-1.2.noarch.rpm"
RPM_HASH = "092198f6888216cf929b185680cf031ac1b2e317dbe016af0d41e95be509cebf9f8253b3b5a8e3eb51b46cf2ef6726f1b9718aa8b51e9d1e62a14a19db978b25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-module-version-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
