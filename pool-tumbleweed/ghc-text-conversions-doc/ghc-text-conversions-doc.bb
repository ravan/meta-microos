SUMMARY = "Haskell text-conversions library documentation"
DESCRIPTION = "This package provides the Haskell text-conversions library documentation."
LICENSE = "ISC"

PV = "0.3.1.1"

RPM_NAME = "ghc-text-conversions-doc-0.3.1.1-2.23.noarch.rpm"
RPM_HASH = "b6c05e4173b1831fd8162bb0381b0bfbe2d1cd18a8a90337f520428bc9d3fda2aa9b85624e1f1ebe22f39dba5b59cb48862ebcca5172f01edd82bb2617da0738"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-text-conversions-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
