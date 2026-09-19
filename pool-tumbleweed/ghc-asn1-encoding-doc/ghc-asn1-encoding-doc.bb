SUMMARY = "Haskell asn1-encoding library documentation"
DESCRIPTION = "This package provides the Haskell asn1-encoding library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.9.6"

RPM_NAME = "ghc-asn1-encoding-doc-0.9.6-8.35.noarch.rpm"
RPM_HASH = "55275b0207fd3d52f46723343060848b6f598e9e1932e0be475a222bffb71023cf47fc7335f234116b597d9af8ca7ad0b6f2c3c4de5631b70d513d156d0f9e09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-asn1-encoding-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
