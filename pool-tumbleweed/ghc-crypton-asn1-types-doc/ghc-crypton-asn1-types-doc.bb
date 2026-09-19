SUMMARY = "Haskell crypton-asn1-types library documentation"
DESCRIPTION = "This package provides the Haskell crypton-asn1-types library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "ghc-crypton-asn1-types-doc-0.4.1-1.3.noarch.rpm"
RPM_HASH = "b5cbd4fb4a81991a45de56cc60dd8395b76113afe9459aff30e994b25e8f1e968a452488038ed51e7cd6909db89ae754a1a121b229229068e3544c04cbc00411"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-crypton-asn1-types-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
