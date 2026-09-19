SUMMARY = "Haskell serialise library documentation"
DESCRIPTION = "This package provides the Haskell serialise library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.6.1"

RPM_NAME = "ghc-serialise-doc-0.2.6.1-5.15.noarch.rpm"
RPM_HASH = "9752aecbfd142735a4b7b2e158024b90e2e986080885f919e6fbded910813454399383a414378e23d935dc392bd62d9de7446ee2f0365cbc8a31e0d46cf9dfc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-serialise-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
