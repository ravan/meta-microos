SUMMARY = "Haskell crypton-asn1-encoding library documentation"
DESCRIPTION = "This package provides the Haskell crypton-asn1-encoding library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "ghc-crypton-asn1-encoding-doc-0.10.0-1.3.noarch.rpm"
RPM_HASH = "910e18ed88f596331eae1326aaf6e07de1f11300c3db1b65e4ff27b0b1b76f6da250cc978cd4afca0bd327e189bb0d2d10c5bac464bee4a276c9c0b522ff5426"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-crypton-asn1-encoding-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
