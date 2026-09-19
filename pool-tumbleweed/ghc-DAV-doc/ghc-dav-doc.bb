SUMMARY = "Haskell DAV library documentation"
DESCRIPTION = "This package provides the Haskell DAV library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.4"

RPM_NAME = "ghc-DAV-doc-1.3.4-4.105.noarch.rpm"
RPM_HASH = "64d063ea41f75fabc4e02e3bb6dfac83bd010ff52cc30e067d82b636082e0f65dcc151760e48540b0240cccb06c244b9a221a7d6adccb39795d45215459c1d2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-DAV-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
