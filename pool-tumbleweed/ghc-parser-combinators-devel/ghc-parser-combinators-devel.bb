SUMMARY = "Haskell parser-combinators library development files"
DESCRIPTION = "This package provides the Haskell parser-combinators library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "ghc-parser-combinators-devel-1.3.1-1.2.aarch64.rpm"
RPM_HASH = "ab579f792532ea09eb46683b882c78588ee63e3338e5ffe8bf945994893de8018ba618124ebe07963b7c884809ad836cf5cc2e7e5314d3cc88fdeaaa9f06234b"

RPROVIDES:${PN} += "ghc-devel-parser-combinators-1.3.1-L2vTYvTgTG7FdcDqlc42x9 \
ghc-parser-combinators-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-parser-combinators"

inherit rpm
