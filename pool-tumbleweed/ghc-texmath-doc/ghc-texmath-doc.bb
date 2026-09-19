SUMMARY = "Haskell texmath library documentation"
DESCRIPTION = "This package provides the Haskell texmath library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.13.1.2"

RPM_NAME = "ghc-texmath-doc-0.13.1.2-1.3.noarch.rpm"
RPM_HASH = "3462e3362f3936171795b1c8579d3b4563250f7224211c8d14fbb6d9f5002f282bfc531f81a775bf261d8ebc0daa848c70d2a2fac0832961118168c131f0db2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-texmath-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
