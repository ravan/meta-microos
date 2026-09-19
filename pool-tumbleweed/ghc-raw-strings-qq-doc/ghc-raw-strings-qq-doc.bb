SUMMARY = "Haskell raw-strings-qq library documentation"
DESCRIPTION = "This package provides the Haskell raw-strings-qq library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-raw-strings-qq-doc-1.1-1.11.noarch.rpm"
RPM_HASH = "e38ad797dfe779d17fe0aa01f4718f9d764f0bcf596773fccd8844ea648f405c3700141f5c6c3876c44018eaef99577b89f33f2c95fbb82fa36f410ae9d7b0d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-raw-strings-qq-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
