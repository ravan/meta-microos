SUMMARY = "Haskell netlink library documentation"
DESCRIPTION = "This package provides the Haskell netlink library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1.1.0"

RPM_NAME = "ghc-netlink-doc-1.1.1.0-4.35.noarch.rpm"
RPM_HASH = "5cd001205364722314c42281cdbef77e11f043053eb3e3e7f938f097d87ddc2171c0f8bbe31385fb595b53a2840b87fb6f10f0d1131250fd07ff5cf848dfcdd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-netlink-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
