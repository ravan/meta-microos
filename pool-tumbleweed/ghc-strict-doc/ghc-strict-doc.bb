SUMMARY = "Haskell strict library documentation"
DESCRIPTION = "This package provides the Haskell strict library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.1"

RPM_NAME = "ghc-strict-doc-0.5.1-2.16.noarch.rpm"
RPM_HASH = "a0633784a5ae1cc963fe54d637564717b14bc96c7fa6d2f9be84e6f31577967f6ae362404f996b8339a208be3534894627e277918b53e1d8ba03d1fb51db4197"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-strict-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
