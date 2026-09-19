SUMMARY = "Haskell word8 library documentation"
DESCRIPTION = "This package provides the Haskell word8 library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-word8-doc-0.1.3-5.35.noarch.rpm"
RPM_HASH = "21587e9b2c4fe9c79f73091897162c19850e8a2b18e3b715525a36484a5eb40e5820d10ee919c655b17da7e9c8ca8df6f898d6c98ff22321a7083e8e7c01cb56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-word8-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
