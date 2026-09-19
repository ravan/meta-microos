SUMMARY = "Haskell th-expand-syns library documentation"
DESCRIPTION = "This package provides the Haskell th-expand-syns library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.12.0"

RPM_NAME = "ghc-th-expand-syns-doc-0.4.12.0-2.3.noarch.rpm"
RPM_HASH = "935a48d8f4f37ab300724d8d768baeb75c8d45f10f55bd7841c5a495894b367e99f55ea6f372a21ec13128454145264e5c71792cb18357b1e41a3f5c7fd6a64d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-th-expand-syns-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
