SUMMARY = "Haskell library documentation meta package"
DESCRIPTION = "Installing this package causes ghc-*-doc packages corresponding to \
ghc-*-devel packages to be automatically installed too."
LICENSE = "BSD-3-Clause"

PV = "9.12.4"

RPM_NAME = "ghc-doc-9.12.4-1.3.noarch.rpm"
RPM_HASH = "06cd15c6498ef4f1d797cd73ecdb49c2c3b8cf0fc681f16fdcc71a4e831fe8e8fef86a6b8d714be7f20442e7d6a0d6d3aa8867e0020467d0ad7b1760ffa0a350"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-doc"

RDEPENDS:${PN} += ""

inherit rpm
