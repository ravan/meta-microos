SUMMARY = "Haskell SafeSemaphore library documentation"
DESCRIPTION = "This package provides the Haskell SafeSemaphore library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.10.1"

RPM_NAME = "ghc-SafeSemaphore-doc-0.10.1-5.35.noarch.rpm"
RPM_HASH = "83d5fb52cd5d2242e5c02d0399d598b35aa7500d874519b95546f5b78624623b78c9bb83891b4bc7a78a8068915441b5b3d15b929dc43592567f3d68fced06b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-SafeSemaphore-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
