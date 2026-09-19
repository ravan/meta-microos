SUMMARY = "Haskell OneTuple library documentation"
DESCRIPTION = "This package provides the Haskell OneTuple library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.3"

RPM_NAME = "ghc-OneTuple-doc-0.4.3-1.3.noarch.rpm"
RPM_HASH = "31a86e88a3757ac6e72fcfd85ee82418bcd7fb551e5fadefa1ea91d0819efe76cd8e2bf6da7aa851a3813249f27dd45256064a75a10aae7d3cfa9851b446fca9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-OneTuple-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
