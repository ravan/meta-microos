SUMMARY = "Haskell clock library documentation"
DESCRIPTION = "This package provides the Haskell clock library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.4"

RPM_NAME = "ghc-clock-doc-0.8.4-1.19.noarch.rpm"
RPM_HASH = "3f538a9c9a8ec035f3738e5a4139f1fd0986dfa09d8b4df2cd7433d746c05d05b8fba0ddcbeaca95dce5543f9af636582106660fba1767e2468f411e3cf1e891"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-clock-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
