SUMMARY = "Haskell tar library documentation"
DESCRIPTION = "This package provides the Haskell tar library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.4.0"

RPM_NAME = "ghc-tar-doc-0.6.4.0-4.11.noarch.rpm"
RPM_HASH = "bc16fc92b1654233934e53f2553bcc7fde06777280550fb6a4842d0344cc783694e8417c1574b819289c4a843ebbbee63ec210384eb76bb7d0e30c1bf4589f59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tar-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
