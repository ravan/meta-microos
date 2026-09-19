SUMMARY = "Haskell contravariant library documentation"
DESCRIPTION = "This package provides the Haskell contravariant library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.5.6"

RPM_NAME = "ghc-contravariant-doc-1.5.6-1.3.noarch.rpm"
RPM_HASH = "9dc9ce5c1546ee819f768afe5780b835b4f944b929879c8b38b7b4963b40b644bd0ba6b3f07265d459545bef5b84f901b1aa41ce98ec55fba99bf5ba1ab117d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-contravariant-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
