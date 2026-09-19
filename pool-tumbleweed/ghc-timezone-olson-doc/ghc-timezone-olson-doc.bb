SUMMARY = "Haskell timezone-olson library documentation"
DESCRIPTION = "This package provides the Haskell timezone-olson library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-timezone-olson-doc-0.2.1-4.3.noarch.rpm"
RPM_HASH = "60dfb3b825dfb24d1325f6f456e97384fe2ace39eedc24c10e6eeac1ec1d906af67e281d375cbdbf9a803016994a2d68dcbda6b9c4ee9eeba4c9c60dbfbd2eb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-timezone-olson-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
