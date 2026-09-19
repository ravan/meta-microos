SUMMARY = "Haskell ghc-boot-th library documentation"
DESCRIPTION = "This package provides the Haskell ghc-boot-th library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.12.4"

RPM_NAME = "ghc-ghc-boot-th-doc-9.12.4-1.3.noarch.rpm"
RPM_HASH = "f7e43a4e9fff4ea2a945cb070581bda15fee758af3a2f6fc8b1b8b61684764acf0fdf4949834121337a00cc9bdb5159502bd771a803ffefeef050efdc0115788"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-boot-th-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
