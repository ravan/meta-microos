SUMMARY = "Haskell fgl library documentation"
DESCRIPTION = "This package provides the Haskell fgl library documentation."
LICENSE = "BSD-3-Clause"

PV = "5.8.3.1"

RPM_NAME = "ghc-fgl-doc-5.8.3.1-1.3.noarch.rpm"
RPM_HASH = "5063f0b2031e0b6a0ca258a57f9a4a8edfe21f01d9304fc12ea7d55e5d56c3efff298b4e68e660781917ceb47501b190854c04e5b31c9c0868dc552a7830ca2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-fgl-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
