SUMMARY = "Haskell megaparsec library documentation"
DESCRIPTION = "This package provides the Haskell megaparsec library documentation."
LICENSE = "BSD-2-Clause"

PV = "9.7.1"

RPM_NAME = "ghc-megaparsec-doc-9.7.1-1.2.noarch.rpm"
RPM_HASH = "3876a9adaad2c6cd4954ffbdcdb8c2d1171d767e2b96b94bc14386bc9fb2cc1a08150318a3dd0691208c4ca35d7a1550902441eaf1fcf9f08e5081ed57366ecb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-megaparsec-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
