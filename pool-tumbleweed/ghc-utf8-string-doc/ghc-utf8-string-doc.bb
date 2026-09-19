SUMMARY = "Haskell utf8-string library documentation"
DESCRIPTION = "This package provides the Haskell utf8-string library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-utf8-string-doc-1.0.2-2.35.noarch.rpm"
RPM_HASH = "0c3128e995f4b1af5f332a017eb47aea91cda734b30578d97b7d85857d3186fa9337e8c3892e51299c16503756d4d159da662ecf49b310f12c975cbc369e4203"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-utf8-string-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
