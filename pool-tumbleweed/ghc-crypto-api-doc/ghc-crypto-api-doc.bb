SUMMARY = "Haskell crypto-api library documentation"
DESCRIPTION = "This package provides the Haskell crypto-api library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.13.3"

RPM_NAME = "ghc-crypto-api-doc-0.13.3-5.37.noarch.rpm"
RPM_HASH = "8ecf161b090deebad34c804dda4ca9a5c7f05ea28458cfdd629a66a414ff90f325e77a7ecbeb9f70ba80f390242114f049c0dbb13058a663fb7f23100080968e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-crypto-api-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
