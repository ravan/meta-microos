SUMMARY = "Haskell optics-core library documentation"
DESCRIPTION = "This package provides the Haskell optics-core library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.2"

RPM_NAME = "ghc-optics-core-doc-0.4.2-1.3.noarch.rpm"
RPM_HASH = "226c5d74a06e97499929842c279adcc6e0902c5799ae3453315d80da429f4258d17f7abbd01f10fa2ea6aff6fef97cbca413080c1877d7510a1b05f759243409"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-optics-core-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
