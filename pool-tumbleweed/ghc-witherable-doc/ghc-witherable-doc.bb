SUMMARY = "Haskell witherable library documentation"
DESCRIPTION = "This package provides the Haskell witherable library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-witherable-doc-0.5-2.3.noarch.rpm"
RPM_HASH = "f130c4b08d4b3f3b472894c88428845f7575bafbcbc5ef26ead9144fed7015b1ec18e6e1f678feb16cd45139fef713802ed533bbcfa30dadc354e4e5b1f8beeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-witherable-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
