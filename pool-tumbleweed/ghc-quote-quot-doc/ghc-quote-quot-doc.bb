SUMMARY = "Haskell quote-quot library documentation"
DESCRIPTION = "This package provides the Haskell quote-quot library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.0"

RPM_NAME = "ghc-quote-quot-doc-0.2.1.0-1.21.noarch.rpm"
RPM_HASH = "dd08ffc7c6aec05f3ce2824f2a401356e13f397b07ee5baa83f7486dff9f1e9fda2c726711433f8490e49481e1aa1bdfe64bf46b3efb2614ee1a9adb1b5f0bf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-quote-quot-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
