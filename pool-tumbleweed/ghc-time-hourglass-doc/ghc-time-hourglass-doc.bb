SUMMARY = "Haskell time-hourglass library documentation"
DESCRIPTION = "This package provides the Haskell time-hourglass library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "ghc-time-hourglass-doc-0.3.0-1.3.noarch.rpm"
RPM_HASH = "b7f79afcf8b91e5be70e59a4fbe71a7be6181c757488fec56209ad1840d0536a25bbb215d3deda0a47fe9574ef52a8c8755fad3b47e5793a4ae450a5bbbf597a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-time-hourglass-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
