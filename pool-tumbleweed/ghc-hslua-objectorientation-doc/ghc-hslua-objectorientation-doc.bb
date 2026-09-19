SUMMARY = "Haskell hslua-objectorientation library documentation"
DESCRIPTION = "This package provides the Haskell hslua-objectorientation library documentation."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "ghc-hslua-objectorientation-doc-2.5.0-1.3.noarch.rpm"
RPM_HASH = "633b43e2e7eabae7d7c0ea99263aa585df3bc913c456f9d6fa7e182f86b5844ed0d4c5498ce5347616f56ba3afe9ed1a3d5a232839421569502f392ab5dcc39c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-objectorientation-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
