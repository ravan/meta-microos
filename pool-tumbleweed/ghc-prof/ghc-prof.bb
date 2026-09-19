SUMMARY = "GHC profiling libraries meta package"
DESCRIPTION = "Installing this package causes ghc-*-prof packages corresponding to \
ghc-*-devel packages to be automatically installed too."
LICENSE = "BSD-3-Clause"

PV = "9.12.4"

RPM_NAME = "ghc-prof-9.12.4-1.3.aarch64.rpm"
RPM_HASH = "347bc719d4728aab3c8b45713dfb83c2b579c3ece5a36a81493332f8ed3b05e5068c44dba52f949bae43bbff515c5c94918ce8be3528a620f681984c349f2dcd"

RPROVIDES:${PN} += "ghc-prof"

RDEPENDS:${PN} += "ghc-compiler"

inherit rpm
