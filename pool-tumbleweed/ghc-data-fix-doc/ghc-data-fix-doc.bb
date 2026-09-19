SUMMARY = "Haskell data-fix library documentation"
DESCRIPTION = "This package provides the Haskell data-fix library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-data-fix-doc-0.3.4-3.3.noarch.rpm"
RPM_HASH = "09e82a301972465973e40a0adbc5a7694c983a3de5cb6119399fb3edc8cdf161eb53e9c9a38c82196f2de42d6d00f6b09203eaf5618d613e90141e93e3db2630"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-data-fix-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
