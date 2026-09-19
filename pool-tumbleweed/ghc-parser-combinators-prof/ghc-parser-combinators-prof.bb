SUMMARY = "Haskell parser-combinators profiling library"
DESCRIPTION = "This package provides the Haskell parser-combinators profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "ghc-parser-combinators-prof-1.3.1-1.2.aarch64.rpm"
RPM_HASH = "5b57c68bd9681e02ba441a712c2b873515c1851768d8880206ed32baae836179ce66de0414687ff275abe3cbc875f340f217ae0374723eee6b1da26547fa55af"

RPROVIDES:${PN} += "ghc-parser-combinators-prof \
ghc-prof-parser-combinators-1.3.1-L2vTYvTgTG7FdcDqlc42x9"

RDEPENDS:${PN} += "ghc-parser-combinators-devel \
ghc-prof-base-4.21.2.0-8844"

inherit rpm
