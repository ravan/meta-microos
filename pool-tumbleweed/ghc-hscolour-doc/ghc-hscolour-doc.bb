SUMMARY = "Haskell hscolour library documentation"
DESCRIPTION = "This package provides the Haskell hscolour library documentation."
LICENSE = "LGPL-2.1-or-later"

PV = "1.25"

RPM_NAME = "ghc-hscolour-doc-1.25-1.32.noarch.rpm"
RPM_HASH = "8035e5dc457888ff6315b96a098d45a089616eabc4ea7d50ef48f7d44dbc3e815dd11d937695aa9d723992e4139374392696730d328279c8ee2ec09c8f241186"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hscolour-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
