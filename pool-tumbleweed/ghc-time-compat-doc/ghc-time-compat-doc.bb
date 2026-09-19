SUMMARY = "Haskell time-compat library documentation"
DESCRIPTION = "This package provides the Haskell time-compat library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.9.9"

RPM_NAME = "ghc-time-compat-doc-1.9.9-1.3.noarch.rpm"
RPM_HASH = "d20ab8270eaf048e99a97bd2e5b59c43799276a2e07719b4d31554b664b36a04fde2879539fd2da1db782d894efa4b42ab38a3314933fec960414a32396373ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-time-compat-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
